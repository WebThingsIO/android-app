package io.webthings.webthings

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import io.webthings.webthings.ui.menus.TopBar
import io.webthings.webthings.utils.MainViewModel

fun AppScaffold(){
    val viewModel: MainViewModel = viewModel()
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val score = rememberCoroutineScope()
    val currentScreen by viewModel.currentScreen.observeAsState()

    Scaffold(

    ){  }
}