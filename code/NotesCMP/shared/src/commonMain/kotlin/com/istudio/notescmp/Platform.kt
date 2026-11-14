package com.istudio.notescmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
