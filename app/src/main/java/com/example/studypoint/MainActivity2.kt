package com.example.studypoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val kbtn=findViewById<Button>(R.id.kotlinbtn)
        kbtn.setOnClickListener(){
            val intent= Intent(this,MainActivity3::class.java).apply {  }
            startActivity(intent)
        }

        val sqbtn=findViewById<Button>(R.id.sqlbtn)
        sqbtn.setOnClickListener(){
            val intent= Intent(this,MainActivity3::class.java).apply {  }
            startActivity(intent)
        }


        kbtn.setOnClickListener{

            val i = Intent(this, MainActivity3::class.java)
            var b  = Bundle()
            var x: Int = 799
            var y: Int = 999

            b.putInt("First", x)
            b.putInt("second", y)
            i.putExtra("info", b)
            startActivity(i)
        }
    }
}