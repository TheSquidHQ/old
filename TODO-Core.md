# [BudderCore] TODO list

## Notice:
### Tags and Punishment-GUI have been removed from the list after TheSquidHQ's Request.

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
Just command
ONLY Admin+ can remove punishments from players name. When an admin removes the punishment the punishment should remain on the players history for future purposes.


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

- EffectsCmd
- (Youtuber, Vip, GM, Builder, Dev, Support, Owner)
This command used when user types /effects
This command enables the user to open a GUI to select any choice of effects depending on rank.
/effects

- StaffCmd
- (@everyone)
This command used when user types /staff
This command enables the user to view a chat pop-up that shows what staff members are online, also showing which part of the network they are on.
/staff

- ListCmd
- (@everyone)
This command used when user types /list
This command enables the user to view what players (Including staff, donors, and VIP's) in a ordorly list from staff on top, to the donors below the staff, to regular members.
/list

- FriendCmd(s)
- (@everyone)
This command used when user types /friend, friends, flist, friends list, friends add, friends remove.
This command enables the user to add, remove, msg, view other players that are on the server. This should be done as chat-pop up.
/friends (lists all friends that are online[green] and offline[red].)
/friend add <player>
/friend remove <player>
/friend msg <player> or /fmsg <player>

- PartyCmd
- (@everyone)
This command used when user types /party, party create, party disband, partychat, party members, party add. 
This command enables the user to create, disband, msg, and invite players and friends to a party to join them on servers. The creator of each part would be the only one who has
access to choose games once players are in this such party. When the players are in a party they will be able to see purple names on tablist signafying the players in the party.
There should be player limit of 4 people per party. Including the host.
/party create <name>
/party disband
/party join <name of party> (Only if invited)
/party leave (if player leaves the server it should automaticly remove player from party)
/party invite <player>
/party chat <msg> or /pmsg <on/off>

- StaffLoungeCmd
- (Builder, GM, Dev, Admin, Support, Owner)
This command used when user types /sLounge
This command enables the user to join the Staff lobby.
/slounge



3. - Rank System needs to be fixed and finished
- Renamed ranks, new order, new prefixes.

4. - Lobby plugin needs to be fixed and finished
- Cosmetics, daily/monthly reward NPC's (rewards based on rank, and server votes). 

5. - Minigames will need to be created soon after this completion
- Minigames are needed, BudderSlap, PinkmanSlap, Walls, SurvivalGames, Skywars.

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