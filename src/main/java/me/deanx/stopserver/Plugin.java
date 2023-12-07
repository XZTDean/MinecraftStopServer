package me.deanx.stopserver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        int timeToStop = getConfig().getInt("stop_time");
        getLogger().info(String.format("The server will stop in %ds.", timeToStop));
        Bukkit.getScheduler().runTaskLater(this, () -> {
            getLogger().info("Stopping server");
            Bukkit.getServer().shutdown();
        }, timeToStop * 20L);
    }
}
