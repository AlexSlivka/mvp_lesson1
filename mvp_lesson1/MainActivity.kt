package com.geekbrains.mvp_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.geekbrains.mvp_lesson1.presenter.MainPresenter
import com.geekbrains.mvp_lesson1.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MainView {

    val mPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listener = View.OnClickListener {
            var mainId = 0
            when (it.id) {
                R.id.btn_counter1 -> {
                    mainId = 1
                }

                R.id.btn_counter2 -> {
                    mainId = 2
                }

                R.id.btn_counter3 -> {
                    mainId = 3
                }
            }

            mPresenter.counterClick(mainId)
        }

        btn_counter1.setOnClickListener(listener)

        btn_counter2.setOnClickListener(listener)

        btn_counter3.setOnClickListener(listener)

    }

    override fun setButtonText(index: Int, text: String) {
        when (index) {
            0 -> btn_counter1.text = text
            1 -> btn_counter2.text = text
            2 -> btn_counter3.text = text
        }

    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//        //outState.putIntArray("counters", counters.toIntArray())
//    }
//
//
//    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
//        super.onSaveInstanceState(outState, outPersistentState)
//
//        //outState.putIntArray("counters", counters.toIntArray())
//    }


//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        val countersArray = savedInstanceState.getIntArray("counters")
//        countersArray?.toList()?.let {
//            counters.clear()
//            counters.addAll(it)
//        }
//        initViews()
//    }



}
