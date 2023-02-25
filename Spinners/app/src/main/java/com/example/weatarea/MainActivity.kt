package com.example.weatarea

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.weatarea.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btn: Button = findViewById<Button>(R.id.bncambio)
        val sp_izquierda:Spinner=findViewById(R.id.sp_izquierda)

        val sp_derecha:Spinner=findViewById(R.id.sp_derecha)

        btn.setOnClickListener{
            val valor_derecha:String=sp_derecha.getSelectedItem() as String
            val valor_izquierda:String=sp_izquierda.getSelectedItem() as String

            val izq:Int=valor_izquierda.toInt()
            val dere:Int=valor_derecha.toInt()
            if(izq>dere){
                Toast.makeText(this,"El de la izquierda es mayor $izq>$dere",Toast.LENGTH_SHORT).show()

            }else if(izq<dere){
                Toast.makeText(this,"El de la derecha es mayor $dere>$izq",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Los dos son iguales $dere==$izq",Toast.LENGTH_SHORT).show()
            }
        }

    }
}