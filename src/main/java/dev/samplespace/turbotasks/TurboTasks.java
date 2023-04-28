package dev.samplespace.turbotasks;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIBukkitConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class TurboTasks extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandAPI.onLoad(new CommandAPIBukkitConfig(this).silentLogs(true));
        CommandAPI.onEnable();
    }

    @Override
    public void onDisable() {
        CommandAPI.onDisable();
    }
}
