package com.example.madlib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jugar(view: View){

        val primerClue= findViewById<EditText>(R.id.editText).text.toString()
        val segundoClue=findViewById<EditText>(R.id.editText2).text.toString()
        val tercerClue= findViewById<EditText>(R.id.editText3).text.toString()
        val cuartaClue= findViewById<EditText>(R.id.editText4).text.toString()
        val quintaClue= findViewById<EditText>(R.id.editText5).text.toString()


        val intent = Intent(this,SecondActivity::class.java)
        val bundle :Bundle =Bundle()
        bundle.putString("primeraClave",primerClue)
        intent.putExtras(bundle)

        bundle.putString("segundaClave",segundoClue)
        intent.putExtras(bundle)

        bundle.putString("terceraClave",tercerClue)
        intent.putExtras(bundle)

        bundle.putString("cuartaClave",cuartaClue)
        intent.putExtras(bundle)

        bundle.putString("quintaClave",quintaClue)
        intent.putExtras(bundle)

        startActivity(intent)
    }
}
