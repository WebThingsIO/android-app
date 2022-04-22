package io.webthings.app.templates

import android.content.Context
import android.widget.Toast

abstract class SourceTemplate(val context: Context) {
    /*
     * Abstract class that will define a source of things
     * all source object will need to inherit from this class
     *
     * context - context of the application
     *
     */
    abstract var sourceName: String
    /* Friendly name of the source */

    abstract var sourceThings: MutableMap<String, ThingsTemplate>
    //TODO change second string to ThingsTemplate type
    //List that will contain all things owned by the source

    abstract fun getThings():List<ThingsTemplate>
    /* method to get the Things object from the source */

    abstract fun isAvailable():Boolean
    /* method to test if source is available */

    fun syncThings(things: List<ThingsTemplate>){
        /*
        *  method to check the source for all the available things
        * MUST update the sourceThings map
        */
        if (!this.isAvailable()){
            Toast.makeText(
                context,
                "TEST: " + this.sourceName,//TODO replace TEST: by string ressource
                Toast.LENGTH_LONG
            ).show()
            return
        }
        for (thing in things){
            if (!sourceThings.containsKey(thing.id)){
                sourceThings.put(thing.id, thing)
            }
        }
    }
}