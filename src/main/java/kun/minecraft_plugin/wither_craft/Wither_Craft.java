package kun.minecraft_plugin.wither_craft;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Wither_Craft extends JavaPlugin {
    private double par;
    private int level;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        par=getConfig().getDouble("probability");
        par=new BigDecimal(par).setScale(3, RoundingMode.DOWN).doubleValue();
        level=getConfig().getInt("EntityThreshold");

        getServer().getPluginManager().registerEvents(new get_event(),this);

        getLogger().info("読み込み完了");
    }

    public void check(int v){


    }

    private class get_event implements Listener {
        @EventHandler
        public void MobSpawn(EntitySpawnEvent event) {
            int out=-1;
            Entity e=event.getEntity();
            if (e instanceof Monster) {
                out=0;
            }else if(e instanceof Mob){
                out=1;
            }else{
                out=2;
            }
            check(out);
        }
    }
}
