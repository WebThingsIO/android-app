package io.webthings.webthings.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.webthings.webthings.R

// Set of Material typography styles to start with

/*val WebthingsFont = FontFamily(
    Font(R.font.zilla_slab_bold)

)*/

//TODO: fix issue with custom font

val Typography = Typography(
    //defaultFontFamily = WebthingsFont,
    body1 = TextStyle(
        fontFamily = FontFamily.Default,//WebthingsFont,
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