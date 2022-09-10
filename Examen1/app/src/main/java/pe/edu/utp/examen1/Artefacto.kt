package pe.edu.utp.examen1

import java.io.Serializable

class Artefacto : Serializable {

    var nombre: String = ""
    var precio: Double = 0.0
    var meses: Int = 0

    fun interes(): Double {
        var interes: Double = 0.0
        when (meses) {
            6 -> interes = precio * 0.10
            12 -> interes = precio * 0.20
            18 -> interes = precio * 0.30
        }
        return interes
    }

    fun saldo(): Double {
        return precio + interes()
    }

    fun cuota(): Double {
        return saldo() / meses
    }
}