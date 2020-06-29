package org.aj3douglas.fuck18

import org.bukkit.event.Event
import org.bukkit.event.HandlerList

/**
 * @author Aj3douglas
 * This is whats called the Fuck Event, its called when you "accidentally" put 1.8 as the server jar.
 * This event is not cancellable, and will shut down the server
 */
class FuckEvent(val version:String): Event(){
    companion object{
        val  handlers = HandlerList()
    }

    override fun getHandlers(): HandlerList {
        return handlers
    }

}