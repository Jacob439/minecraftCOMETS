package com.gmail.jakesisawesome1.minecraftCOMETS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class compToYear implements CommandExecutor {
    String[] comps = new String[]{"INFINITE RECHARGE", "INFINITE RECHARGE", "DESTINATION: DEEP SPACE", "FIRST POWER UP", "FIRST STEAMWORKS",
            "FIRST STRONGHOLD", "RECYCLE RUSH", "AERIAL ASSIST", "ULTIMATE ASCENT", "REBOUND RUMBLE", "LOGO MOTION",
            "BREAKAWAY", "LUNACY", "FIRST OVERDRIVE", "RACK \"N\" ROLL", "AIM HIGH", "TRIPLE PLAY", "FIRST FRENZY",
            "STACK ATTACK", "ZONE ZEAL", "DIABOLICAL DYNAMICS", "CO-OPERTITION FIRST", "DOUBLE TROUBLE", "LADDER LOGIC",
            "TOROID TERROR", "HEXAGON HAVOC", "RAMP N’ ROLL", "TOWER POWER", "RUG RAGE", "MAIZE CRAZE"};
    String[] bots = new String[]{"NEOWISE", "BORISOV", "WIRTANEN", "CHIRON", "DONATI", "CATALINA", "HALEYBOT", "SOZIN", "ISON"};
    ArrayList<String> years = new ArrayList<>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (args.length == 0) {
            sender.sendMessage("Not enough arguments for robot command, format is /comp {COMP NAME}");
            return true;
        }
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            temp.append(args[i]);
            if (i != args.length - 1)
                temp.append(" ");
        }
        for (int i = 2021; i > 1992 - 1; i--){
            years.add(((Integer)i).toString());
        }
        String arg = temp.toString().toUpperCase();
        boolean found = false;
        for (int i = 0; i < comps.length; i++) {
            if(arg.equals(comps[i]) && i < bots.length){
                found = true;
                sender.sendMessage(bots[i] + " - " + years.get(i));
            } else if (arg.equals(comps[i])){
                found = true;
                sender.sendMessage(years.get(i));
            }
        }
        if (!found)
            sender.sendMessage("invalid argument, format is /comp {COMP NAME}");

        return true;
    }
}
