package com.gmail.jakesisawesome1.minecraftCOMETS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class listRobots implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (args.length > 0) {
            sender.sendMessage("this command should not have any arguements, just /listRobots");
            return true;
        }
        sender.sendMessage("2021 NEOWISE, 2020 BORISOV, 2019 WIRTANEN, 2018 CHIRON, 2017 DONATI, 2016 CATALINA, 2015 HALEYBOT, 2014 SOZIN, 2013 ISON");

        return true;
    }
}