package net.minedev.commands;

import net.minedev.invisibility.Invisibility;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import couk.Adamki11s.Extras.Colour.ExtrasColour;
import couk.Adamki11s.Extras.Inventory.ExtrasInventory;
import couk.Adamki11s.Extras.Player.ExtrasPlayer;

public class SetCommand implements CommandExecutor {

	ExtrasPlayer extrasPlayer = new ExtrasPlayer();
	ExtrasInventory extrasInventory = new ExtrasInventory();
	ExtrasColour extrasColour = new ExtrasColour();
	
	Invisibility invisible = new Invisibility();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("headgear") || cmd.getName().equalsIgnoreCase("hg"))
		{
			if (args.length == 1)
			{
				if (args[0].equalsIgnoreCase("set"))
				{
					if (args[1].equalsIgnoreCase("invincible"))
					{
						if (extrasInventory.getAmountOf(p, Material.OBSIDIAN) >= 8)
						{
							extrasInventory.removeFromInventory(p, Material.OBSIDIAN, 8);
							extrasPlayer.setBlockOnPlayerHead((Player)sender, setType(args[1]));
							p.sendMessage(ChatColor.GREEN + "You have gained God-Like powers!");
						} else {
							p.sendMessage(ChatColor.RED + "You dont have enough" + ChatColor.DARK_RED + " Obsidian" + ChatColor.RED + " to do this!");
						}
					}
					
					if (args[1].equalsIgnoreCase("glow"))
					{
						if (extrasInventory.getAmountOf(p, Material.GLOWSTONE_DUST) >= 12)
						{
							extrasInventory.removeFromInventory(p, Material.GLOWSTONE_DUST, 12);
							extrasPlayer.setBlockOnPlayerHead((Player)sender, setType(args[1]));
							p.sendMessage(ChatColor.GREEN + "You have gained God-Like powers!");
						} else {
							p.sendMessage(ChatColor.RED + "You dont have enough" + ChatColor.DARK_RED + " GlowStone" + ChatColor.RED + " to do this!");
						}
					} 
					
					if (args[1].equalsIgnoreCase("invisible") && !invisible.isInvisible(p))
					{
						if (extrasInventory.getAmountOf(p, Material.GLASS) >= 16)
						{
							extrasInventory.removeFromInventory(p, Material.GLASS, 16);
							extrasPlayer.setBlockOnPlayerHead((Player)sender, setType(args[1]));
							invisible.makeInvisible(p); //Makes the player invisible
							p.sendMessage(ChatColor.GREEN + "You have gained God-Like powers!");
						} else {
							p.sendMessage(ChatColor.RED + "You dont have enough" + ChatColor.DARK_RED + " GlowStone" + ChatColor.RED + " to do this!");
						}
					} else {
						p.sendMessage(ChatColor.RED + "You are already invisible!");
					}
					
					if (args[1].equalsIgnoreCase("superspeed"))
					{
						if (extrasInventory.getAmountOf(p, Material.DIAMOND) >= 1)
						{
							extrasInventory.removeFromInventory(p, Material.DIAMOND, 1);
							extrasPlayer.setBlockOnPlayerHead((Player)sender, setType(args[1]));
							p.sendMessage(ChatColor.GREEN + "You have gained God-Like powers!");
						} else {
							p.sendMessage(ChatColor.RED + "You dont have enough" + ChatColor.DARK_RED + " Diamond" + ChatColor.RED + " to do this!");
						}
					} 
				}
			}
		}
		return false;
	}

	public Material setType(String materialName)
	{
		Material m = Material.AIR;
		if (materialName.equalsIgnoreCase("INVINCIBLE")) { m = Material.BEDROCK;
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