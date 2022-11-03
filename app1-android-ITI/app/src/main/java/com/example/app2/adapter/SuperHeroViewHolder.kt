package com.example.app2.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app2.R
import com.example.app2.SuperHero

/* Esta clase se encarga de coger los atributos y pintarlos */
class SuperHeroViewHolder(view:View):RecyclerView.ViewHolder(view) {
    /* Recibe por parametro la vista item_superhero */

    /* Le pasaremos el Layout para que este pueda modificar*/
    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo= view.findViewById<ImageView>(R.id.ivSuperHero)

    /* Lo usaremos para dar contexto */
    fun render (superHeroModel: SuperHero){
        superHero.text = superHeroModel.superhero
        realName.text = superHeroModel.realName
        publisher.text= superHeroModel.publisher
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)
    } /* Usamos la libreria Glide para poder mostrar fotos de internet */
}