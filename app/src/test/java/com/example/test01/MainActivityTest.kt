package com.example.test01

import android.content.Intent
import android.os.Build
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.annotation.Config



@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.O])
class MainActivityTest {

    @Test
    fun onCreate() {
        val startActivityIntent = Intent(ApplicationProvider.getApplicationContext(), MainActivity::class.java)
        val scenario = launch<MainActivity>(startActivityIntent)
        // scenario.onActivity { it.onCreate() }
        scenario.moveToState(Lifecycle.State.CREATED)
    }
}