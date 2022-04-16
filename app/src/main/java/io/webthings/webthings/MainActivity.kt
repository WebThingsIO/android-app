package io.webthings.webthings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.webthings.ui.theme.WebthingsTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.webthings.webthings.ui.NavRoutes
import io.webthings.webthings.ui.screens.HomeScreen

const val DEVICES_PREVIEW = Devices.PIXEL_4_XL//Devices used for the preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebthingsTheme {
                NavApp()
            }
        }
    }
}

@Composable
fun NavApp(){
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = NavRoutes.HomeScreen.route
    ){
        composable(NavRoutes.HomeScreen.route){
            HomeScreen(navController = navController)
        }
    }
}

@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun DefaultPreview() {
    WebthingsTheme {
        NavApp()
    }
}