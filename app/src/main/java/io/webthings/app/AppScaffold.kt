package io.webthings.app

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import io.webthings.app.ui.menus.Drawer
import io.webthings.app.ui.theme.HeaderStyle
import io.webthings.app.ui.theme.WebthingsTheme
import io.webthings.app.utils.BackPressHandler
import io.webthings.app.utils.MainViewModel
import kotlinx.coroutines.launch
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.livedata.observeAsState
import io.webthings.app.ui.NavigationHost

@Composable
fun AppScaffold(){
    val viewModel: MainViewModel = viewModel()
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val currentScreen by viewModel.currentScreen.observeAsState()

    if (scaffoldState.drawerState.isOpen){
        BackPressHandler {
            scope.launch {
                scaffoldState.drawerState.close()
            }
        }
    }

    val topBar: @Composable () -> Unit= {
        TopAppBar(
            title = { Text(currentScreen!!.title, style = HeaderStyle) },
            navigationIcon = {
                //TODO if not home screen change to back arrow
                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                })
                {
                    Icon(Icons.Filled.Menu, contentDescription = "Menu")
                }
            }
        )
    }

    Scaffold(
        topBar = { topBar() },
        scaffoldState = scaffoldState,
        drawerContent = {
            Drawer{ screen ->
                scope.launch {
                    scaffoldState.drawerState.close()
                }
                navController.navigate(screen){

                    //popUpTo = navController.graph.getStartDestination()
                    //TODO this line cause app to crash, have to lookup for popUpToId
                    launchSingleTop = true
                }
            }
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
    ){ _ ->
        NavigationHost(navController, viewModel = viewModel)
    }
}

@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun AppScaffoldPreview() {
    WebthingsTheme {
        AppScaffold()
    }
}