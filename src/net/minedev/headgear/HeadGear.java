package net.minedev.headgear;

import net.minedev.commands.HelpCommand;
import net.minedev.commands.InfoCommand;
import net.minedev.commands.ListCommand;
import net.minedev.commands.SetCommand;
import net.minedev.listeners.HgPlayerListener;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.command.ColouredConsoleSender;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HeadGear extends JavaPlugin
{
	public void onEnable()
	{
		setupListeners();
		setupCommands();
		console.sendMessage("");
	}
	
	public void onDisable()
	{
		
	}
	
	public void setupListeners()
	{
		pm = getServer().getPluginManager();
		pm.registerEvent(Type.PLAYER_MOVE, playerlistener, Priority.Normal, this);
	}
	
	public void setupCommands()
	{
		getCommand("set").setExecutor(new SetCommand());
		getCommand("list").setExecutor(new ListCommand());
		getCommand("info").setExecutor(new InfoCommand());
		getCommand("help").setExecutor(new HelpCommand());
	}

	PluginManager pm;
	public HgPlayerListener playerlistener = new HgPlayerListener();
	CraftServer server = (CraftServer) getServer();
	ColouredConsoleSender console = new ColouredConsoleSender(server);
}
