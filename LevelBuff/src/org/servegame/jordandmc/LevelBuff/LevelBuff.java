package org.servegame.jordandmc.LevelBuff;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LevelBuff extends JavaPlugin{
	private final MobListener playerListener = new MobListener(this);
	
	@Override
	public void onDisable() {
		
	}

	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_PICKUP_ITEM, playerListener, Event.Priority.Normal, this);
		
	}
}
