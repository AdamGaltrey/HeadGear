package couk.Adamki11s.Extras.Player;

import java.util.Map;

import org.bukkit.Material;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.material.MaterialData;
import net.minecraft.server.EntityLiving;

import couk.Adamki11s.Extras.Extras.Extras;
import couk.Adamki11s.Extras.Inventory.ExtrasInventory;

public class ExtrasPlayer extends PlayerMethods {

	@Override
	public boolean isOnGround(Player p) {
		if(((CraftPlayer)p).getHandle().onGround){
			return true;
		} else {
			return false;
		}
	}
	
	public void mountEntity(Player p, Entity e){
        e.setPassenger((Entity)p);
	}

	@Override
	public boolean isUnderWater(Player p) {
		// TODO Auto-generated method stub
		World w = p.getWorld();
		Location l = p.getLocation();		
		l.setY(l.getY() + 1);
		if(w.getBlockAt(l).getType() == Material.WATER || w.getBlockAt(l).getType() == Material.STATIONARY_WATER){
			return true;
		} else {
			return false;
		}
	}
	
	public void setBlockOnPlayerHead(Player p, Material m){
		p.getInventory().setHelmet(new ItemStack(m, 1));
	}

	@Override
	public void mountPlayer(Player mounter, Player target) {
		((Entity)target).setPassenger((Entity)mounter);
	}

	@Override
	public void setBlockOnPlayerHead(Player p, int id) {
		p.getInventory().setHelmet(new ItemStack(id, 1));
	}



}
