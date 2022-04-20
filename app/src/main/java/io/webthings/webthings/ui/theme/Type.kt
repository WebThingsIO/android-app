package io.webthings.webthings.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.webthings.webthings.R

// Set of Material typography styles to start with

fun WebthingsFont() = FontFamily(
    Font(R.font.zilla_slab_bold, FontWeight.Bold),
    Font(R.font.zilla_slab_medium)
)

val Typography = Typography(
    defaultFontFamily = WebthingsFont(),
    body1 = TextStyle(
        fontFamily = WebthingsFont(),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val HeaderStyle = TextStyle(
    fontFamily = WebthingsFont(),
    fontWeight = FontWeight.Bold,
    fontSize = 32.sp
)

val MenuItemStyle = TextStyle(
    fontFamily = WebthingsFont(),
    fontWeight = FontWeight.Bold,
    fontSize = 24.sp

)