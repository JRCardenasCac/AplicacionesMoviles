package pe.edu.utp.s04recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vista1.view.*

class Adapta1(private val artefactos: List<Artefacto>, private val itemClick: onArtClick) :
    RecyclerView.Adapter<Adapta1.viewHolder>() {
    class viewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val imgArtefacto: ImageView = item.imgArtefacto
        val precio: TextView = item.txtPrecio
        val descripcion: TextView = item.txtDescripcion
    }

    interface onArtClick {
        fun onItemClick(artefacto: Artefacto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.vista1, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        //Relacionar el dato con los atributos de holder
        val artefacto = artefactos.get(position)
        holder.imgArtefacto.setImageResource(artefacto.imagen)
        holder.descripcion.setText(artefacto.descripcion)
        holder.precio.setText("S/ " + artefacto.precio)
        holder.itemView.setOnClickListener { itemClick.onItemClick(artefacto) }
    }

    override fun getItemCount(): Int {
        return artefactos.size
    }
}