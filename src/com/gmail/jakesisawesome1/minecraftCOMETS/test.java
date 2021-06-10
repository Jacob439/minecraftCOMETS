package com.gmail.jakesisawesome1.minecraftCOMETS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static org.bukkit.Bukkit.getServer;

public class test implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (args.length == 0)
            System.out.println("No arguement");
        else if (args[0].equals("one"))
            getServer().broadcastMessage("Yeah, this worked!!!");
        else
            getServer().broadcastMessage("hmmmmm, this isn't right");
        return true;
    }
}
