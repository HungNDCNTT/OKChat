package com.hungnd.okchat.signin

interface SignInContract {
    interface View {
        fun updateUISignInSuccessful()
    }

    interface Presenter {
        fun signInAccount(email: String, password: String)
    }
}