package br.com.fiap.iitjd.desafio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.iitjd.databinding.ActivityDesafioMainBinding

class DesafioActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDesafioMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDesafioMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        binding.btnRegistrar.setOnClickListener {
            val intent = Intent(baseContext, DesafioRegistrarActivity::class.java)
            startActivity(intent)
        }
    }
}