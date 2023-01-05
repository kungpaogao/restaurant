package org.andrewgao.restaurant

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform