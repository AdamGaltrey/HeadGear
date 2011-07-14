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
		if (cmd.getName().equalsIgnoreCase("set"))
		{

			extrasPlayer.setBlockOnPlayerHead((Player)sender, 5);

		}
		return false;
	}

	public Material setType(String materialName)
	{

		Material m = null;
		if (materialName.equalsIgnoreCase("PLANKS")) { m = Material.WOOD;
		} else {
			if (materialName.equalsIgnoreCase("WOOL")) { m = Material.WOOL;
			} else {
				if (materialName.equalsIgnoreCase("GLASS")) { m = Material.GLASS;
				} else {
					if (materialName.equalsIgnoreCase("BOOKSHELF")) { m = Material.BOOKSHELF;
					}

				}
			}
		}
		return m;
	}
}