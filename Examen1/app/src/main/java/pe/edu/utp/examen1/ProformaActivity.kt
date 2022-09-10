package pe.edu.utp.examen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_proforma.*

class ProformaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proforma)
        val artefacto = intent.getSerializableExtra("artefacto") as Artefacto
        var respuesta: String = "Nombre del artefacto: ${artefacto.nombre}"
        respuesta += "\n Precio al contado: ${artefacto.precio}"
        respuesta += "\n Meses a pagar: ${artefacto.meses}"
        respuesta += "\n Interes a pagar: ${artefacto.interes()}"
        respuesta += "\n Saldo: ${artefacto.saldo()}"
        respuesta += "\n Cuota mensual: ${artefacto.cuota()}"
        txtRespuesta.setText(respuesta)
    }

    public fun retornar(v: View) {
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}