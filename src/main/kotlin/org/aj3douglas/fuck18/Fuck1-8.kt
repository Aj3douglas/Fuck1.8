package org.aj3douglas.fuck18

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.lang.Exception
import java.lang.RuntimeException

class `Fuck1-8`: JavaPlugin() {
    override fun onEnable() {
        if(server.version.contains("1.8")){
            repeat(10){
                try{
                    throw RuntimeException("Get on the right version cunt")
                }catch (exc:Exception){
                    exc.printStackTrace()
                }
            }
            Bukkit.getPluginManager().callEvent(FuckEvent(server.version))
            server.shutdown()
        }
    }

}