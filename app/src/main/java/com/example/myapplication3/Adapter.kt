package com.example.myapplication3

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia


class CyclobikeViewholder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val tvCiclovia: TextView
    val tvComuna: TextView
    init {
        tvCiclovia = itemView.findViewById(R.id.tvCiclovia)
        tvComuna = itemView.findViewById(R.id.tvComuna)
    }
}

class CycleAdapter (val lista: List<Ciclovia>): RecyclerView.Adapter<CyclobikeViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclobikeViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CyclobikeViewholder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: CyclobikeViewholder, position: Int) {
        val ciclovia = lista[position]
        Log.d("CycloAdapter", ciclovia.toString())
        //lista.get(position)

        holder.tvComuna.text = ciclovia.comuna
        holder.tvCiclovia.text = ciclovia.nombre
    }

}