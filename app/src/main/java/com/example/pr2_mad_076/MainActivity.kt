package com.example.pr2_mad_076

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage("onCreate")
    }

    override fun onStart() {
        super.onStart()
        displayMessage("onStart")
    }

    override fun onResume() {
        super.onResume()
        displayMessage("onResume")
    }

    override fun onStop() {
        super.onStop()
        displayMessage("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMessage("onDestroy")
    }
    fun displayMessage(msg:String){
        Snackbar.make(findViewById(R.id.hp1),R.string.email_sent,Snackbar.LENGTH_SHORT).show()
        Toast.makeText(this,"$msg"+"is called",Toast.LENGTH_LONG).show()

        Log.i(TAG,"this is a $msg")


    }

}