package com.gmail.jakesisawesome1.minecraftCOMETS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class botToYear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (args.length == 0) {
            sender.sendMessage("Not enough arguments for robot command, format is /year {ROBOT}");
            return true;
        }
        if (args.length > 1) {
            sender.sendMessage("Too many arguments for robot command, format is /year {ROBOT}");
            return true;
        }
        String arg = args[0].toUpperCase();
        switch (arg) {
            case "NEOWISE" -> sender.sendMessage("2021, INFINITE RECHARGE");
            case "BORISOV" -> sender.sendMessage("2020, INFINITE RECHARGE");
            case "WIRTANEN" -> sender.sendMessage("2019, Destination: Deep Space");
            case "CHIRON" -> sender.sendMessage("2018, FIRST POWER UP");
            case "DONATI" -> sender.sendMessage("2017, FIRST STEAMWORKS");
            case "CATALINA" -> sender.sendMessage("2016, FIRST STRONGHOLD");
            case "HALEYBOT" -> sender.sendMessage("2015, RECYCLE RUSH");
            case "ISON" -> sender.sendMessage("2014, AERIAL ASSIST");
            case "SOZIN" -> sender.sendMessage("2013, ULTIMATE ASCENT");
            default -> sender.sendMessage("Incorrect robot name");
        }

        return true;
    }
}
