package com.example.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.proyecto1.model.Triangulo

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var tri = Triangulo()
        tri.n1 = lado1.text.toString().toInt()
        tri.n2 = lado2.text.toString().toInt()
        tri.n3 = lado3.text.toString().toInt()
        if (!tri.valida()) {
            textView2.setText("No forma Triangulo")
            return
        }
        val cad = tri.Tipo()
        val
                dir: Int = resources.getIdentifier(
            "drawable/" + cad, null,
            packageName
        )
        imageView.setImageResource(dir)
        textView2.setText("El area es " + tri.area() + "tipo:" + tri.Tipo())
    }
}