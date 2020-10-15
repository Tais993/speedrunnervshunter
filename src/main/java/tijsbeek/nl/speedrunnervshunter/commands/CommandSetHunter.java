package tijsbeek.nl.speedrunnervshunter.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static tijsbeek.nl.speedrunnervshunter.hunterhandler.HunterHandler.addHunter;

public class CommandSetHunter implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            addHunter(((Player) sender).getPlayer());
        }
        return false;
    }
}