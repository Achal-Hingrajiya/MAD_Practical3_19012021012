package com.example.practical3_19012021012

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "On Create", Toast.LENGTH_SHORT).show()
        Log.i("Main_activity", "On Create is executed.")


    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "On Start", Toast.LENGTH_SHORT).show()
        Log.i("Main_activity", "On Start is executed.")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "On Stop", Toast.LENGTH_SHORT).show()
        Log.i("Main_activity", "On Stop is executed.")

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "On Restart", Toast.LENGTH_SHORT).show()
        Log.i("Main_activity", "On Restart is executed.")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "On Resume", Toast.LENGTH_SHORT).show()
        Log.i("Main_activity", "On Resume is executed.")

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "On Pause", Toast.LENGTH_SHORT).show()
        Log.i("Main_activity", "On Pause is executed.")

    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(applicationContext, "On Destroy", Toast.LENGTH_SHORT).show()
        Log.i("Main_activity", "On Destroy is executed.")

    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.i("Main_activity", "Back button pressed.")
    }



}