package io.webthings.app.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import io.webthings.app.ui.NavRoutes
import io.webthings.app.ui.screens.DashboardScreen
import io.webthings.app.ui.screens.GwSettingsScreen
import io.webthings.app.ui.screens.SourceSettingScreen



@Composable
fun NavigationHost(navController: NavController, viewModel: MainViewModel){
    NavHost(
        navController = navController as NavHostController,
        startDestination = NavRoutes.DrawerItems.DashboardScreen.route
    ){
        composable(NavRoutes.DrawerItems.DashboardScreen.route) {
            DashboardScreen(viewModel = viewModel)}
        composable(NavRoutes.DrawerItems.GwSettingsScreen.route) {
            GwSettingsScreen(viewModel = viewModel) }
        composable(NavRoutes.DrawerItems.SourceSettingsScreen.route){
            SourceSettingScreen(viewModel = viewModel, source = NavRoutes.DrawerItems.SourceSettingsScreen.source)
        }
    }
}