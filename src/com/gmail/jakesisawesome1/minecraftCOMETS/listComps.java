package com.gmail.jakesisawesome1.minecraftCOMETS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class listComps implements CommandExecutor {
    String[] comps = new String[]{"INFINITE RECHARGE", "INFINITE RECHARGE", "Destination: Deep Space", "FIRST POWER UP", "FIRST STEAMWORKS",
            "FIRST STRONGHOLD", "RECYCLE RUSH", "AERIAL ASSIST", "ULTIMATE ASCENT", "REBOUND RUMBLE", "LOGO MOTION",
            "BREAKAWAY", "LUNACY", "FIRST Overdrive", "Rack \"N\" Roll", "Aim High", "Triple Play", "FIRST Frenzy",
            "Stack Attack", "Zone Zeal", "Diabolical Dynamics", "Co-opertition FIRST", "Double Trouble", "Ladder Logic",
            "Toroid Terror", "Hexagon Havoc", "Ramp N’ Roll", "Tower Power", "Rug Rage", "Maize Craze"};
    ArrayList<String> years = new ArrayList<>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (args.length > 0) {
            sender.sendMessage("Too many arguments for robot command, format is /listComps");
            return true;
        }

        for (int i = 2021; i > 1992 - 1; i--){
            years.add(((Integer)i).toString());
        }
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < comps.length; i++) {
            temp.append(years.get(i)).append(" - ").append(comps[i]);
            if(i != comps.length - 1){
                temp.append(", ");
            }
        }
        sender.sendMessage(temp.toString());
        return true;
    }
}
