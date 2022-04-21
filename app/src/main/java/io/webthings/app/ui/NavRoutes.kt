package io.webthings.webthings.ui

import android.content.Context
import android.content.res.Resources
import androidx.compose.ui.res.stringResource
import io.webthings.webthings.R
import kotlin.math.absoluteValue

sealed class NavRoutes(val route:String, val title:String){
    object HomeScreen : NavRoutes("home",
        "home")
    object DashboardScreen: NavRoutes("Dashboard",
        "Main Dashboard")
    object GwSettingsScreen: NavRoutes("GwSettings", "Settings")
}

val drawerMenuItems = listOf(
    //TODO add other drawer menu entry
    NavRoutes.DashboardScreen,
    NavRoutes.GwSettingsScreen
)