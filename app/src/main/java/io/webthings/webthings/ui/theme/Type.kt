package io.webthings.webthings.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
<<<<<<< 9d02f2866d63baf218b855948b37b10b1bc374ab
=======

/*val WebthingsFont = FontFamily(
    Font(R.font.zilla_slab_bold)

)*/

//TODO: fix issue with custom font

>>>>>>> work on theme and Dashboard Screen
val Typography = Typography(
    //defaultFontFamily = WebthingsFont,
    body1 = TextStyle(
<<<<<<< 36a06c279da614ed8b096666aca61df539a2d6bd
        fontFamily = FontFamily.Default,
=======
        fontFamily = FontFamily.Default,//WebthingsFont,
>>>>>>> first drawer pitch + cleaning
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