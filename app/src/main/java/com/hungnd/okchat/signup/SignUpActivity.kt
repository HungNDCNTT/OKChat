package com.hungnd.okchat.signup

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.hungnd.okchat.R
import com.hungnd.okchat.home.HomeActivity

class SignUpActivity : AppCompatActivity(), SignUpContract.View, View.OnClickListener {

    private var mPresenter = SignUpPresenter(this)    // Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initView()
    }

    private fun initView() {
        val btnSignUp = findViewById<Button>(R.id.btn_sign_up)
    }

    override fun onClick(p0: View?) {
        val id = p0?.id
        when (id) {
            R.id.btn_sign_up -> {
                startActivity(Intent(this, HomeActivity::class.java))
            }
        }
    }

}