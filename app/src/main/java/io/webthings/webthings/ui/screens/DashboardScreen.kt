package io.webthings.webthings.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import io.webthings.webthings.DEVICES_PREVIEW
import io.webthings.webthings.ui.NavRoutes
import io.webthings.webthings.ui.menus.TopBar
import io.webthings.webthings.ui.theme.WebthingsTheme

@Composable
fun DashboardScreen(navController: NavController) {
    /*
     * TODO: receive a dashboard item
     *  so we could reuse Dashboard on mutliple Dashboard
     */
    WebthingsTheme {
        Scaffold(
            topBar = { TopBar(navController = navController) },
            content = {
                Text("TODO")
            }
        )
    }
}

@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun DashboardScreenPreview(){
    WebthingsTheme {
        DashboardScreen(rememberNavController())
    }
}