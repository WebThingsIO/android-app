package io.webthings.app.ui

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import io.webthings.app.R

sealed class NavRoutes(val route: String, val title: String){
    sealed class DrawerItems(
        route: String,
        title: String,
        val icon: Int
    ): NavRoutes(route, title){
            object ThingsScreen: DrawerItems("Things",
            "Things",
                R.drawable.things_icon)
        }
}

val drawerMenuItems = listOf(
    NavRoutes.DrawerItems.ThingsScreen
)

