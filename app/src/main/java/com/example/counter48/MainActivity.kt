package com.example.counter48

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter48.view.CounterView
import com.example.counter48.databinding.ActivityMainBinding
import com.example.counter48.helper.Injector


class MainActivity : AppCompatActivity(), CounterView{

    lateinit var binding: ActivityMainBinding
    private var presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.incremet()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.resultTv.text = count.toString()

    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_LONG).show()
    }

    override fun changeColor() {
        binding.resultTv.setTextColor(Color.GREEN)

    }
}