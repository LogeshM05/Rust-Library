package com.example.rusty_android

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.rusty_android_lib.*


external fun hello(to: String): String
external fun helloDirect(to: String): String

class MainActivity : AppCompatActivity() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadRustyLib()
        var s : String = oncreate();
        println("$s")
        Log.e("Lifecycle",s)
    }

    override fun onStart() {
        super.onStart()
        var s : String = onstart()
        println("$s")
        Log.e("Lifecycle",s)
    }

    override fun onResume() {
        super.onResume()
        var s : String = onresume()
        println("$s")
        Log.e("Lifecycle",s)
    }

    override fun onPause() {
        super.onPause()
        var s : String = onpause()
        println("$s")
        Log.e("Lifecycle",s)
    }

    override fun onRestart() {
        super.onRestart()
        var s : String =  onrestart()
        println("$s")
        Log.e("Lifecycle",s)
    }

    override fun onStop() {
        super.onStop()
        var s : String =  onstop()
        println("$s")
        Log.e("Lifecycle",s)
    }

    override fun onDestroy() {
        super.onDestroy()
        var s : String =  ondestroy()
        println("$s")
        Log.e("Lifecycle",s)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}