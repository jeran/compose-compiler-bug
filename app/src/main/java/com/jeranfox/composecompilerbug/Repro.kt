package com.jeranfox.composecompilerbug

import androidx.compose.runtime.Composable

class Repro {

    private val composables = linkedMapOf<String, @Composable () -> Unit>()

    fun doSomething() {
        composables[""]
    }
}
