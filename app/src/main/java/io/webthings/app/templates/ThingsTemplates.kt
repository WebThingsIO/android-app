package io.webthings.app.templates

abstract class ThingsTemplates(
    val source: SourceTemplate,
    val id: String,
    var name: String) {
    /*
     * Class that represent a Things
     *
     * source - SourceTemplate child class represent the source who own this things
     */


}