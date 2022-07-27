package krekks.easycheckpoints.event;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import static krekks.easycheckpoints.EasyCheckpoints.config;
import static krekks.easycheckpoints.EasyCheckpoints.joinLogging;
import static krekks.easycheckpoints.misc.ItemMaker.makeGoBackItem;
import static krekks.easycheckpoints.playerdata.PlayerDataHandler.AddToList;
import static org.bukkit.Bukkit.getLogger;

public class Join implements Listener {
    ItemStack goBackItem = makeGoBackItem(Material.matchMaterial(config.getString("backmaterial")));
    @EventHandler
    void JoinEvent(PlayerJoinEvent e){
        //adds player to list
        if(!joinLogging) return;
        AddToList(e.getPlayer(), null);
        getLogger().info("Player : " + e.getPlayer().getName() + " Has been added to the list!");
        e.getPlayer().getInventory().setItem(8, goBackItem);
    }
}
