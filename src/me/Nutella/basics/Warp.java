package me.Nutella.basics;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Warp extends JavaPlugin{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player=(Player) sender;
		if(cmd.getName().equalsIgnoreCase("setspawn")) {
			World world = player.getWorld();
            Location loc = player.getLocation();
            player.sendMessage(ChatColor.YELLOW + "eZCommand" + ChatColor.DARK_GRAY + ChatColor.BOLD + ">" + ChatColor.AQUA + " Server Spawn Successfully Set!");
            world.setSpawnLocation(loc.getBlockX(), loc.getBlockY() + 1, loc.getBlockZ());
            return true;
			
		}
		if(cmd.getName().equalsIgnoreCase("spawn")) {
            player.sendMessage(ChatColor.GOLD + "Sending you to spawn.");
            player.teleport(player.getWorld().getSpawnLocation());
		}
		return false;
		
	}

}
