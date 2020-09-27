package com.geekbrains.mvp_lesson1.presenter

import com.geekbrains.mvp_lesson1.R
import com.geekbrains.mvp_lesson1.model.CounterModel
import com.geekbrains.mvp_lesson1.view.MainView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainPresenter (val view : MainView) {
    var mModel = CounterModel()

    fun counterClick(id : Int) {
        when (id) {
            1 -> {
                val nextValue = mModel.next(0)
                view.setButtonText(0, nextValue.toString())

            }

            2 -> {
                val nextValue = mModel.next(1)
                view.setButtonText(1, nextValue.toString())

            }

            3 -> {
                val nextValue = mModel.next(2)
                view.setButtonText(2, nextValue.toString())

            }
        }
    }
}