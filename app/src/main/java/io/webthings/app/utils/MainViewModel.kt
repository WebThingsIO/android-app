package io.webthings.app.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.webthings.app.ui.NavRoutes

class MainViewModel: ViewModel() {
    private val _currentScreen = MutableLiveData<NavRoutes>(NavRoutes.DrawerItems.DashboardScreen)
    val currentScreen: LiveData<NavRoutes> = _currentScreen

    fun setCurrentScreen(screen: NavRoutes){
        _currentScreen.value = screen
    }
}