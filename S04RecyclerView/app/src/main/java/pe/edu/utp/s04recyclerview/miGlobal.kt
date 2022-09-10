package pe.edu.utp.s04recyclerview

import android.app.Application

class miGlobal : Application() {
    companion object {
        var lisArt: ArrayList<Venta> = ArrayList()
    }
}