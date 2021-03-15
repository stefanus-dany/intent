package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button1)
        btn.setOnClickListener{
            val pindah = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(pindah)
        }

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener{
            val pindah = Intent(this@MainActivity, ThirdActivity::class.java)
            pindah.putExtra(ThirdActivity.EXTRA_NAME, "Dany")
            pindah.putExtra(ThirdActivity.EXTRA_AGE, 21)
            startActivity(pindah)
        }

        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            val number = "081394559813"
            val pindah = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            startActivity(pindah)
        }
    }
}