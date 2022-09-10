package pe.edu.utp.s04recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Adapta1.onArtClick {
    var artefactos: ArrayList<Artefacto> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recy1.layoutManager = LinearLayoutManager(this)
        inicializar()
        val dp = Adapta1(artefactos, this)

        recy1.adapter = dp
    }

    fun inicializar() {
        artefactos.add(Artefacto(R.drawable.cocina, "Cocina", 100.0))
        artefactos.add(Artefacto(R.drawable.filmadora, "Filmadora", 200.0))
        artefactos.add(Artefacto(R.drawable.horno, "Horno", 300.0))
        artefactos.add(Artefacto(R.drawable.licuadora, "Licuadora", 400.0))
        artefactos.add(Artefacto(R.drawable.radio, "Radio", 500.0))
        artefactos.add(Artefacto(R.drawable.refrigeradora, "Refrigeradora", 600.0))
        artefactos.add(Artefacto(R.drawable.televisor, "Televisor", 700.0))
    }

    override fun onItemClick(artefacto: Artefacto) {
        val intent: Intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("dato", artefacto)
        startActivity(intent)
    }
}