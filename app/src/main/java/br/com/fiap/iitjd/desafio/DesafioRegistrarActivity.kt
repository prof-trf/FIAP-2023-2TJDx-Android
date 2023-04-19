package br.com.fiap.iitjd.desafio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.iitjd.aula.utils.Contato
import br.com.fiap.iitjd.aula.utils.Database
import br.com.fiap.iitjd.databinding.ActivityDesafioRegistrarBinding

class DesafioRegistrarActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDesafioRegistrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDesafioRegistrarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        binding.button.setOnClickListener {
            // gravar contato
        }
    }

}