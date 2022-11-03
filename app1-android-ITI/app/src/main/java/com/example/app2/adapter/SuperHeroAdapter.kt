package com.example.app2.adapter
/* Esta clase nos permitira tomar un simple listado y convertirlo en un RecyclerView */
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app2.R
import com.example.app2.SuperHero /* agregamos la lista de SuperHero */

/* Aqui vamos a extender o sobre escribimos los metodos para poder utilizarlos */
class SuperHeroAdapter(private val superherolist:List<SuperHero>): RecyclerView.Adapter<SuperHeroViewHolder>() {
    /* Aqui estamos forzados a implementamos los siguientes metodos del RecyclerView */

    /* Devuelve al ViewHolder cada item*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    } /* Esta es la vista que tendra cada item y se enviara al ViewHolder */

    /* Este metodo va a pasar por cada uno de los item y se los pasara a la funcion render */
    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superherolist[position]
        holder.render(item)
    }

    /* Debe devolver el tamaño de la lista */
    override fun getItemCount(): Int = superherolist.size
}