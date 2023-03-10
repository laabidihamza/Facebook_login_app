package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connect = findViewById<Button>(R.id.connect)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val error = findViewById<TextView>(R.id.erroe)


        connect.setOnClickListener{
            error.visibility = View.GONE
            val txtEmail = email.text.toString()
            val txtPassword = password.text.toString()
            if (txtEmail.trim().isEmpty() || txtPassword.trim().isEmpty()){
                Toast.makeText(this,"veillez entrer tout les champs",Toast.LENGTH_LONG).show()
            }
            else{
                val corrPassword = "azerty"
                val correctEmail = "flen.benflen@gmail.com"
                if(txtEmail == correctEmail && txtPassword == corrPassword){
                    email.setText("")
                    password.setText("")
                    val intentToHomeActivity = Intent(this,HomeActivity::class.java)
                    intentToHomeActivity.apply {
                        putExtra("email",txtEmail)
                        startActivity(this)
                    }

                }
                else{
                    error.text = "email or password are not OK"
                    error.visibility = View.VISIBLE
                }
            }

        }
    }
}