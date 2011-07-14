package net.minedev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ListCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("headgear") || cmd.getName().equalsIgnoreCase("hg"))
		{
			if (args.length == 1)
			{
				if (args[0].equalsIgnoreCase("list"))
				{
					Player p = (Player)sender;
					ChatColor a = ChatColor.AQUA;
					p.sendMessage(a + "");
					p.sendMessage(a + "");
				}
			}
		}
		return false;
	}

}
