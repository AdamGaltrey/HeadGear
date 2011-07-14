package couk.Adamki11s.Extras.Random;

import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public abstract class RandomMethods {

	public abstract int getRandomInt(int upperBound, int lowerBound);
	
	public abstract double getRandomDouble(double upperBound, double lowerBound);
	
	public abstract float getRandomFloat(float upperBound, float lowerBound);
	
	public abstract CreatureType getRandomCreature();
	
	public abstract Entity getRandomLivingEntityFromWorld(World w);
	
	public abstract Player getRandomPlayer(Server s);
	
	public abstract int getRandomBlockId();
}
