package io.webthings.app.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import io.webthings.app.ui.NavRoutes
import io.webthings.app.ui.screens.ThingsScreen
import io.webthings.app.ui.screens.GwSettingsScreen


@Composable
fun NavigationHost(navController: NavController, viewModel: MainViewModel) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = NavRoutes.DrawerItems.ThingsScreen.route
    ) {
        composable(NavRoutes.DrawerItems.ThingsScreen.route) { ThingsScreen(viewModel = viewModel) }
        composable(NavRoutes.DrawerItems.GwSettingsScreen.route) { GwSettingsScreen(viewModel = viewModel) }
    }
}