package com.example.ellen_.drink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class DrinkView : AppCompatActivity() {

    companion object {
        public const val DRINK: String = "Drink" //para putExtra entre activities
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_drink_view)

    }
}
