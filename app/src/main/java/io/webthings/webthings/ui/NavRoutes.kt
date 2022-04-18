package io.webthings.webthings.ui

import androidx.compose.ui.res.stringResource
import io.webthings.webthings.R

sealed class NavRoutes(val route:String, title:String){
    object HomeScreen : NavRoutes("homes", stringResource(R.string.home))
    object DashboardScreen: NavRoutes("Dashboard", stringResource(R.string.main_dashboard))
}

val drawerMenuItems = listOf(
    //TODO add other drawer menu entry
    NavRoutes.DashboardScreen
)