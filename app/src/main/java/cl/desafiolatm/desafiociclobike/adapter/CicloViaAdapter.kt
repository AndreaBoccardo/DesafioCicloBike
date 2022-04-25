package cl.desafiolatm.desafiociclobike.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.desafiolatm.desafiociclobike.R
import cl.desafiolatm.desafiociclobike.databinding.ActivityMainBinding
import cl.desafiolatm.desafiociclobike.databinding.ItemLayoutBinding
import cl.desafiolatm.desafiociclobike.modelo.CicloVia

class CicloViaAdapter(var lista:List<CicloVia>) : RecyclerView.Adapter<CicloViaAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding : ItemLayoutBinding = ItemLayoutBinding.bind(itemView)

        fun bindData(cicloVia: CicloVia){
            binding.tvNombreDetalle.text = cicloVia.nombre
            binding.tvComunaDetalle.text = cicloVia.comuna
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindData(lista[position])
    }

    override fun getItemCount(): Int = lista.size

    fun setMiLista(lista: List<CicloVia>){
        this.lista = lista
        notifyDataSetChanged()
    }

    fun filtrar(lista: List<CicloVia>){
        this.lista = lista
        notifyDataSetChanged()
    }
}