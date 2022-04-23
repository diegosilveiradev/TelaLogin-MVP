package com.example.telalogin_mvp.presenter

import com.example.telalogin_mvp.model.Login

class LoginPresenter (val view : LoginContract.View) : LoginContract.Presenter{

    override fun isLoginValid(user: String, password: String) {
        if(user.isEmpty() || password.isEmpty()) {
            view.showError()
        }else {
            if (password == Login.PASSWORD && user == Login.USERNAME) {
                view.startHomeActivity()
            }else{
                view.showError()
            }
        }

    }

    override fun start() {
       view.bindView()
    }


}