package com.example.proyecto1.model

import kotlin.math.sqrt

class Triangulo {
    var n1: Int = 0
    var n2: Int = 0
    var n3: Int = 0

    constructor(n1: Int, n2: Int, n3: Int) {
        this.n1 = n1
        this.n2 = n2
        this.n3 = n3
    }

    constructor() {}

    fun valida(): Boolean {
        if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2)
            return true
        else
            return false
    }

    fun Tipo(): String {
        var tp: String = ""
        if (n1 == n2 && n2 == n3 && n3 == n1)
            tp = "equilatero"
        else if (n1 != n2 && n2 != n3 && n3 != n1)
            tp = "escaleno"
        else
            tp = "isoceles"
        return tp
    }

    fun area(): Double {
        var sp: Double = 0.0
        sp = ((n1 + n2 + n3) / 2).toDouble()
        var are = sqrt(sp * (sp - n1) * (sp - n2) * (sp - n3))
        return are
    }
}