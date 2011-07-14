package net.minedev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {

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
				if (args[0].equalsIgnoreCase("help"))
				{
					
					p.sendMessage(g + "         ---  HeadGear Help  ---");
 					p.sendMessage(a + "/hg list " + b + "Makes you temporarily Invincible!");
					p.sendMessage(a + "/hg info <name> " + b + "Makes you glow in the dark for a short time!");
					p.sendMessage(a + "/hg set <name> " + b + "Makes you invisible to all except admins!");
					p.sendMessage(r + "All the abilities consume items!!");
					p.sendMessage(r + "All the abilities end on logout!!");
					
				}

			}

		}
		return false;
	}
}
