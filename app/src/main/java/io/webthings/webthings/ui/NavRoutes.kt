package io.webthings.webthings.ui

import androidx.compose.ui.res.stringResource
import io.webthings.webthings.R
import kotlin.math.absoluteValue

sealed class NavRoutes(val route:String, val title:String){
    object HomeScreen : NavRoutes("home", "Home")
    object DashboardScreen: NavRoutes("Dashboard", "Main Dashboard")
}

val drawerMenuItems = listOf(
    //TODO add other drawer menu entry
    NavRoutes.DashboardScreen
)