package org.aj3douglas.fuck18

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class `Fuck1-8` : JavaPlugin() {
    override fun onEnable() {
        println("Starting up 'Fuck 1.8'")
        if (server.version.contains("1.8")) {
            repeat(10) {
                try {
                    throw RuntimeException("Get on the right version cunt")
                } catch (exc: Exception) {
                    exc.printStackTrace()
                }
            }
            Bukkit.getPluginManager().callEvent(FuckEvent(server.version))
            server.shutdown()
        }
    }

}