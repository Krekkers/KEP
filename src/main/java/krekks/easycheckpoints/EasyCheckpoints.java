package krekks.easycheckpoints;

import krekks.easycheckpoints.Events.Join;
import krekks.easycheckpoints.Events.Leave;
import krekks.easycheckpoints.Events.PlayerMove;
import krekks.easycheckpoints.PlayerData.PlayerDataHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.broadcastMessage;

public final class EasyCheckpoints extends JavaPlugin {

    PluginManager pluginManager = Bukkit.getPluginManager();
    public static FileConfiguration config = null;
    public static World world;
    Plugin plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Launching Better Checkpoints!");
        //setting up
        plugin = this;
        plugin.saveDefaultConfig();
        config = plugin.getConfig();
        getLogger().info("Config has been setup");
        pluginManager.registerEvents(new PlayerMove(), this);
        pluginManager.registerEvents(new Leave(), this);
        pluginManager.registerEvents(new Join(), this);
        getLogger().info("Events have been setup");;
        // if the plugin gets reloaded I want it to not break
        getLogger().info("If there are any online players they now have no checkpoint location!");
        broadcastMessage(ChatColor.GREEN + "KEC has launched!");
        for(Player p : Bukkit.getOnlinePlayers()){
            PlayerDataHandler.AddToList(p,null);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}