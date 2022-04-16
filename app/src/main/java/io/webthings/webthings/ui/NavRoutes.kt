package io.webthings.webthings.ui

sealed class NavRoutes(val route:String){
    object HomeScreen : NavRoutes("homes")
    object DashboardScreen: NavRoutes("Dashboard")
}