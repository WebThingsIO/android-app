package io.webthings.app.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.webthings.app.utils.MainViewModel


@Composable
fun NavigationHost(
    navController: NavController,
    viewModel: MainViewModel
){
    NavHost(
        navController = navController as NavHostController,
        startDestination = NavRoutes.DrawerItems.ThingsScreen.route){
        composable(NavRoutes.DrawerItems.ThingsScreen.route){ /* TODO */}
    }

}