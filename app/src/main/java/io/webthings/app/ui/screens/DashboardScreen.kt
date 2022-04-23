package io.webthings.app.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.app.DEVICES_PREVIEW
import io.webthings.app.ui.NavRoutes
import io.webthings.app.ui.theme.WebthingsTheme
import io.webthings.app.utils.MainViewModel

@Composable
fun DashboardScreen(viewModel: MainViewModel) {
    viewModel.setCurrentScreen(NavRoutes.DrawerItems.DashboardScreen)
    /*
     * TODO
     */
    Text(text="Main Dashboard")
}

@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun DashboardScreenPreview(){
    WebthingsTheme {
        DashboardScreen(MainViewModel())
    }
}