package io.webthings.webthings

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import io.webthings.webthings.utils.MainViewModel
import io.webthings.webthings.utils.NavigationHost
import kotlinx.coroutines.launch

@Composable
fun AppScaffold(){
    val viewModel: MainViewModel = viewModel()
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val currentScreen by viewModel.currentScreen.observeAsState()

    val topBar: @Composable () -> Unit= {
        TopAppBar(
            title = { Text(currentScreen!!.title) },
            actions = {
                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }){
                    Icon(Icons.Filled.Menu, contentDescription = "")
                }
            }
        )
    }

    Scaffold(
        topBar = { topBar() },
        scaffoldState = scaffoldState,
        drawerContent = {
            /* TODO */
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
    ){ innerPadding ->
        NavigationHost(navController, viewModel = viewModel)
    }
}