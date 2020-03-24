package com.wbs.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getLocation { latitude, longitude ->
            Toast.makeText(applicationContext, latitude.toString(), Toast.LENGTH_LONG).show()
            Toast.makeText(applicationContext, longitude.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
