package com.example.apphw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<Button>(R.id.button2).setOnClickListener {
            val bundle = Bundle()
            bundle.putCharSequence("size", findViewById<EditText>(R.id.editText5).text)
            bundle.putCharSequence("color", findViewById<EditText>(R.id.editText6).text)
            val intent = Intent().putExtras(bundle)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}