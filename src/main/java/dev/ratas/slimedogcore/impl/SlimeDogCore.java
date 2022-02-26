package dev.ratas.slimedogcore.impl;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import dev.ratas.slimedogcore.api.SlimeDogPlugin;
import dev.ratas.slimedogcore.api.config.SDCCustomConfigManager;
import dev.ratas.slimedogcore.api.scheduler.SDCScheduler;
import dev.ratas.slimedogcore.api.wrappers.SDCResourceProvider;
import dev.ratas.slimedogcore.api.wrappers.SDCPluginManager;
import dev.ratas.slimedogcore.api.wrappers.SDCWorldProvider;
import dev.ratas.slimedogcore.impl.config.ConfigManager;
import dev.ratas.slimedogcore.impl.scheduler.Scheduler;
import dev.ratas.slimedogcore.impl.wrappers.PluginManager;
import dev.ratas.slimedogcore.impl.wrappers.ResourceProvider;
import dev.ratas.slimedogcore.impl.wrappers.WorldProvider;

public class SlimeDogCore extends JavaPlugin implements SlimeDogPlugin {
    private final ConfigManager configManager;
    private final ResourceProvider resourceProvider;
    private final PluginManager pluginManager;
    private final WorldProvider worldProvider;
    private final Scheduler scheduler;

    public SlimeDogCore() {
        // These are all simple wrappers that do not use any bukkit code during
        // initialization.
        // As such, it is safe to initialize them at plugin instance initialization
        configManager = new ConfigManager(this);
        resourceProvider = new ResourceProvider(this);
        pluginManager = new PluginManager(this);
        worldProvider = new WorldProvider(this);
        scheduler = new Scheduler(this);
    }

    @Override
    public File getWorldFolder() {
        return getServer().getWorldContainer();
    }

    @Override
    public SDCScheduler getScheduler() {
        return scheduler;
    }

    @Override
    public SDCPluginManager getPluginManager() {
        return pluginManager;
    }

    @Override
    public SDCWorldProvider getWorldProvider() {
        return worldProvider;
    }

    @Override
    public SDCResourceProvider getResourceProvider() {
        return resourceProvider;
    }

    @Override
    public SDCCustomConfigManager getCustomConfigManager() {
        return configManager;
    }

}
