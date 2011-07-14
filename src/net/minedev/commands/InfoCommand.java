package net.minedev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor {

	ChatColor a = ChatColor.AQUA;
	ChatColor b = ChatColor.BLUE;
	ChatColor g = ChatColor.GREEN;
	ChatColor u = ChatColor.LIGHT_PURPLE;
	ChatColor r = ChatColor.RED;
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("headgear") || cmd.getName().equalsIgnoreCase("hg"))
		{
			if (args.length == 1)
			{
				if (args[0].equalsIgnoreCase("info"))
				{
					if (args[1].equalsIgnoreCase("invincible"))
					{
						p.sendMessage(g + "         ---  Invincible Info  ---");
	 					p.sendMessage(a + "If you are wearing this block on your head, you will");
						p.sendMessage(a + "be invincible to everything except admins! So you will");
						p.sendMessage(a + "only take damage from Op's and players with the permission ");
						p.sendMessage(a + "to bypass the effects of the block! ");
						p.sendMessage(r + "Will consume:" + u + " 8 Obsidian." + r + " Lasts until Logout!");
						p.sendMessage(g + "Type /hg set invincible to activate it!");
					}
					
					if (args[1].equalsIgnoreCase("glow"))
					{
						p.sendMessage(g + "         ---  Glow Info  ---");
	 					p.sendMessage(a + "If you are wearing this block on your head, you will");
						p.sendMessage(a + "glow in the dark! This will provide a mobile light");
						p.sendMessage(a + "source for you and your friends! This can be very ");
						p.sendMessage(a + "useful if you have no torches and are in the dark! ");
						p.sendMessage(r + "Will consume:" + u + " 12 Glowstone Dust." + r + " Lasts until Logout!");
						p.sendMessage(g + "Type /hg set glow to activate it!");
					}
					
					if (args[1].equalsIgnoreCase("invisible"))
					{
						p.sendMessage(g + "         ---  Invisible Info  ---");
	 					p.sendMessage(a + "If you are wearing this block on your head, you will");
						p.sendMessage(a + "be invisible to everyone except Admins Op's and players");
						p.sendMessage(a + "with the permission to bypass the effects of the block.");
						p.sendMessage(a + "This can be useful if you are hiding from enemies!");
						p.sendMessage(r + "Will consume:" + u + " 16 Glass." + r + " Lasts until Logout!");
						p.sendMessage(g + "Type /hg set invisible to activate it!");
					}
					
					if (args[1].equalsIgnoreCase("superspeed"))
					{
						p.sendMessage(g + "         ---  Superspeed Info  ---");
	 					p.sendMessage(a + "If you are wearing this block on your head, you will");
						p.sendMessage(a + "be able to travel between 2 and 4 times the normal speed!");
						p.sendMessage(a + "This is a nice ability but it can get a little laggy if used");
						p.sendMessage(a + "for long periods of time!");
						p.sendMessage(r + "Will consume:" + u + " 1 Diamond." + r + " Lasts until Logout!");
						p.sendMessage(g + "Type /hg set superspeed to activate it!");
					}
					
					
				}
			}
		}
		return false;
	}

}
