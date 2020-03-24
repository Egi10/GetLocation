/*
 * Copyright 2020 Wowbid Perintis Nusantara, PT.
 * Last modified 3/18/20 5:08 PM
 */

package com.wbs.myapplication

import android.app.Application
import android.content.Context

/**
 * Created By Julsapargi Nursam 3/18/20
 */

class MyApp : Application() {
    override fun onCreate() {
        instance = this
        super.onCreate()
    }

    companion object {
        private var instance: MyApp? = null

        val context: Context?
            get() = instance
    }
}