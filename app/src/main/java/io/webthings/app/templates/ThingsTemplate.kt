package io.webthings.app.templates

import android.widget.Toast
import androidx.compose.runtime.Composable
import io.webthings.app.R

abstract class ThingsTemplate(
    val source: SourceTemplate,
    val id: String,
    var name: String) {
    /*
     * Class that represent a Things
     *
     * source - SourceTemplate child class represent the source who own this things
     * id - unique ID of the property
     * name - Friendly name of the Thing
     */
    abstract var thingProperties: MutableMap<String, PropertiesTemplate>
    /* map of thing property */

    abstract fun getProperties(): List<PropertiesTemplate>
    /* method to get properties of the thing */

    abstract fun isAvailable(): Boolean
    /* method to test if the thing is available */

    fun syncProperty(properties: List<PropertiesTemplate>){
        if (!this.isAvailable()){
            Toast.makeText(
                source.context,
                source.context.getString(R.string.unavailable),
                Toast.LENGTH_LONG
            ).show()
            return
        }
        for(property in properties){
            if(!thingProperties.containsKey(property.id)){
                thingProperties.put(property.id, property)
            }
        }
    }
}