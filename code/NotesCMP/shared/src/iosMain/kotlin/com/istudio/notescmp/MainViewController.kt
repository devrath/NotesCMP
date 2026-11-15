package com.istudio.notescmp

import androidx.compose.ui.window.ComposeUIViewController
import com.istudio.notescmp.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }