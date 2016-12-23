## To-Do list

1. Core finish up
2. - Commands need to be finished
- List of commands - 

\\NOTICE ; List of ranks that have access to individual Cmds are listed below. Along with functionality of each Cmd. @everyone is meaning all ranks!\\

- AddCoinsCmd
(Admin, Support, Owner) 
This command used when user types /addcoins
This command enables the user to add coins to a selected players balance account.
/addcoins <player> <amount>

- AddBudderCmd
- (Admin, Support, Owner)
This command used when user types /addbudder
This command enables the user to add tokens to a selected players balance account.
/addbudder <player> <amount>

- RemovebudderCmd
- (Admin, Support, Owner)
This command used when user types /removebudder
This command enables the user to remove tokens from a selected players balance account.
/removebudder <player> <amount>

- RemoveCoinsCmd
- (Admin, Support, Owner)
This command used when user types /removecoins
This command enables the user to remove coins from a selected players balance account.
/removecoins <player> <amount>


- BuildCmd
- (Builder, Admin, Support, Owner, GM)
-This command used when user types /build
This command enables the user to change to gamemode c when in maintanence mode only. When the build command is used, it automaticly changes user to gamemode C, when sent again, it reverses back to gamemode A.
/build

- BalanceCmd
  (@everyone)
- This command used when user types /balance
 This command enables the user to view the amount of tokens and coins they have.
/balance

- GameModeCmd
- (Admin, Support, Owner)
This command used when user types /gamemode
This command enables the user to change gamemode.
/gamemode <mode> 
(Owner, Support Only -->) - /gamemode <player> <mode>

- HelpCmd
- (@everyone)
This command used when user types /Help 
This command enables the user to view a list of commands based on their rank.
/help

- InfoCmd
- (GM, Admin, Support, Owner)
This command used when user types /Info
This command enables the user to view a players status on the network, via time spent on server, number of punishments, coins, budder, rank.
/Info <player> 

- LoadWorldCmd
- (Support, Owner)
This command used when user types /Loadworld
This command enables the user to load a world from a saved world file on the consol.
/loadworld <nameofworld> 

- MaintenanceCmd
- (Admin, Support, Owner)
This command used when user types /maintenance
This command enables the user to enable maintenace mode on the server the user is currently on.
/maintenace <on/off>

- MemoryCmd
- (Support, Owner)
This command used when user types /memory
This command enables the user to view the amount of ram, disk, and memory left or is being used in real time.
/memory

- PunishCmd
- (GM, Admin, Support, Owner)
This command used when user types /punish
This command enables the user to select a player to punish in the event a player breaks the rules. This command when used opens up a GUI (chest box) on the users screen,
enabling the user to view the actions aloud to be givin based on rank. There are 3 levels of punishment. Minor, Medium, Severe. On this GUI, the box will show with
the players head, name, amount of time played, previous punishments from other staff members in according to when they were givin. Glass colored 
green=Minor, yellow=Medium, red=Severe. For GM, only minor punishments can be selected, for Admin, only Minor and Medium can be selcted. For Support and Owner, any punishment
can be seleted on the GUI. This GUI should also include a kick option for Admin+. There are two sections for the glass GUI section. A mute, and a ban.
If someone is minorly muted, they will be muted for 6hours. If they are Mediumly muted, they will be muted for 12hours. If they are Severly muted, it will be permanant.
This is also the same for the Ban section. If minor, they will be banned for 6hours, etc.
ONLY Admin+ can remove punishments from players name. When an admin removes the punishment the punishment should remain on the players history for future purposes.
ONLY Support+ can pardon and erase any punishments from a players name. 


- RankCmd
- (Admin, Support, Owner)
This command used when user types /rank, ranks 
This command enables the user to change a users rank manually. User CANNOT change others rank if rank is higher on priority list, see rank list for info.
/Rank <user> <rank> 

- ReloadCmd
- (Dev, Admin, Support, Owner)
This command used when user types /reload
This command enables the user to reload the server they are currently in.
/reload

- RemoveTagCmd
- (Dev, Admin, Support, Owner)
This command used when user types /removetag
This command enables the user to remove a tag from a player.
/removetag <player> 

- ReportCmd
- (@everyone)
This command used when user types /report(@everybody), /reports(staff_only) 
This command enables the user to report a player if there is suspicous activity or player is breaking the rules.
/report <player> <reason> <servername>
(GM, Admin, Support, Owner ONLY -->) /reports (lists reports being sent in real time by players including all information sent by players. This should only take up.
The staff member should only be able to view the list of reports they were online to view.)

- StaffChatCmd
- (Builder, GM, Admin, Dev, Support, Owner)
This command used when user types /SC 
This command enables the user to enable staff chat across the network.
/SC <on/off>
/SC <msg>

- PrivateMsgCmd
-(@everyone)
This commands used when user types /pm
This command enables the user to Private message anyone across the network who is online.
/PM <username> <msg>

- TagCmd
- (Admin, Dev, Support, Owner)
This command used when user types /Tag
This command enables the user to add a tag to a player. This command should RARELY be used, and would be used for special events only. This command does not give any user
and new permissions. The user should stay the within the same ranked permissions as they were ranked last. This is just an admin toy to change prefixes.
/tag <tag> example; /tag &fRank&r [Result in tablist= Rank TyFoxy]
/tag <username> <tag>

- UnloadWorldCmd
- (Admin, Support, Owner)
This command used when user types /UnloadWorld
This command enables the user to Unload a world off the server and saved into the worlds files. Can only be used during Maintenace mode.
/UnloadWorld <nameofworld>

- VanishCmd
- (GM, Admin, Dev, Support, Owner)
This command used when user types /vanish 
This command enables the user to vanish on any part of the server at any time. This should not be used to cheat. This should be used for investigational purposes only.
Cannot be used in-game unless user is spectating or dead.
/vanish


- WorldCmd
- (n/a)
This command used when user types /world
This command is most likely not needed. Please contact Ty or Squid or info.

- EffectsCmd
- (Youtuber, Vip, GM, Builder, Dev, Support, Owner)
This command used when user types /effects
This command enables the user to open a GUI to select any choice of effects depending on rank.
/effects

- StaffCmd
- (@everyone)
This command used when user types /staff 

- ListCmd
- (@everyone)
This command used when user types /list

- FriendCmd(s)
- (@everyone)
This command used when user types /friend, friends, flist, friends list, friends add, friends remove. 

- PartyCmd
- (@everyone)
This command used when user types /party, party create, party disband, partychat, party members, party add.  

- VipLoungeCmd
- (Vip, GM, Admin, Support, Owner)
This command used when user types /vip 

- StaffLoungeCmd
- (Builder, GM, Dev, Admin, Support, Owner)
This command used when user types /sLounge


3. - Rank System needs to be fixed and finished
4. - Lobby plugin needs to be fixed and finished
5. - Minigames will need to be created soon after this completion

 - Change ranks to the following list according to order, the ranks in tab should be organized as players join and quit- 
 
// In () symbols are in which the ranks should be listed on tablist //

 - Owner - &6&lOWNER &f%username (1)
 - Support - &d&lSUPPORT &f%username (2)
 - Developer - &e&lDEV &f%username (3)
 - Admin - &4&lADMIN &f%username (4)
 - GM - &b&lGM &f%username (5)
 - Builder - &2&lBUILDER &f%username (6)
 - YouTuber - &c&lYOUTUBER &f%username (7)
 - VIP - &a&lVIP&f &7%username (8)
 - Recruit(default_rank) - &8RECRUIT &7%username (9)