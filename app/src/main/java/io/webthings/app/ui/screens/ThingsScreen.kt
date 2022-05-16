package io.webthings.app.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.app.DEVICES_PREVIEW
import io.webthings.app.ui.NavRoutes
import io.webthings.app.ui.theme.WebthingsTheme
import io.webthings.app.utils.MainViewModel

@Composable
fun ThingsScreen(viewModel: MainViewModel) {
    viewModel.setCurrentScreen(NavRoutes.DrawerItems.ThingsScreen)
    /*
     * TODO
     */
    Text(text="Main Dashboard")
}

@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun ThingsScreenPreview(){
    WebthingsTheme {
        ThingsScreen(MainViewModel())
    }
}