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
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.webthings.ui.theme.WebthingsTheme
<<<<<<< 9d02f2866d63baf218b855948b37b10b1bc374ab
=======
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.webthings.webthings.ui.NavRoutes
import io.webthings.webthings.ui.screens.DashboardScreen
import io.webthings.webthings.ui.screens.HomeScreen

const val DEVICES_PREVIEW = Devices.PIXEL_4_XL//Devices used for the preview
>>>>>>> work on theme and Dashboard Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebthingsTheme {
<<<<<<< 36a06c279da614ed8b096666aca61df539a2d6bd
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
=======
               AppScaffold()
>>>>>>> first drawer pitch + cleaning
            }
        }
    }
}

<<<<<<< 36a06c279da614ed8b096666aca61df539a2d6bd
@Composable
<<<<<<< 9d02f2866d63baf218b855948b37b10b1bc374ab
fun Greeting(name: String) {
    Text(text = "Hello $name!")
=======
fun NavApp(){
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = NavRoutes.DashboardScreen.route
    ){
        composable(NavRoutes.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(NavRoutes.DashboardScreen.route){
            DashboardScreen(navController = navController)
        }

    }
>>>>>>> work on theme and Dashboard Screen
}
=======
>>>>>>> first drawer pitch + cleaning

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WebthingsTheme {
<<<<<<< 36a06c279da614ed8b096666aca61df539a2d6bd
        Greeting("Android")
=======
        AppScaffold()
>>>>>>> first drawer pitch + cleaning
    }
}