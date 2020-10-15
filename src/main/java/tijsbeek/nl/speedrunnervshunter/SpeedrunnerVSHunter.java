package tijsbeek.nl.speedrunnervshunter;

import org.bukkit.plugin.java.JavaPlugin;
import tijsbeek.nl.speedrunnervshunter.commands.CommandSetHunter;
import tijsbeek.nl.speedrunnervshunter.commands.CommandSetSpeedrunner;

public final class SpeedrunnerVSHunter extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnPlayerMove(), this);
        this.getCommand("sethunter").setExecutor(new CommandSetHunter());
        this.getCommand("setspeedrunner").setExecutor(new CommandSetSpeedrunner());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
