package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val vEdit = findViewById<EditText>(R.id.act2_edit)


        findViewById<Button>(R.id.act2_button).setOnClickListener() {
            val newSting = vEdit.text.toString()
            val i = Intent()
            i.putExtra("tag2", newSting)
            setResult(0, i)
            finish()
        }

        val string = intent.getStringExtra("tag1")

        vEdit.setText(string)
    }
}
