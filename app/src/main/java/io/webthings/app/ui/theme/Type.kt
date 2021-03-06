package io.webthings.app.ui.theme

import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.webthings.app.R

fun WebthingsFont() = FontFamily(
    Font(R.font.zilla_slab_medium)
)

fun TextFont() = FontFamily(
    Font(R.font.open_sans)
)
// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = TextFont(),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
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
    fontFamily = TextFont(),
    fontWeight = FontWeight.Normal,
    fontSize = 32.sp
)

val MenuItemStyle = TextStyle(
    fontFamily = TextFont(),
    fontWeight = FontWeight.Normal,
    fontSize = 24.sp
)

val WebThingsStyle = TextStyle(
    fontFamily = WebthingsFont(),
    fontWeight = FontWeight.Normal,
    fontSize = 32.sp
)