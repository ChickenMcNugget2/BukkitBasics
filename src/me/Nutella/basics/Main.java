package me.Nutella.basics;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		getLogger().info("Bukkit Basics enabled! Made with <3 by Cosmitic");
	}






	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		

		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("gamemode")){
            if (sender.hasPermission("bukkitbasics.gamemode")){
                if (args.length > 0){
                    if (args[0].equalsIgnoreCase("c")){
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to creative!");           
 
                    }
 
                    else if (args[0].equalsIgnoreCase("s")){
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to survival!");
                    }
 
                    else if (args[0].equalsIgnoreCase("a")){
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to adventure!");
                    return true;


                        
                }
            }

    	


                
                

	    if(cmd.getName().equalsIgnoreCase("heal")){
	    	player.setHealth(20);
	    	player.sendMessage(ChatColor.GREEN+"Healed "+player.getDisplayName());
	    	return true;
	    }
	    	
	    	
	    if(cmd.getName().equalsIgnoreCase("tp")) {
	    	if (args.length==0) {
	    		player.sendMessage(ChatColor.RED+"Please specify a player");
	    		return false;
	    		
	    	}else {	
	    		Player target2 = Bukkit.getServer().getPlayer(args[0]);
	    		if (target2==null) {
	    			player.sendMessage(ChatColor.RED+"Could not find any player's called "+args[0]);
	    			return false;
	    			
	    		}else {
	    			player.teleport(target2);
	    			player.sendMessage(ChatColor.YELLOW+"You've teleported to "+ChatColor.DARK_AQUA+target2.getName());
	    			return true;
	    		}
	    	}
	    }

	    if(cmd.getName().equalsIgnoreCase("tphere")) {
	    	if (args.length==0) {
	    		player.sendMessage(ChatColor.RED+"Please specify a player");
	    		return false;
	    		
	    	}else {	
	    		Player target = Bukkit.getServer().getPlayer(args[0]);
	    		if (target==null) {
	    			player.sendMessage(ChatColor.RED+"Could not find any player's called "+args[0]);
	    			return false;
	    			
	    		}else {
	    			player.teleport(target);
	    			player.sendMessage(ChatColor.YELLOW+"You've teleported "+ChatColor.DARK_AQUA+target.getName()+ChatColor.YELLOW+" to you.");
	    			return true;
	    		}
	    	}
	    }
            }
		}
		return false;
	}
}







		
			
	
	

