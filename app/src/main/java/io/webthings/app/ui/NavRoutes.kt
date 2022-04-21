package io.webthings.app.ui


import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import io.webthings.app.R
import android.content.res.Resources

private val _context = Resources.getSystem()

sealed class NavRoutes(val route:String, val title:String){

    object HomeScreen : NavRoutes("home",
        _context.getString(R.string.home))

    sealed class DrawerItems(
        route: String,
        title: String,
        val icon: ImageVector): NavRoutes(route, title){
        object DashboardScreen: DrawerItems("Dashboard",
            "Main Dashboard",
            Icons.Default.Face)
        object GwSettingsScreen: DrawerItems("GwSettings",
            "Settings",
            Icons.Default.Settings)
    }

}

val drawerMenuItems = listOf(
    //TODO add other drawer menu entry
    NavRoutes.DrawerItems.DashboardScreen,
    NavRoutes.DrawerItems.GwSettingsScreen
)