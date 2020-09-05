package kun.minecraft_plugin.wither_craft;

import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Wither_Craft extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new get_event(this),this);

        getLogger().info("読み込み完了");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private class get_event implements Listener {
        final Wither_Craft m;
        public get_event(Wither_Craft wither_craft) {
            m=wither_craft;
        }
        @EventHandler
        public void MobSpawn(CreatureSpawnEvent event) {
            if (event.getEntity() instanceof Monster) {
                getLogger().info("モンスターが発生しました。");
            }
        }
    }
}
