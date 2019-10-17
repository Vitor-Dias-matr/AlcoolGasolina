package com.example.alcoolougasolina2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btCalcular(view: View) {

        val precoAlcool = text_preco_alcool.text.toString()
        val precoGasolina = text_preco_gasolina.text.toString()

        val kmgaso = km_gasolina.text.toString()
        val kmalco = km_alcool.text.toString()

        calcularMelhorPreco(precoAlcool, precoGasolina ,kmgaso,kmalco)
    }

    fun calcularMelhorPreco(precoAcool: String, precoGasolina: String ,kmgaso : String ,kmalco: String ) {
        val valorAlcool = precoAcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        val km_gasolina = kmgaso.toDouble()
        val km_alcool = kmalco.toDouble()


        val resultadoPrecoAlcool = valorAlcool/km_alcool
        val resultadoPrecoGasolina = valorGasolina/ km_gasolina

        if (resultadoPrecoAlcool < resultadoPrecoGasolina) {
            text_resultado.setText("Melhor Utilizar Álcool!")
        }
        else {
            text_resultado.setText("Melhor Utilizar Gasolina!")
        }
        if (resultadoPrecoAlcool == resultadoPrecoGasolina ){
            text_resultado.setText("Ultilize o Combustível de sua preferencia!")
        }
        else{
            text_resultado.setText("Error!")
        }
    }

}
