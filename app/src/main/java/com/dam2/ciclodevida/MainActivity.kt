package com.dam2.ciclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var horaInicial: Long= 0;
    var horaPausada: Long=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "Estoy en onCreate")





    }


    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "Estoy en onStart")
    }

    override fun onResume() {
        super.onResume()
        horaInicial= System.nanoTime();
        // Imprimimos en la ventana del "Logcat"
        Log.i("Estado", "Estoy en onResume")
        Log.i("Estado", horaInicial.toString())
    }

    override fun onPause() {
        super.onPause()
        horaPausada = System.nanoTime();
        val horaFinal: Long = (horaPausada - horaInicial)/1000000000;
        // Imprimimos en la ventana del "Logcat"
        Log.i("Estado", "Estoy en onDestroy")
        Log.i("Estado", horaPausada.toString())
        Log.i("Estado", "Este es el tiempo pausado en segundos: ${horaFinal.toInt()}")

    }
    override fun onStop() {
        super.onStop()

        // Imprimimos en la ventana del "Logcat"
        Log.i("Estado", "Estoy en onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        // Imprimimos en la ventana del "Logcat"
        Log.i("Estado", "Estoy en onDestroy")
    }

}