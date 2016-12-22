package me.camdenorrb.buddercore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.camdenorrb.buddercore.command.commands.*;
import me.camdenorrb.buddercore.config.BudderConfig;
import me.camdenorrb.buddercore.listeners.CmdListener;
import me.camdenorrb.buddercore.listeners.PlayerListener;
import me.camdenorrb.buddercore.listeners.WorldListener;
import me.camdenorrb.buddercore.mysql.MySql;
import me.camdenorrb.buddercore.store.AccountStore;
import me.camdenorrb.buddercore.store.CmdStore;
import me.camdenorrb.buddercore.store.ScoreStore;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by camdenorrb on 9/13/16.
 */
public class BudderCore extends JavaPlugin {

    private MySql MySQL;
    private AccountStore accountStore;

    private static BudderCore instance;
    private static BudderConfig budderConfig;

    private final CmdStore cmdStore = new CmdStore();
    private final ScoreStore scoreStore = new ScoreStore();
    private final File configFile = new File(getDataFolder(), "BudderConf.json");

    private static ExecutorService Executor = Executors.newCachedThreadPool();
    private static final Gson Gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    @Override
    public void onEnable() {
        instance = this;
        initFiles();
        accountStore.enable();
        registerEvents(new WorldListener(), new CmdListener(accountStore, cmdStore, budderConfig.unknownCmdMsg), new PlayerListener(accountStore));
        cmdStore.register(new BuildCmd(), new CoinsCmd(), new GamemodeCmd(), new HelpCmd(), new AddCoinsCmd(accountStore), new AddTokensCmd(accountStore), new InfoCmd(accountStore), new LagCmd(), new LoadWorldCmd(), new MaintenanceCmd(accountStore), new MemoryCmd(), new PunishCmd(), new RankCmd(MySQL, scoreStore, accountStore), new ReloadCmd(), new RemoveTagCmd(), new ReportCmd(), new StaffChatCmd(accountStore), new TagCmd(accountStore, MySQL), new UnloadWorldCmd(), new VanishCmd(), new WorldCmd());
    }

    @Override
    public void onDisable() {
        instance = null;
        MySQL.disable();
        cmdStore.disable();
        Executor.shutdown();
        scoreStore.disable();
        accountStore.disable();
    }

    public MySql mySQL() {
        return MySQL;
    }

    public static Gson gson() {
        return Gson;
    }

    public File configFile() {
        return configFile;
    }

    public CmdStore cmdStore() {
        return cmdStore;
    }

    public ScoreStore scoreStore() {
        return scoreStore;
    }

    public static BudderCore instance() {
        return instance;
    }

    public AccountStore accountStore() {
        return accountStore;
    }

    public static ExecutorService executor() {
        return Executor;
    }

    public static BudderConfig budderConfig() {
        return budderConfig;
    }

    public static void runAsync(Runnable runnable) {
        Executor.execute(runnable);
    }

    public void registerEvents(Listener... listeners) {
        for (Listener listener : listeners) getServer().getPluginManager().registerEvents(listener, instance);
    }

    private void initFiles() {
        scoreStore.enable();
        if (configFile.getParentFile() != null && !configFile.getParentFile().exists()) configFile.getParentFile().mkdirs();
        if (!configFile.exists()) try (FileWriter writer = new FileWriter(configFile)) { Gson.toJson(new BudderConfig(), writer); }
        catch (Exception ex) { ex.printStackTrace(); }
        try (FileReader reader = new FileReader(configFile)) {
            budderConfig = Gson.fromJson(reader, BudderConfig.class);
            MySQL = new MySql(budderConfig.ip, budderConfig.port, budderConfig.database, budderConfig.username, budderConfig.password);
            accountStore = new AccountStore(MySQL, scoreStore);

        } catch (Exception ex) { ex.printStackTrace(); }
    }
}
