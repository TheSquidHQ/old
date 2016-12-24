package me.DavidCooll13.survivalEssentials;

import java.io.File;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

	public class SurvivalEssentials extends JavaPlugin {

		public void onEnable() {
			Bukkit.getServer().getLogger().info("SurvivalEssentials enabled.");
			Bukkit.getServer().getLogger().info("Author: Daggle of Project Butter.");

			ConfigFile homes = new ConfigFile(this.getDataFolder(), "homes.yml");
			homes.createConfig();
		}
		HashMap<Player, Player> tpa = new HashMap<Player, Player>();
		
		
		
		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "This command is for players only!");
				return true;
			}
									
			Player source = (Player) sender;
            Player target = source.getServer().getPlayer(args[0]);		
			if (cmd.getName().equalsIgnoreCase("tp")) {
		        if (args.length == 0) {
						source.sendMessage(ChatColor.RED + "Please specify a player.");
						return true;
				}
				if (target == null) {
					source.sendMessage(ChatColor.RED + "Could not find player " + args[0] + "!");
					return true;
				}
					source.teleport(target.getLocation());
					return true;
				}

			if (cmd.getName().equalsIgnoreCase("tpa")) {
// permissions here
				if (args.length == 0) {
					source.sendMessage(ChatColor.RED + "Usage: /tpa <player>");
				}
			if (args.length == 1) {
                    if (target == null) {
                    	source.sendMessage(ChatColor.RED + "Player not found.");
                    }
                    if (target != null) {
                    	tpa.put(target, source);
                    	target.sendMessage(ChatColor.GREEN + source.getName() + " is requesting to teleport to you. Type /tpaccept to accept, or /tpdeny to deny.");
                    	source.sendMessage(ChatColor.GREEN + "Teleport request sent.");
                    }
                    
			}
			}
			else if(commandLabel.equalsIgnoreCase("tpaccept")) {
				if (tpa.get(source) != null) {
					    tpa.get(source).teleport(source);
                    	source.sendMessage(ChatColor.GREEN + "You successfully accepted the teleport request.");
					    tpa.get(source).sendMessage(ChatColor.GREEN + "Your teleportation request was accepted!");
                    	tpa.put(source, null);
                    }
			}
			else if(commandLabel.equalsIgnoreCase("tpdeny")) {
				if (tpa.get(source) != null){
                	source.sendMessage(ChatColor.RED + "You successfully denied the teleport request.");
				    tpa.get(source).sendMessage(ChatColor.RED + "Your teleportation request was denied!");
                	tpa.put(source, null);
				}
			}
			return true;
		}
	}
			