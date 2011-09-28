package org.servegame.jordandmc.LevelBuff;

import net.minecraft.server.EntityExperienceOrb;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityListener;

public class MobListener extends EntityListener{
	private LevelBuff plugin;
	
	public MobListener(LevelBuff instance){
		plugin = instance;
		
		
	}
	
	@Override
	public void onEntityDeath(EntityDeathEvent event){
		if(event.getEntity() instanceof EntityExperienceOrb){
			
		}
	}
}
