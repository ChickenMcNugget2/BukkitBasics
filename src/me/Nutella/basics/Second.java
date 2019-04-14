package me.Nutella.basics;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Second extends JavaPlugin {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player=(Player) sender;
		if(cmd.getName().equalsIgnoreCase("fly")){
			if(args[0].equalsIgnoreCase("on")){
				if (player.getGameMode() != GameMode.CREATIVE) {
					player.sendMessage(ChatColor.RED+"You must be in creative to execute this command!");
					return false;
				}
				player.setFlying(true);
				player.sendMessage(ChatColor.GREEN+"Fly mode enabled for "+player.getDisplayName());
		
			}else if(args[0].equalsIgnoreCase("true")){
    			player.setFlying(true);
    			player.sendMessage(ChatColor.GREEN+"Fly mode enabled for "+player.getDisplayName());
			}else {
				player.setFlying(false);
				player.sendMessage(ChatColor.GREEN+"Fly mode disabled for "+player.getDisplayName());
			}
			return true;
	}
		return false;
	}
}
