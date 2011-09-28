package org.servegame.jordandmc.LevelBuff;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;

public class LevelBuff extends JavaPlugin{
	private final MobListener playerListener = new MobListener(this);

	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_PICKUP_ITEM, playerListener, Event.Priority.Normal, this);
		
		addArmorRecipe();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void addArmorRecipe(){
		ShapelessRecipe recipe;
		Server server = getServer();
		
		for(int i=298; i < 318; i++){
			recipe = new ShapelessRecipe(new ItemStack(i));
			recipe.addIngredient(new MaterialData(i));
			server.addRecipe(recipe);
		}
	}
}
