package io.webthings.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< HEAD
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.tooling.preview.Devices
import io.webthings.app.ui.theme.WebthingsTheme
import io.webthings.app.utils.LocalBackPressedDispatcher

const val DEVICES_PREVIEW = Devices.PIXEL_4_XL//Devices used for the preview
=======
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.app.ui.theme.WebthingsTheme
>>>>>>> c51d2fdf9e971b3d786b7a3431c85a69390204f2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebthingsTheme {
<<<<<<< HEAD
                CompositionLocalProvider(
                    LocalBackPressedDispatcher provides this.onBackPressedDispatcher) {

                    AppScaffold()
=======
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
>>>>>>> c51d2fdf9e971b3d786b7a3431c85a69390204f2
                }
            }
        }
    }
}
<<<<<<< HEAD
=======

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WebthingsTheme {
        Greeting("Android")
    }
}
>>>>>>> c51d2fdf9e971b3d786b7a3431c85a69390204f2
