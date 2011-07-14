package net.minedev.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.util.Vector;

import couk.Adamki11s.Extras.Events.ExtrasEvents;

public class HgPlayerListener extends PlayerListener{

	ExtrasEvents extrasEvts = new ExtrasEvents();

	public void onPlayerMove(PlayerMoveEvent event)
	{

		Player p = event.getPlayer();
		if (p.getInventory().getHelmet().equals(57))
		{
			Vector dir = p.getLocation().getDirection().multiply(((3)*(0.3))/2).setY(0.1);
			p.setVelocity(dir);
		}

	}

	public void onPlayerQuit(PlayerQuitEvent event)
	{

		Player p = event.getPlayer();
		if (!p.getInventory().getHelmet().equals(315) 
				|| !p.getInventory().getHelmet().equals(311) 
				|| !p.getInventory().getHelmet().equals(319) 
				|| !p.getInventory().getHelmet().equals(323) 
				|| !p.getInventory().getHelmet().equals(307))
		{
			p.getInventory().setHelmet(null);
		}
	}
	
	public void onPlayerJoin(PlayerJoinEvent event)
	{

		Player p = event.getPlayer();
		if (!p.getInventory().getHelmet().equals(315) 
				|| !p.getInventory().getHelmet().equals(311) 
				|| !p.getInventory().getHelmet().equals(319) 
				|| !p.getInventory().getHelmet().equals(323) 
				|| !p.getInventory().getHelmet().equals(307))
		{
			p.getInventory().setHelmet(null);
		}
	}

}


