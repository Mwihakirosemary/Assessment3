package dev.anastasia.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilOne: TextInputLayout
    lateinit var etNumone: TextInputEditText
    lateinit var tilTwo: TextInputLayout
    lateinit var etNumtwo: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnMinus: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilOne = findViewById(R.id.tilOne)
        etNumone = findViewById(R.id.etNumone)
        tilTwo = findViewById(R.id.tilTwo)
        etNumtwo = findViewById(R.id.etNumtwo)
        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMinus)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var num1 = etNumone.text.toString().toDouble()
            var num2 = etNumtwo.text.toString().toDouble()
            add(num1,num2)
            btnAdd.setOnClickListener {
                validate()
            }
        }

        btnMinus.setOnClickListener {
            var num1 = etNumone.text.toString().toDouble()
            var num2 = etNumtwo.text.toString().toDouble()
            subtract(num1,num2)
            btnMinus.setOnClickListener {
                validate()
            }
        }

        btnModulus.setOnClickListener {
            var num1 = etNumone.text.toString().toDouble()
            var num2 = etNumtwo.text.toString().toDouble()
            modulus(num1,num2)

            btnModulus.setOnClickListener {
                validate()
            }
        }
        btnDivision.setOnClickListener {
            var num1 = etNumone.text.toString().toDouble()
            var num2 = etNumtwo.text.toString().toDouble()
            devide(num1,num2)

            btnDivision.setOnClickListener {
                validate()
            }

        }


    }
    fun add(num1: Double,num2: Double){
        var total = num1 + num2
        tvResult.text = total.toString()
    }
    fun subtract(num1: Double,num2: Double){
        var total = num1 - num2
        tvResult.text = total.toString()
    }
    fun modulus(num1: Double,num2: Double){
        var total = num1 % num2
        tvResult.text = total.toString()
    }
    fun devide(num1: Double,num2: Double){
        var total = num1 / num2
        tvResult.text = total.toString()
    }

    fun validate(){
        var num1 = etNumone.text.toString()
        var num2 = etNumtwo.text.toString()


        if (num1.isBlank()){
            tilOne.error = getString(R.string.first_required)

        }
        if (num2.isBlank()){
            tilTwo.error = getString(R.string.numbertwo_required)

        }
    }
}