package com.example.app2
/* Esta clase toma el formato de la clase SuperHero para hacer una lista */
class SuperHeroProvider {
    companion object{
        val superheroList = listOf<SuperHero>(
            SuperHero(
                superhero = "Delvicier",
                publisher = "Dev novato",
                realName = "Christopher",
                photo = "https://mundoanimalsantafe.com.ar/wp-content/uploads/2018/12/para-que-sirven-los-bigotes-de-los-gatos-1.jpg"
            ),
            SuperHero(
                superhero = "Joel",
                publisher = "Esclavo de su novia",
                realName = "Agent 47",
                photo = "https://t2.ea.ltmcdn.com/es/posts/3/7/9/heridas_en_gatos_primeros_auxilios_21973_600.jpg"
            ),
            SuperHero(
                superhero = "Sr.Chris",
                publisher = "Artista nuevo",
                realName = "Cristobal",
                photo = "https://t1.uc.ltmcdn.com/es/posts/7/8/0/como_saber_si_mi_gato_esta_enfermo_17087_600.webp"
            ),
            SuperHero(
                superhero = "Meow",
                publisher = "Trabaja en dormir",
                realName = "gatito",
                photo = "https://www.interzoo.es/wp-content/uploads/2018/09/gatos-medicacion.jpg"
            ),
            SuperHero(
                superhero = "Karchez",
                publisher = "Streamer ESP",
                realName = "CR7",
                photo = "https://t2.uc.ltmcdn.com/es/posts/2/6/9/puedo_darle_ibuprofeno_a_mi_gato_aqui_la_respuesta_47962_600_square.jpg"
            ),
            SuperHero(
                superhero = "Wilfredo",
                publisher = "Cantante de exito",
                realName = "Excelente",
                photo = "https://hospitalveterinariodonostia.com/wp-content/uploads/2020/10/gatos.png"
            ),
            SuperHero(
                superhero = "Quakity",
                publisher = "Bilingue de exito",
                realName = "Mexican",
                photo = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Cat_November_2010-1a.jpg/220px-Cat_November_2010-1a.jpg"
            ),
        )
    }
}
