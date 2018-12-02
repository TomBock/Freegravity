package de.cybiduck.freegravity;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Freegravity extends JavaPlugin {

    private static Freegravity instance;

    @Override
    public void onEnable() {
        instance = this;
        loadCMD();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void loadCMD() {
        Bukkit.getPluginCommand("gravity").setExecutor(new gravityCMD(instance));
    }
}
