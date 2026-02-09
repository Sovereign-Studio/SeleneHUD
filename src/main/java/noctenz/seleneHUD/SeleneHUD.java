package noctenz.seleneHUD;
import org.bukkit.plugin.java.JavaPlugin;

public class SeleneHUD extends JavaPlugin {
   private static SeleneHUD instance;
   private ActionBar actionBar;

   public void onEnable() {
      instance = this;
      this.actionBar = new ActionBar(this);
      this.getServer().getPluginManager().registerEvents(this.actionBar, this);
      this.getLogger().info("SeleneHUD enabled!");
      this.getServer().getPluginManager().registerEvents(new HealthScaleListener(), this);
   }

   public void onDisable() {
      this.getLogger().info("SeleneHUD disabled.");
   }

   public static SeleneHUD getInstance() {
      return instance;
   }

   public ActionBar getActionBar() {
      return this.actionBar;
   }
}
