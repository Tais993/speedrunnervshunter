package tijsbeek.nl.speedrunnervshunter;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import tijsbeek.nl.speedrunnervshunter.hunterhandler.HunterHandler;
import tijsbeek.nl.speedrunnervshunter.speedrunnerhandler.SpeedrunnerHandler;

public class OnPlayerMove implements Listener {

    HunterHandler hunterHandler = new HunterHandler();
    SpeedrunnerHandler speedrunnerHandler = new SpeedrunnerHandler();

    Location oldLocationSpeedrunner;

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        if (hunterHandler.isHunter(player.getUniqueId())) {
            player.setCompassTarget(speedrunnerHandler.getLocationSpeedrunner());
        }

        Location location = new Location(e.getFrom().getWorld(), 10, 0, 0);
        e.getPlayer().setCompassTarget(location);
    }
}
