package io.webthings.webthings.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import io.webthings.webthings.DEVICES_PREVIEW
import io.webthings.webthings.ui.NavRoutes
import io.webthings.webthings.ui.theme.WebthingsTheme

@Composable
fun HomeScreen(navController: NavController){
    Text("WEBTHINGS")
}
@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun HomeScreenPreview(){
    WebthingsTheme {
        HomeScreen(rememberNavController())
    }
}