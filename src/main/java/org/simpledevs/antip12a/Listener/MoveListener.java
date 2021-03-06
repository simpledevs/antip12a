package org.simpledevs.antip12a.Listener;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.simpledevs.antip12a.Main;

public class MoveListener implements Listener
{
    Main plugin;

    public MoveListener (Main plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e)
    {
        Player p = e.getPlayer();
        String s = p.getName();

        if (!p.hasPermission("AntiP12a.ignoreplayer"))
        {
            if (!plugin.names.contains(s))
            {
                Location knark = e.getFrom();
                e.setTo(knark);
            }
        }
    }
}
