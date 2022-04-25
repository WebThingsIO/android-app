package io.webthings.app.templates

import android.content.Context
import android.widget.Toast

    /**
     * Abstract class that will define a source of things
     * all source module will need to inherit from this class
     */
abstract class SourceTemplate(val context: Context) {
    abstract var sourceName: String
    /* Friendly name of the source */

    abstract var sourceThings: MutableMap<String, ThingsTemplates>
    //TODO change second string to ThingsTemplate type
    //List that will contain all things owned by the source

    abstract fun getThings():List<ThingsTemplates>
    /* method to get the Things object from the source */

    fun syncThings(things: List<ThingsTemplates>){
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


    //abstract fun removeSource(): Boolean//Not sure if necessary
    /* method to delete the source properly from the system.*/

    abstract fun isAvailable(): Boolean
    /* method that inform us if the Source is available */

}