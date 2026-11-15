package com.istudio.notescmp.di

import com.istudio.notescmp.navigation.Navigator
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val koinModule = module {
    singleOf(constructor = ::Navigator) // We make it singleton
}

// We use this here to initialize in androidMain and IOS-main source sets
fun initializeKoin(
    // This configuration can be passed from android target but not IOS :---> So its optional
    config: (KoinApplication. () -> Unit)? = null
) {
    startKoin {
        config?.invoke(this)// This is triggered only from androd target and not IOS
        modules(koinModule)
    }
}