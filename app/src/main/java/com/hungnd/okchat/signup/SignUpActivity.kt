package com.hungnd.okchat.signup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hungnd.okchat.R

class SignUpActivity : AppCompatActivity(), SignUpContract.View {

    private var mPresenter =SignUpPresenter(this)    // Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initView()
    }

    private fun initView() {

    }

}