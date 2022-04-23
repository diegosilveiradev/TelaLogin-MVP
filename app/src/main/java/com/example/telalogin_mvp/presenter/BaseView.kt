package com.example.telalogin_mvp.presenter

interface BaseView <T> {

    var presenter : T
    fun bindView ()

}