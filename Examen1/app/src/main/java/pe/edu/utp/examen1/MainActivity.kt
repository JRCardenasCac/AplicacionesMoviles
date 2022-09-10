package pe.edu.utp.examen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var artefacto = Artefacto()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cmbArtefactos.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, pos: Int, p3: Long) {
                var precios: Array<Double> =
                    arrayOf(600.0, 400.5, 1200.0, 1500.0, 1600.0, 2000.0, 2400.0)
                artefacto.nombre = cmbArtefactos.selectedItem.toString()
                artefacto.precio = precios[pos]
                txtPrecio.setText("Precio al contado S/ ${artefacto.precio}")
                var dir: Int = resources.getIdentifier(
                    "drawable/" + artefacto.nombre, null,
                    packageName
                )
                imageView.setImageResource(dir)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    public fun calcular(v: View) {
        when (rgpCuotas.checkedRadioButtonId) {
            R.id.cuota6m -> artefacto.meses = 6
            R.id.cuota12m -> artefacto.meses = 12
            R.id.cuota18m -> artefacto.meses = 18
        }
        val intent: Intent = Intent(this, ProformaActivity::class.java)
        intent.putExtra("artefacto", artefacto)
        startActivity(intent)
    }
}