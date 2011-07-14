package net.minedev.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import couk.Adamki11s.Extras.Player.ExtrasPlayer;

public class SetCommand implements CommandExecutor {

	ExtrasPlayer extrasPlayer = new ExtrasPlayer();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("headgear") || cmd.getName().equalsIgnoreCase("hg"))
		{
			if (args[0].equalsIgnoreCase("set"))
			{
			extrasPlayer.setBlockOnPlayerHead((Player)sender, setType(args[1]));

			}
		}
		return false;
	}

	public Material setType(String materialName)
	{

		Material m = Material.AIR;
		if (materialName.equalsIgnoreCase("BEDROCK")) { m = Material.BEDROCK;
		} else {
			if (materialName.equalsIgnoreCase("GLOW")) { m = Material.GLOWSTONE;
			} else {
				if (materialName.equalsIgnoreCase("INVISIBLE")) { m = Material.GLASS;
				} else {
					if (materialName.equalsIgnoreCase("SUPERSPEED")) { m = Material.DIAMOND;
					}

				}
			}
		}
		return m;
	}
}