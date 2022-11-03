package com.example.app2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app2.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btConsultar.setOnClickListener{
        }

        val db = FirebaseFirestore.getInstance()
        var datos = ""
        db.collection("amigos")
            .get()
            .addOnSuccessListener { resultado ->
                for(documento in resultado) {
                    datos += "${documento.id}: ${documento.data}\n"
                }
                binding.tvConsulta.text = datos
            }
            .addOnFailureListener{ exception ->
                binding.tvConsulta.text = "No se pudo conectar"
            }
    }
}