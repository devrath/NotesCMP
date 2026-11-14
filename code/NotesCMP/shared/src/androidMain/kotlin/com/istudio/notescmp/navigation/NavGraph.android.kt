package com.istudio.notescmp.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.layout.calculatePaneScaffoldDirective
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import androidx.compose.material3.adaptive.navigation3.rememberListDetailSceneStrategy
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay

@Composable
actual fun NavGraph() {

    val navigator = remember { Navigator() }

    // Here we display all possible destinations our app can have
    NavDisplay(
        backStack = navigator.backStack,
        onBack = {
            // When we press the system back button, we need to click navigator and trigger the function to handle backstack
            navigator.goBack()
        },
        entryProvider = entryProvider {
            // For the entry provider, we need to give all our destinations
            entry<Screen.Home>{
               // Add your composable
                Text(
                    text = "Hello World",
                    modifier = Modifier.fillMaxSize(1f).background(color = Color.Red)
                )
            }
            entry<Screen.Task>{
                // Add your composable
            }
        }
    )

}