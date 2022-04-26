package io.webthings.app

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import io.webthings.app.utils.MainViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.livedata.observeAsState
import io.webthings.app.ui.NavigationHost
import io.webthings.app.ui.theme.HeaderStyle

@Composable
fun AppScaffold(){
    val viewModel: MainViewModel = viewModel()
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val currentScreen by viewModel.currentScreen.observeAsState()

    val topBar: @Composable () -> Unit= {
        TopAppBar(
            title= { Text(currentScreen!!.title, style = HeaderStyle) },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ })
                {
                    Icon(Icons.Filled.Menu, contentDescription = "Menu")
                }

            }
        )
    }

    Scaffold(
        topBar = { topBar() },
        scaffoldState = scaffoldState
    ){ _ ->
        NavigationHost(navController, viewModel = viewModel)
    }
}