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
		
		addRepairRecipes();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void addRepairRecipes(){
		int[] items = new int[]{
				256, 257, 258, 267, 268, 269, 270, 271, 272, 273, 
				274, 275, 276, 277, 278, 279, 283, 284, 285, 286,
				290, 291, 292, 293, 294, 298, 299, 300, 301, 302,
				303, 304, 305, 306, 307, 308, 309, 310, 311, 312,
				313, 314, 315, 316, 317
				};
		ShapelessRecipe recipe;
		Server server = getServer();
		
		for(int i=0; i < items.length; i++){
			recipe = new ShapelessRecipe(new ItemStack(items[i]));
			recipe.addIngredient(new MaterialData(items[i]));
			server.addRecipe(recipe);
		}
	}
}
