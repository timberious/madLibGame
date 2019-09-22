package com.example.madlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    val primerClue= findViewById<TextView>(R.id.textView3)
    val segundaClue= findViewById<TextView>(R.id.textView6)
    val terceraClue= findViewById<TextView>(R.id.textView9)
    val cuartaClue= findViewById<TextView>(R.id.textView11)
    val quintaClue= findViewById<TextView>(R.id.textView13)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        mostrar()
    }

    fun mostrar(){
        var bundle= intent.extras
        primerClue.text= bundle?.getString("primeraClave")

        segundaClue.text= bundle?.getString("segundaClave")

        terceraClue.text= bundle?.getString("terceraClave")

        cuartaClue.text= bundle?.getString("cuartaClave")

        quintaClue.text= bundle?.getString("quintaClave")

    }

    fun finish(view: View){

        finish()
    }
}
