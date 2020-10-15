package tijsbeek.nl.speedrunnervshunter.hunterhandler;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.UUID;

public class HunterHandler {
    static ArrayList<HunterO> hunters = new ArrayList<>();
    boolean isHunter = false;

    public static void addHunter(Player hunter) {
        hunters.add(new HunterO(hunter));
    }

    public ArrayList<HunterO> getHunters() {
        return hunters;
    }

    public boolean isHunter(UUID uuid) {
        isHunter = false;
        hunters.forEach((hunter -> {
            if (hunter.getUuid().equals(uuid)) isHunter = true;
        }));
        return isHunter;
    }
}
