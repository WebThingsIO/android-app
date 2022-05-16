package io.webthings.app.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavRoutes(val route:String, val title:String){

    sealed class DrawerItems(
        route: String,
        title: String,
        val icon: ImageVector):
        NavRoutes(route, title){
            object ThingsScreen: DrawerItems("Dashboard",
                "Main Dashboard",
                Icons.Default.Face)
            object GwSettingsScreen: DrawerItems("GwSettings",
                "Settings",
                Icons.Default.Settings)
    }

}

val drawerMenuItems = listOf(
    //TODO add other drawer menu entry
    NavRoutes.DrawerItems.ThingsScreen,
    NavRoutes.DrawerItems.GwSettingsScreen
)