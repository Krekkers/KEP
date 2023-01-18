package krekks.easyparkour.event;

import krekks.easyparkour.misc.item.ItemMaker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static krekks.easyparkour.Config.spawn;
import static krekks.easyparkour.playerdata.PlayerDataHandler.AddToList;

public class Join implements Listener {
    @EventHandler
    void joinEvent(PlayerJoinEvent e){
        AddToList(e.getPlayer(), spawn);
        e.getPlayer().getInventory().setItem(8, ItemMaker.checkpointItem);
        e.getPlayer().getInventory().setItem(0, ItemMaker.levelSelector);
    }
}
