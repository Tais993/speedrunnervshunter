package tijsbeek.nl.speedrunnervshunter.speedrunnerhandler;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.UUID;

public class SpeedrunnerO {
    UUID uuid;
    Location location;
    World world;

    public SpeedrunnerO(Player player) {
        uuid = player.getUniqueId();
        location = player.getLocation();
        world = player.getWorld();
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public UUID getUuid() {
        return uuid;
    }

    public World getWorld() {
        return world;
    }

    public Location getLocation() {
        return location;
    }
}
