package tijsbeek.nl.speedrunnervshunter.hunterhandler;

import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.UUID;

public class HunterO {
    UUID uuid;
    World world;

    public HunterO(Player player) {
        uuid = player.getUniqueId();
        world = player.getWorld();
    }

    public UUID getUuid() {
        return uuid;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
}
