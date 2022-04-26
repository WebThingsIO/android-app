package io.webthings.app.ui.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.webthings.app.R
import io.webthings.app.ui.drawerMenuItems
import io.webthings.app.ui.theme.DarkBlue
import io.webthings.app.ui.theme.HeaderStyle
import io.webthings.app.ui.theme.LightBlue
import io.webthings.app.ui.theme.MenuItemStyle

@Composable
fun Drawer(
    modifier: Modifier = Modifier.background(color= DarkBlue),
    onDestinationClicked: (route: String) -> Unit){
    Column(
        modifier.fillMaxSize()
            .padding(top = 10.dp)){
        Text(stringResource(R.string.app_name),
        style = HeaderStyle,
        modifier = Modifier
            .padding(bottom = 10.dp)
            .align(alignment = Alignment.CenterHorizontally))

        Surface(modifier = Modifier
            .background(color = LightBlue)
            .fillMaxSize()){
                  Column(){
                      drawerMenuItems.forEach { screen ->
                          Spacer(Modifier.height(24.dp))
                          Row(){
                              Icon(imageVector = screen.icon,
                              contentDescription = "",
                              modifier = Modifier.padding(start = 12.dp))
                              Text( text = screen.title,
                              style = MenuItemStyle,
                              modifier = Modifier
                                  .clickable {
                                      onDestinationClicked(
                                          screen.route
                                      )
                                  }.padding(start = 24.dp))
                          }
                      }
                  }
        }
    }
}