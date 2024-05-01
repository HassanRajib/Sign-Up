package com.example.signup

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
        lateinit var usname: EditText
        lateinit var email:EditText
        lateinit var pass:EditText
        lateinit var conpass:EditText
        lateinit var go:Button
        lateinit var sgN:TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        usname = findViewById(R.id.uSnam)
        email = findViewById(R.id.emaiL)
        pass = findViewById(R.id.paSs)
        conpass = findViewById(R.id.coNpa)
        go = findViewById(R.id.button)
        sgN = findViewById(R.id.siGn)

        go.setOnClickListener {
            val Username = usname.text.toString()
            val Email = email.text.toString()
            val Pass = pass.text.toString()
            val Conpass = conpass.text.toString()

            if (Username.isEmpty()||Email.isEmpty()||Pass.isEmpty()||Conpass.isEmpty()){
                Toast.makeText(this, "Please fill all the filds",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Sign up complete",Toast.LENGTH_SHORT).show()
            }
        }
    }
}