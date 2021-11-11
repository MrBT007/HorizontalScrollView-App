package com.example.horizontalscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)

        // Log.(d,w,i,e) every log appears in logcat for finding such logs search it with its tag in this case it is "General"
        // It is basically used for showing activity ourself (not in a device which owns app)
        Log.w("General","The error occurs!")
        button.setOnClickListener(object: View.OnClickListener
        {
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext,"This Button is working properly",Toast.LENGTH_SHORT).show()
                Log.d("General","The Button clicked!")
            }
        })

    }
}

