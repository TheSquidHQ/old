# [BudderCore] TODO list

## Notice:
### Tags and Punishment-GUI have been removed from the list after TheSquidHQ's Request.

1. Core finish up
2. - Commands need to be finished
- List of commands - 

\\NOTICE ; List of ranks that have access to individual Cmds are listed below. Along with functionality of each Cmd. @everyone is meaning all ranks!\\

### AddCoinsCmd
(Admin, Support, Owner) 
This command used when user types /addcoins
This command enables the user to add coins (One of our currency) to a selected players balance account.
/addcoins <player> <amount>

### AddBudderCmd
(Admin, Support, Owner)
This command used when user types /addbudder
This command enables the user to add tokens to a selected players balance account.
/addbudder <player> <amount>

### RemovebudderCmd
(Admin, Support, Owner)
This command used when user types /removebudder
This command enables the user to remove tokens from a selected players balance account.
/removebudder <player> <amount>

### RemoveCoinsCmd
(Admin, Support, Owner)
This command used when user types /removecoins
This command enables the user to remove coins from a selected players balance account.
/removecoins <player> <amount>


###  BuildCmd
(Builder, Admin, Support, Owner, GM)
This command used when user types /build
This command enables the user to change to gamemode c when in maintanence mode only. When the build command is used, it automaticly changes user to gamemode C, when sent again, it reverses back to gamemode A. This command is only used by Admin+ and
builder. Builders can only use it when maintenance mode is enabled. Admin+ can use it anything even without maintenance mode
on.
/build

### BalanceCmd
  (@everyone)
This command used when user types /balance
This command enables the user to view the amount of Budder and coins they have.
/balance

### DisguiseCmd
(Youtube, Dev+)
This command is used when someone does /disguise or /d
This command lets the user disguise as a player. It randomizes letters and numbers and sets the Player Tag, Player name in chat and in tablist and sets their skin as either a Steve or Alex skin.

### UndisguiseCmd
(Youtube, Dev+)
This command is used when someone does /undisguise or /undis
This command lets the user leave disguise.

### GameModeCmd
(Admin, Support, Owner)
This command used when user types /gamemode
This command enables the user to change gamemode.
/gamemode <mode> 
(Owner, Support Only -->) - /gamemode <player> <mode>

### HelpCmd
(@everyone)
This command used when user types /Help 
This command enables the user to view a list of commands based on their rank.
/help

### InfoCmd
(GM, Admin, Support, Owner)
This command used when user types /Info
This command enables the user to view a players status on the network, via time spent on server, number of punishments, coins, budder, rank in a GUI.
/Info <player> 

### MaintenanceCmd
(Admin, Support, Owner)
This command used when user types /maintenance
This command enables the user to enable maintenace mode on the server the user is currently on. Maintenance mode (In a sense) put the server in whitelist and kicks everyone off thats not staff.
/maintenace <on/off> or /main <on/off>

### MemoryCmd
(Support, Owner)
This command used when user types /memory
This command enables the user to view the amount of ram, disk, and memory left or is being used in real time.
/memory

### PunishCmd
(GM, Admin, Support, Owner)
This command used when user types /punish

This command enable the user to punish a player in the event of said player breaks the rules. This command when used, will ban/mute/kick/warn a player of the staffs choosing.
When you do /punish, it will show everything you can do.
Ex. /punish
"This command is used to punish players. You can do Warn, Kick, Mute and Ban.
/punish (playername) (Warn/Kick/Mute/Ban) (time) (Reason)"

The time a person can use can but put with (Number)s for seconds, (Number)m, for minutes, etc. or /punish (playername) (Warn/Kick/Mute/Ban) p (Reason) for permenant.

When the user uses a warn. The player who was warned will recieve a title Saying: You have been warned! Reason: (Reason staff entered) Staff Member: (Staff Members Name who warned them.)

When the user uses a Kick. The player who was kicked will get kicked with the message saying: You have been kicked! Reason: (Reason staff entered) Staff Member: (Staff Members name who kicked them)

