package me.Nutella.basics;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Vanish extends JavaPlugin {
	private ArrayList<Player> vanished = new ArrayList<Player>();
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	Player player=(Player) sender;
    if(cmd.getName().equalsIgnoreCase("vanish")) {
		if (!vanished.contains(player)) {
			for(Player online: Bukkit.getOnlinePlayers()) {
				online.hidePlayer(player);
				player.sendMessage(ChatColor.GREEN+"You vanished.");
			vanished.add(player);
				}
			}else {
				
			for(Player online: Bukkit.getOnlinePlayers()) {
				online.showPlayer(player);
				player.sendMessage(ChatColor.GREEN+"You unvanished.");
			vanished.remove(player);
			}
			}
    }
	return false;
	}
}
