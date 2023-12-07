package me.deanx.stopserver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("The server will stop in 20s.");
        Bukkit.getScheduler().runTaskLater(this, () -> Bukkit.getServer().shutdown(), 400);
    }
}
