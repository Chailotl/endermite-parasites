package com.chai.endermiteParasites;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		// Listeners
		getServer().getPluginManager().registerEvents(new DeathListener(), this);
	}
	
	@Override
	public void onDisable()
	{
		
	}
}