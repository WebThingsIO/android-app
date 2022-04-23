package io.webthings.app.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.app.ui.NavRoutes
import io.webthings.app.utils.MainViewModel

@Composable
fun GwSettingsScreen(viewModel: MainViewModel){
    viewModel.setCurrentScreen(NavRoutes.DrawerItems.GwSettingsScreen)
    /*
     * TODO
     */
    Text(text="Gateway Settings")
}

@Composable
@Preview
fun GwSettingsPreview(){
    GwSettingsScreen(MainViewModel())
}