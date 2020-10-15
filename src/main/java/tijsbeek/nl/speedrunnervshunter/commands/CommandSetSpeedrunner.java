package tijsbeek.nl.speedrunnervshunter.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static tijsbeek.nl.speedrunnervshunter.speedrunnerhandler.SpeedrunnerHandler.setSpeedrunner;

public class CommandSetSpeedrunner implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            setSpeedrunner(((Player) sender).getPlayer());
        }
        return false;
    }
}