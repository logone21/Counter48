package com.example.counter48.presenter

import com.example.counter48.view.CounterView
import com.example.counter48.helper.Injector


class Presenter {
    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun incremet() {
        model.increment()
        view.showNewCount(model.count)
            when (model.count) {
                10 -> view.showToast()
                15 -> view.changeColor()
            }
    }
    fun decrement() {
        model.decrement()
        view.showNewCount(model.count)
    }

        fun attachView(view: CounterView) {
            this.view = view
        }
    }

