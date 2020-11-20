package com.hungnd.okchat.signin

class SignInPresenter( val mView: SignInContract.View?) : SignInContract.Presenter {
    override fun signInAccount(email: String, password: String) {
    mView?.updateUISignInSuccessful()
    }

}