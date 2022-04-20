package io.webthings.webthings.utils

import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.compose.runtime.*

@Composable
fun BackPressHandler(onBackPressed: () -> Unit){
    val currentOnBackPRessed by rememberUpdatedState(onBackPressed)

    val backCallback = remember {
        object : OnBackPressedCallback(true){
            override fun handleOnBackPressed(){
                currentOnBackPRessed()
            }
        }
    }

    val backDispatcher = LocalBackPressedDispatcher.current

    DisposableEffect(backDispatcher){
        backDispatcher.addCallback(backCallback)
        onDispose{
            backCallback.remove()
        }
    }
}

val LocalBackPressedDispatcher = staticCompositionLocalOf<OnBackPressedDispatcher> {
    error("No Back Dispatcher provided")
}