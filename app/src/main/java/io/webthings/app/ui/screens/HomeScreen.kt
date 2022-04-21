package io.webthings.app.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import io.webthings.app.DEVICES_PREVIEW
import io.webthings.app.ui.theme.WebthingsTheme

@Composable
fun HomeScreen(navController: NavController){
    /* TODO */
}
@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun HomeScreenPreview(){
    WebthingsTheme {
        HomeScreen(rememberNavController())
    }
}