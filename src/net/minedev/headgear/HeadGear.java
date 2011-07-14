package net.minedev.headgear;

import net.minedev.listeners.HgPlayerListener;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HeadGear extends JavaPlugin
{
	public void onEnable()
	{
		setupListeners();
	}
	
	public void onDisable()
	{
		
	}
	
	public void setupListeners()
	{
		pm = getServer().getPluginManager();
		pm.registerEvent(Type.PLAYER_MOVE, playerlistener, Priority.Normal, this);
	}

	PluginManager pm;
	public HgPlayerListener playerlistener = new HgPlayerListener();
}
