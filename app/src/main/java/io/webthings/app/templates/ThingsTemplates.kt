package io.webthings.app.templates

/**
 * Class that represent a Things
 *
 * source - SourceTemplate child class represent the source who own this things
 */
abstract class ThingsTemplates(
    val source: SourceTemplate,
    val id: String,
    var name: String) {


}