package krekks.easyparkour.event;

import krekks.easyparkour.system.menusystem.menu.LevelSelectionMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import static krekks.easyparkour.misc.GoBack.goToCheckPoint;
import static krekks.easyparkour.misc.ItemMaker.*;
import static krekks.easyparkour.system.menusystem.MenuManager.getMenuUtility;

public class Interact implements Listener {
    @EventHandler
    void interactEvent(PlayerInteractEvent e){
        if(e.getItem() == null) return;
        //go back
        if (e.getItem().getItemMeta().equals(checkpointItem.getItemMeta())) {
            goToCheckPoint(e.getPlayer());
            e.setCancelled( true);
        }
        //level selector
        if (e.getItem().getItemMeta().equals(levelSelector.getItemMeta())) {
            Player player = e.getPlayer();
            LevelSelectionMenu menu = new LevelSelectionMenu(getMenuUtility(player));
            menu.openMenu();
        }

    }
    @EventHandler
    void noPlace(BlockPlaceEvent e){
        if(!e.getPlayer().hasPermission("krekks.perms")){
            e.setCancelled(true);
        }
    }
}
