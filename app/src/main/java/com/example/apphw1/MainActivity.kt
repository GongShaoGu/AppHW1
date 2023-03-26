package com.example.apphw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val textViewName = findViewById<TextView>(R.id.textViewName)
            val textViewSex = findViewById<TextView>(R.id.textViewSex)
            val editText1 = findViewById<EditText>(R.id.editText1)
            val editText2 = findViewById<EditText>(R.id.editText2)
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 1)
            textViewName.text = textViewName.text.toString() + editText1.text.toString()
            textViewSex.text = textViewSex.text.toString() + editText2.text.toString()
            editText1.visibility = EditText.INVISIBLE
            editText2.visibility = EditText.INVISIBLE
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        data?.extras?.let {
            val textViewSize = findViewById<TextView>(R.id.textViewSize)
            val textViewColor = findViewById<TextView>(R.id.textViewColor)
            textViewSize.text = textViewSize.text.toString() + it.getCharSequence("size").toString()
            textViewColor.text = textViewColor.text.toString() + it.getCharSequence("color").toString()
            textViewSize.visibility = TextView.VISIBLE
            textViewColor.visibility = TextView.VISIBLE
        }
    }
}