package dev.ratas.slimedogcore.api.wrappers;

public interface SDCPluginInformation {

    /**
     * Get the version of the plugin.
     *
     * @return the plugin's version
     */
    String getPluginVersion();

    /**
     * Get the MineCraft version.
     *
     * @return the MC version
     */
    String getMCVersion();

    /**
     * Get the CraftBukkit package (e.g v1_19_R1)
     *
     * @return the CraftBukkit package
     */
    String getCraftBukkitPackage();

    /**
     * Get the name of the plugin.
     *
     * @return the name of the plugin
     */
    String getPluginName();

}
