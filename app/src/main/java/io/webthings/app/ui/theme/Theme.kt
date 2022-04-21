package io.webthings.app.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    surface = LightBlue,
    onSurface = White,
    primary = DarkBlue,
    onPrimary = DarkWhite
)
@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
    surface = LightBlue,
    onSurface = White,
    primary = DarkBlue,
    onPrimary = White,
    background = LightBlue,
    onBackground = White,
    secondary = DarkBlue,
    onSecondary = DarkWhite
    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun WebthingsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        LightColorPalette//TODO: DarkTheme
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}