When the user uses ban. The player who was banned gets banned with the message saying: You have been Banned! Reason: (Reason Staff Entered) Staff Member: (Staff Members name who banned them) If you want to make an appeal go to: (Link to the ban appeal section on the forums.

Every Warn, Kick, Ban, and mute needs to be logged onto the the /punish (PlayerName) info GUI

When you do /punish (PlayerName) info, a GUI pops up with the players punishment record.

ONLY Admin+ can remove punishments from players name. When an admin removes the punishment the punishment should remain on the players history for future purposes.

ONLY Support+ can pardon and erase any punishments from a players name.

To remove a punishment: /punish (playername) remove 

To PARDON a punishment (Clear all/one of the punishment record(s)): /punish (playername) pardon (all/Punishment Label)

When a player is punished and the punishment is saved in the punishment record, it is labeled with a number.
Example: TheSqudHQ                                     TheSquidHQ
          Banned                                        Banned
          Reason: Hacking                               Reason: Spamming
          Punishment Label: 1                            Punishment Label: 2
          
### RankCmd
(Admin, Support, Owner)
This command used when user types /rank, ranks 
This command enables the user to change a users rank manually. User CANNOT change others rank if rank is higher on priority list, see rank list for info.
/Rank <user> <rank> 

### ReloadCmd
(Dev, Admin, Support, Owner)
This command used when user types /reload
This command enables the user to reload the server they are currently in.
/reload

### RemoveTagCmd
(Dev, Admin, Support, Owner)
/This command used when user types /removetag
/This command enables the user to remove a tag from a player.
/removetag <player> 

### ReportCmd
(@everyone)
This command used when user types /report(@everybody), /reports(staff_only) 
This command enables the user to report a player if there is suspicous activity or player is breaking the rules.
/report <player> <reason> <servername>
(GM, Admin, Support, Owner ONLY -->) /reports (lists reports being sent in real time by players including all information sent by players. This should only take up.
The staff member should only be able to view the list of reports they were online to view.)

### StaffChatCmd
(Builder, GM, Admin, Dev, Support, Owner)
This command used when user types /SC 
This command enables the user to enable staff chat across the network.
/SC <on/off>
/SC <msg>

### PrivateMsgCmd
(@everyone)
This commands used when user types /pm
This command enables the user to Private message anyone across the network who is online.
/PM <username> <msg>

### TagCmd
(Admin, Dev, Support, Owner)
/This command used when user types /Tag
/This command enables the user to add a tag to a player. This command should RARELY be used, and would be used for special events only. This command does not give any user
/and new permissions. The user should stay the within the same ranked permissions as they were ranked last. This is just an admin toy to change prefixes.
/tag <tag> example; /tag &fRank&r [Result in tablist= Rank TyFoxy]
/tag <username> <tag>

### VanishCmd
(GM, Admin, Dev, Support, Owner)
This command used when user types /vanish 
This command enables the user to vanish on any part of the server at any time. This should not be used to cheat. This should be used for investigational purposes only.
Cannot be used in-game unless user is spectating or dead.
Admin+ join vanished. You get alerted every 5 minutes that you are in vanish.
/vanish

### EffectsCmd (Not needed)
(Youtuber, Vip, GM, Builder, Dev, Support, Owner)
This command used when user types /effects
This command enables the user to open a GUI to select any choice of effects depending on rank.
/effects

### StaffCmd
(@everyone)
This command used when user types /staff
This command enables the user to view a chat pop-up that shows what staff members are online, also showing which part of the network they are on.
/staff

### ListCmd
(@everyone)
This command used when user types /list
This command enables the user to view what players (Including staff, donors, and VIP's) in a ordorly list from staff on top, to the donors below the staff, to regular members.
/list

### FriendCmd(s)
(@everyone)
This command used when user types /friend, friends, flist, friends list, friends add, friends remove.
This command enables the user to add, remove, msg, view other players that are on the server. This should be done as chat-pop up.
/friends (lists all friends that are online[green] and offline[red].)
/friend add <player>
/friend remove <player>
/friend msg <player> or /fmsg <player>

### PartyCmd
(@everyone)
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

### StaffLoungeCmd
(Builder, GM, Dev, Admin, Support, Owner)
This command used when user types /sLounge
This command enables the user to join the Staff lobby.
/slounge

- RingCmd
- (Youtuber, Owner)
- This command used when user types /ring (in any lobby)
This command enables the user to activate an invisible ring that pushes players of lower rank away from them. As a 5x5x5 block radius. Staff are exempt form this action.
/ring


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
