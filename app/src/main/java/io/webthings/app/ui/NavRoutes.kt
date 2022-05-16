package io.webthings.app.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import io.webthings.app.R

sealed class NavRoutes(val route:String, val title:String){

    sealed class DrawerItems(
        route: String,
        title: String,
        val icon: Any):
        NavRoutes(route, title){
            object ThingsScreen: DrawerItems("Dashboard",
                "Things",
                R.drawable.things_icon
            )
            object GwSettingsScreen: DrawerItems("GwSettings",
                "Settings",
                Icons.Default.Settings)
    }

}

val drawerMenuItems = listOf(
    //TODO add other drawer menu entry
    NavRoutes.DrawerItems.ThingsScreen,

)