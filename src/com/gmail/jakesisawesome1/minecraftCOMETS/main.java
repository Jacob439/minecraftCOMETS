package com.gmail.jakesisawesome1.minecraftCOMETS;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    FileConfiguration config = getConfig();

    @Override
    public void onEnable(){
        //when the server enables the plugin
        this.getCommand("robot").setExecutor(new yearToBot());
        this.getCommand("year").setExecutor(new botToYear());
        this.getCommand("listRobots").setExecutor(new listRobots());
        this.getCommand("comp").setExecutor(new compToYear());
        this.getCommand("listComps").setExecutor(new listComps());
    }
    @Override
    public void onDisable(){
        //when the server stops or disables all plugins
    }
}
