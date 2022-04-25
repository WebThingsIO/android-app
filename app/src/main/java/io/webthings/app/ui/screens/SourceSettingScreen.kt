package io.webthings.app.ui.screens

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import io.webthings.app.templates.SourceTemplate
import io.webthings.app.ui.NavRoutes
import io.webthings.app.utils.MainViewModel

val buttonWidth = 150.dp

@Composable
fun SourceSettingScreen(viewModel: MainViewModel, source: SourceTemplate?){
    viewModel.setCurrentScreen(NavRoutes.DrawerItems.SourceSettingsScreen)
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {
        Surface(modifier = Modifier
            .fillMaxHeight()
            .weight(1F, fill = false)) {
            source?.SettingsScreen()
        }
        Row(modifier = Modifier
            .padding(5.dp)
            .align(Alignment.CenterHorizontally)){
            Button(onClick = { source?.saveSettings()},
            modifier = Modifier.padding(end = 2.dp).width(buttonWidth)) {
                Text("Save")
            }
            Button(onClick = {
                context.findActivity()?.onBackPressed()
                },
            modifier = Modifier.padding(start = 2.dp).width(buttonWidth)) {
                Text("Cancel")
            }
        }
    }
}

fun Context.findActivity(): Activity?{
    var context = this
    while (context is ContextWrapper){
        if (context is Activity) return context
        context = context.baseContext
    }
    return null
}