package org.andrewgao.restaurant

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}! My name is Andrew!" +
                "\nThere are only ${daysUntilNewYear()} days left until New Year!"
    }
}