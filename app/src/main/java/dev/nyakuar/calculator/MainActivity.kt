package dev.nyakuar.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etAdd: EditText
    lateinit var etsub: EditText
    lateinit var btnadd: Button
    lateinit var btnsubtract: Button
    lateinit var btnmultiply: Button
    lateinit var btnmoulus: Button
    lateinit var tvanswer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnmoulus = findViewById(R.id.btnmodulus)
        tvanswer = findViewById(R.id.tvanswer)
        etsub = findViewById(R.id.etsub)
        etsub= findViewById(R.id.etsub)
        tvanswer= findViewById(R.id.tvanswer)
        btnadd.setOnClickListener {
            var num1 = Int
            var num2 = Int
//            (num1 ,num2)
    }

        btnmultiply.setOnClickListener {
            var x = etsub.text
            var y = etsub.text
//            multiply(x,y)
}


        fun modulus(t: Int, e: Int) {
            var modulus=t%e
            tvanswer.text=btnmoulus.toString()



        }

        fun multiply(x: Int, y: Int) {
            var add=x*y
            tvanswer.text=btnmultiply.toString()


        }

        fun add (num1: Int, num2: Int) {
            var add=num1+num2
            tvanswer.text=add.toString()


        }
        fun subtract(a: Int, b: Int) {
            var subtract=a-b




        }
    }

}



















