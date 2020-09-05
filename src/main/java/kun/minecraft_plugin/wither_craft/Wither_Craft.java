package kun.minecraft_plugin.wither_craft;

import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Random;

public final class Wither_Craft extends JavaPlugin {
    private double par;
    private int level;
    private boolean chain;
    Random r=new Random();

    @Override
    public void onEnable() {
        saveDefaultConfig();
        par=getConfig().getDouble("probability");
        par=new BigDecimal(par).setScale(3, RoundingMode.DOWN).doubleValue()/100;
        level=getConfig().getInt("EntityThreshold");
        chain=getConfig().getBoolean("chain");

        getServer().getPluginManager().registerEvents(new get_event(),this);

        getLogger().info("読み込み完了");
    }

    public void check(int v,boolean c, Location l){
        if((!chain)&&c){return;}
        if(v==level){
            if(r.nextDouble()<par){
                Wither w=(Wither)Objects.requireNonNull(l.getWorld()).spawnEntity(l, EntityType.WITHER);
                Objects.requireNonNull(w.getBossBar()).removeAll();
                getLogger().info("WITHERが召喚されました。場所："+l.getX()+","+l.getY()+","+l.getZ());
            }
        }

    }

    private class get_event implements Listener {
        @EventHandler
        public void MobSpawn(EntitySpawnEvent event) {
            if(event.getEntityType().equals(EntityType.WITHER_SKULL)){return;}
            int out=2;
            Entity e=event.getEntity();
            if (e instanceof Monster) {
                out=0;
            }else if(e instanceof Mob){
                out=1;
            }
            check(out,event.getEntityType().equals(EntityType.WITHER),event.getLocation());
        }
    }
}
