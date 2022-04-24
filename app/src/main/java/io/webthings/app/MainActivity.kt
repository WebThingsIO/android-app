package io.webthings.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.tooling.preview.Devices
import io.webthings.app.ui.theme.WebthingsTheme
import io.webthings.app.utils.LocalBackPressedDispatcher

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