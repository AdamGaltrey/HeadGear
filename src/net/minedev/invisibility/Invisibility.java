package net.minedev.invisibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.server.Packet20NamedEntitySpawn;
import net.minecraft.server.Packet29DestroyEntity;

import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Invisibility {
	
	private HashMap<Player, Boolean> isInvisible = new HashMap<Player, Boolean>();
	
	public void makeInvisible(Player p){
		CraftPlayer cp = (CraftPlayer)p;
		ArrayList<CraftPlayer> serverPlayers = new ArrayList<CraftPlayer>();
		
		//Put all the players except our players to turn invisible into an arraylist of type 'CraftPlayer'
		for(Player player : p.getServer().getOnlinePlayers()){
			if(player.getName() != p.getName()){
				serverPlayers.add(((CraftPlayer)player));
			}
		}
		
		//Send an entity destroy packet to every player but the one to turn invisible so they do not see the player.
		for(CraftPlayer craftP : serverPlayers){
			craftP.getHandle().netServerHandler.sendPacket(new Packet29DestroyEntity(cp.getEntityId()));
		}
		
		//Add them to the hashmap for later checking.
		isInvisible.put(p, true);
	}
	
	public void makeVisible(Player p){
		if(isInvisible(p)){
			CraftPlayer cp = (CraftPlayer)p;
			ArrayList<CraftPlayer> serverPlayers = new ArrayList<CraftPlayer>();
			
			for(Player player : p.getServer().getOnlinePlayers()){
				if(player.getName() != p.getName()){
					serverPlayers.add(((CraftPlayer)player));
				}
			}
			
			for(CraftPlayer craftP : serverPlayers){
				craftP.getHandle().netServerHandler.sendPacket(new Packet20NamedEntitySpawn(cp.getHandle()));//Send a spawn packet to players making the player visible again.
			}
			
			isInvisible.remove(p); //Remove the player from the hashmap
		}
	}
	
	public boolean isInvisible(Player p){
		if(isInvisible.containsKey(p)){
			if(isInvisible.get(p)){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public void sendInvisibilityPackets(Player logger){ //To make invisible players invisible to anyone logs in also.
		for(Map.Entry<Player, Boolean> invis : isInvisible.entrySet()){ //Iterate over the hashmap
			if(invis.getValue() == true){ //If the player is true then send a packet to the player logging in to make that player invisible to the new player.
				((CraftPlayer)logger).getHandle().netServerHandler.sendPacket(new Packet29DestroyEntity(((CraftPlayer)invis.getKey()).getEntityId()));
			}
		}
	}

	
}
