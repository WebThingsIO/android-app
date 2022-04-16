package io.webthings.webthings.ui.menus

import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.webthings.webthings.ui.theme.WebthingsFont
import io.webthings.webthings.ui.theme.WebthingsTheme

/*
 *TODO: if we need different topapp bar, add an argument to select the right one and have all
 * if possible in the same file
 */
@Composable
fun TopBar(navController: NavController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /* TODO */ }){
                Icon(Icons.Filled.Menu, "")
            }
        },
        title = { Text("Dashboard Name") },
        actions = {
            /* TODO */
        }
    )

}