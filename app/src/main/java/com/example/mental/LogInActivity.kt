package com.example.mental

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_in)

        // https://zrr.kr/Z2HA 버튼 클릭시 페이지 이동
        val email : EditText = findViewById(R.id.email_edit)
        val password : EditText = findViewById(R.id.password_edit)
        val login : AppCompatButton = findViewById(R.id.login_btn)
        val signup : AppCompatButton = findViewById((R.id.signup_btn))

        login.setOnClickListener {
            val id = email.text.toString()
            val pw = password.text.toString()
            val intent = Intent(this@LogInActivity,MainActivity::class.java)

            intent.putExtra("id", id)
            intent.putExtra("pw", pw)
            startActivity(intent)
        }

        //https://zrr.kr/Ty4G

        //signup.setOnClickListener {
        //    signup()
        //}


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
    }

    // 해결 못함
    //private fun signup() {
    //    val intent = Intent(this, SignUpActivity::class.java)
    //    ContextCompat.startActivity(intent)
    //}
}