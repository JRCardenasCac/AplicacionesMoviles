package pe.edu.utp.s04recyclerview

import java.io.Serializable

open class Artefacto : Serializable {
    var imagen: Int = 0
    var descripcion: String = ""
    var precio: Double = 0.0

    constructor() {}

    constructor(imagen: Int, descripcion: String, precio: Double) {
        this.imagen = imagen
        this.descripcion = descripcion
        this.precio = precio
    }
}