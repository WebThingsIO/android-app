package io.webthings.app

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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.app.ui.theme.WebthingsTheme
import io.webthings.app.utils.LocalBackPressedDispatcher

const val DEVICES_PREVIEW = Devices.PIXEL_4_XL

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
