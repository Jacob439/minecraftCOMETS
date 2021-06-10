package com.gmail.jakesisawesome1.minecraftCOMETS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class yearToBot implements CommandExecutor {
    String[] comps = new String[]{"INFINITE RECHARGE", "INFINITE RECHARGE", "Destination: Deep Space", "FIRST POWER UP", "FIRST STEAMWORKS",
            "FIRST STRONGHOLD", "RECYCLE RUSH", "AERIAL ASSIST", "ULTIMATE ASCENT", "REBOUND RUMBLE", "LOGO MOTION",
            "BREAKAWAY", "LUNACY", "FIRST Overdrive", "Rack \"N\" Roll", "Aim High", "Triple Play", "FIRST Frenzy",
            "Stack Attack", "Zone Zeal", "Diabolical Dynamics", "Co-opertition FIRST", "Double Trouble", "Ladder Logic",
            "Toroid Terror", "Hexagon Havoc", "Ramp N’ Roll", "Tower Power", "Rug Rage", "Maize Craze"};
    String[] bots = new String[]{"NEOWISE", "BORISOV", "WIRTANEN", "CHIRON", "DONATI", "CATALINA", "HALEYBOT", "SOZIN", "ISON"};
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        ArrayList<String> years = new ArrayList<>();
        if (args.length == 0) {
            sender.sendMessage("Not enough arguments for robot command, format is /robot {YEAR}");
            return true;
        }
        if (args.length > 1) {
            sender.sendMessage("Too many arguments for robot command, format is /robot {YEAR}");
            return true;
        }

        for (int i = 2021; i > 1992 - 1; i--){
            years.add(((Integer)i).toString());
        }
        String arg = args[0];
        boolean found = false;
        for (int i = 0; i < years.size(); i++) {
            if(arg.equals(years.get(i)) && i < bots.length){
                found = true;
                sender.sendMessage(bots[i] + " - " + comps[i]);
            } else if (arg.equals(years.get(i))){
                found = true;
                sender.sendMessage(comps[i]);
            }
        }
        if (!found)
            sender.sendMessage("invalid argument, format is /robot {YEAR}");
        return true;
    }
}
