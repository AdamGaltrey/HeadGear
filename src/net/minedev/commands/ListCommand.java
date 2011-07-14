package net.minedev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ListCommand implements CommandExecutor {
	
	ChatColor a = ChatColor.AQUA;
	ChatColor b = ChatColor.BLUE;
	ChatColor g = ChatColor.GREEN;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("headgear") || cmd.getName().equalsIgnoreCase("hg"))
		{
			if (args.length == 1)
			{
				if (args[0].equalsIgnoreCase("list"))
				{
					
					p.sendMessage(g + "         ---  HeadGear List  ---");
 					p.sendMessage(a + "Invincible " + b + "Makes you temporarily Invincible!");
					p.sendMessage(a + "Glow " + b + "Makes you glow in the dark for a short time!");
					p.sendMessage(a + "Invisible " + b + "Makes you invisible to all except admins!");
					p.sendMessage(a + "Superspeed " + b + "Makes you travel at superspeed for a while!");
					p.sendMessage(g + "Type /<name> info to find out more about it!");
						
				}
			}
		}
		return false;
	}

}
