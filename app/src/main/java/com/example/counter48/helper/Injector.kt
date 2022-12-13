package com.example.counter48.helper

import com.example.counter48.model.CounterModel
import com.example.counter48.presenter.Presenter


class Injector {
    companion object{
        fun getModel(): CounterModel{
            return CounterModel()
        }
        fun getPresenter(): Presenter {
            return Presenter()
        }
    }
}