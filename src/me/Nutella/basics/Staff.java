package me.Nutella.basics;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Staff extends JavaPlugin {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("sc")) {
				if(args.length==0) {
					player.sendMessage(ChatColor.RED+"Please specify a message.");
					return true;
				}else {
					for (Player staff : Bukkit.getOnlinePlayers()) {
						if (staff.hasPermission("bukkitbasics.staffchat")) {
							staff.sendMessage(ChatColor.AQUA+"[S] "+ChatColor.YELLOW+player.getName()+": "+args);
							return true;
					}
				}
			}
			}
			return false;
		}
	}


