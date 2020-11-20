package com.hungnd.okchat.myprofile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hungnd.okchat.R

class MyProfileActivity : AppCompatActivity(), MyProfileContract.View {

    private var mPresenter =MyProfilePresenter(this)    // Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        initView()
    }

    private fun initView() {

    }

}