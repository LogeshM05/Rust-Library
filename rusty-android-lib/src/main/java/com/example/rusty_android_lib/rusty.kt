package com.example.rusty_android_lib

    external fun hello(to: String): String
    external fun helloDirect(to: String): String
    external fun oncreate(): String
    external fun onstart(): String
    external fun onresume(): String
    external fun onpause(): String
    external fun onrestart(): String
    external fun onstop(): String
    external fun ondestroy(): String
    fun loadRustyLib() {
        System.loadLibrary("rustylib")
    }