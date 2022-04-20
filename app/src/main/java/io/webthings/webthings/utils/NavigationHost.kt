package io.webthings.webthings.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import io.webthings.webthings.ui.NavRoutes
import io.webthings.webthings.ui.screens.DashboardScreen
import io.webthings.webthings.ui.screens.GwSettingsScreen

@Composable
fun NavigationHost(navController: NavController, viewModel: MainViewModel){
    NavHost(
        navController = navController as NavHostController,
        startDestination = NavRoutes.DashboardScreen.route
    ){
        composable(NavRoutes.DashboardScreen.route) { DashboardScreen(viewModel = viewModel)}
        composable(NavRoutes.GwSettingsScreen.route) { GwSettingsScreen(viewModel = viewModel) }
    }
}