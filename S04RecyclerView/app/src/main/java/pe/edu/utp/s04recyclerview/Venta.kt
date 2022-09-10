package pe.edu.utp.s04recyclerview

class Venta : Artefacto() {
    var cantidad: Int = 0
    fun total(): Double {
        return precio * cantidad
    }
}