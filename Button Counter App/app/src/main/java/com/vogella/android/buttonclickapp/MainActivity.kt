package com.vogella.android.buttonclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TAG = "MainActivity"
private const val TEXT_CONTENTS = "TextContent: "

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput : EditText = findViewById(R.id.editText)
        val button : Button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        // Change the buttons default action when button is clicked
        // This is the "long winded" version that displays what actually IS happening
        button.setOnClickListener {
            Log.d(TAG, "OnClick: called")
            textView?.append(userInput.text)
            textView?.append("\n")
            //                userInput.text.clear()ey
            userInput.setText("")
        }


    }

    // Log the following functions when they are called.

    override fun onStart() {
        Log.d(TAG, "OnStart: called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "OnRestoreInstanceState: called")
        super.onRestoreInstanceState(savedInstanceState)
        val savedString = savedInstanceState.getString(TEXT_CONTENTS, "")
        textView?.text = savedString
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.d(TAG, "OnCreate: called")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onResume() {
        Log.d(TAG, "OnResume: called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "OnPause: called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "OnSaveInstanceState: called")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_CONTENTS, textView?.toString())
    }

    override fun onStop() {
        Log.d(TAG, "OnStop: called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "OnRestart: called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "OnDestroy: called")
        super.onDestroy()
    }
}