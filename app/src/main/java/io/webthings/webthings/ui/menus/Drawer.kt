package io.webthings.webthings.ui.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.webthings.webthings.ui.drawerMenuItems
import io.webthings.webthings.ui.theme.*

@Composable
fun Drawer(
        modifier: Modifier = Modifier.background(color = DarkBlue),
        onDestinationClicked: (route: String) -> Unit){
        Column(
                modifier
                        .fillMaxSize()
                        .padding(top = 10.dp)
        ) {
                Text(
                        "Webthings",
                        style = HeaderStyle,
                        modifier = Modifier.padding(bottom = 10.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                Surface(modifier = Modifier
                        .background(color = LightBlue)
                        .fillMaxSize())
                {       Column() {


                        drawerMenuItems.forEach { screen ->
                                Spacer(Modifier.height(24.dp))
                                Text(
                                        text = screen.title,
                                        style = MenuItemStyle,
                                        modifier = Modifier
                                                .clickable {
                                                        onDestinationClicked(screen.route)
                                                }
                                                .padding(start = 24.dp)
                                )

                        }
                }
                }
        }
}

@Preview
@Composable
fun DrawerPreview(){
        WebthingsTheme() {
                Drawer{}
        }
}