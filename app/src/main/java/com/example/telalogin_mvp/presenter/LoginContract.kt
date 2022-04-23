package com.example.telalogin_mvp.presenter

import java.sql.Struct

interface LoginContract {

    interface View : BaseView <LoginPresenter> {
        fun showError()
        fun startHomeActivity()
    }

    interface Presenter : BasePresenterInterface {
        fun isLoginValid (user : String, password : String)
    }

}