package com.example.myapplication

import android.os.Handler

fun withDelay(delayInMillis: Long, block: () -> Unit) {
    Handler().postDelayed(Runnable(block), delayInMillis)
}