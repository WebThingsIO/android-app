package io.webthings.webthings.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.webthings.webthings.DEVICES_PREVIEW
import io.webthings.webthings.ui.theme.WebthingsTheme
import io.webthings.webthings.utils.MainViewModel

@Composable
fun DashboardScreen(viewModel: MainViewModel) {
    /*
     * TODO: receive a dashboard item
     *  so we could reuse Dashboard on mutliple Dashboard
     */
}

@Preview(showBackground = true, device = DEVICES_PREVIEW)
@Composable
fun DashboardScreenPreview(){
    WebthingsTheme {
        DashboardScreen(MainViewModel())
    }
}