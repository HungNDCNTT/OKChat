package com.hungnd.okchat.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hungnd.okchat.R

class HomeActivity : AppCompatActivity(), HomeContract.View {

    private var mPresenter =HomePresenter(this)    // Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }

    private fun initView() {

    }

}