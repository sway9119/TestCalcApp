package com.example.testcalcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener() {
            var isValid = true
            val priceEditText = findViewById<EditText>(R.id.price)
            val priceText = priceEditText.text.toString()

            if (priceText.isEmpty()) {
                // 定価が未入力
                priceEditText.error = getString(R.string.price_error)
                isValid = false
            }

            val discountEditText = findViewById<EditText>(R.id.discount)
            val discountText = discountEditText.text.toString()

            if (discountText.isEmpty()) {
                // 割引率が未入力
                discountEditText.error = getString(R.string.discount_error)
                isValid = false
            }

            if (isValid) {
                // 文字列を整数型に変換
                val price = Integer.parseInt(priceText)
                val discount = Integer.parseInt(discountText)

                // TODO: 計算結果画面への画面繊維する
            }
        }
    }
}