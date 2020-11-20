package com.hungnd.okchat.signin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.hungnd.okchat.R
import com.hungnd.okchat.signup.SignUpActivity

class SignInActivity : AppCompatActivity(), SignInContract.View,View.OnClickListener {
    private var mPresenter = SignInPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        initView()
    }

    private fun initView() {
     val  btnSignIn=findViewById<Button>(R.id.btn_sign_in)
        btnSignIn.setOnClickListener(this)
    }

    override fun updateUISignInSuccessful() {
        Snackbar.make(findViewById(android.R.id.content), "Login Successful", Snackbar.LENGTH_LONG).show()

    }

    override fun onClick(p0: View?) {
     val id = p0?.id
        when(id){
            R.id.btn_sign_in->{
                Toast.makeText(this,"HungND",Toast.LENGTH_LONG).show()
                startActivity(Intent(this,SignUpActivity::class.java))
            }
        }
    }

}