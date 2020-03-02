package com.example.dmc1memo.data

import android.app.Application
import io.realm.Realm


class DMC1MemoApplication() : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}