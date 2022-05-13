package io.webthings.app.ui.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import io.webthings.app.R
import io.webthings.app.ui.drawerMenuItems
import io.webthings.app.ui.theme.*

@Composable
fun Drawer(
    modifier: Modifier = Modifier,
    onDestinationClicked: (route: String) -> Unit){
    Column(
        modifier
            .fillMaxSize()
            .padding(top = 10.dp)){
        Text(stringResource(R.string.app_name),
        style = WebThingsStyle,
        modifier = Modifier
            .padding(bottom = 10.dp, start = 10.dp))

        Surface(modifier = Modifier
            .background(color = LightBlue)
            .fillMaxSize()){
                  Column(){
                      drawerMenuItems.forEach { screen ->
                          lateinit var icon: ImageVector
                          if (screen.icon is Int){
                              icon = ImageVector.vectorResource(id = screen.icon)
                          }else{
                              icon = screen.icon as ImageVector
                          }
                          Spacer(Modifier.height(24.dp))
                          Row(modifier = Modifier
                              .fillMaxWidth()
                              .clickable(
                                  interactionSource = remember { MutableInteractionSource() },
                                  indication = rememberRipple(color = DarkBlue),
                                  //TODO: highlight current screen in the menu
                              ) {
                                  onDestinationClicked(
                                      screen.route
                                  )
                              }){
                              Icon(imageVector = icon,
                              contentDescription = "",
                              modifier = Modifier
                                  .padding(start = 12.dp)
                                  .size(24.dp))
                              Text( text = screen.title,
                              style = MenuItemStyle,
                              modifier = Modifier
                                  .padding(start = 24.dp))
                          }
                      }
                  }
        }
    }
}