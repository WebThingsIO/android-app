package io.webthings.app.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavRoutes(val route: String, val title: String){
    sealed class DrawerItems(
        route: String,
        title: String,
        val icon: ImageVector): NavRoutes(route, title){
            object ThingsScreen: DrawerItems("Things",
            "Things",
                Icons.Default.Face)
        }
}

val drawerMenuItems = listOf(
    NavRoutes.DrawerItems.ThingsScreen
)