package io.webthings.webthings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.webthings.ui.theme.WebthingsTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.webthings.webthings.ui.NavRoutes
import io.webthings.webthings.ui.screens.DashboardScreen
import io.webthings.webthings.ui.screens.HomeScreen
import io.webthings.webthings.utils.LocalBackPressedDispatcher

const val DEVICES_PREVIEW = Devices.PIXEL_4_XL//Devices used for the preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebthingsTheme {
                CompositionLocalProvider(
                    LocalBackPressedDispatcher provides this.onBackPressedDispatcher) {

                    AppScaffold()
                }
            }
        }
    }
}
