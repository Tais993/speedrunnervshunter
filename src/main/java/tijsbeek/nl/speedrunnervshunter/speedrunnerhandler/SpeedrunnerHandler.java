package tijsbeek.nl.speedrunnervshunter.speedrunnerhandler;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.UUID;

public class SpeedrunnerHandler {

    static SpeedrunnerO speedrunner;

    public static void setSpeedrunner(Player player) {
        speedrunner = new SpeedrunnerO(player);
    }

    public SpeedrunnerO getSpeedrunner() {
        return speedrunner;
    }

    public void setLocationSpeedrunner(Location location) {
        speedrunner.setLocation(location);
    }

    public void setWorldSpeedrunner(World world) {
        speedrunner.setWorld(world);
    }

    public Location getLocationSpeedrunner() {
        return speedrunner.getLocation();
    }

    public World getWorldSpeedrunner() {
        return speedrunner.getWorld();
    }

    public UUID getUUIDSpeedrunner() {
        return speedrunner.getUuid();
    }
}
