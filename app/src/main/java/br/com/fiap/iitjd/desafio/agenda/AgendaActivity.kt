package br.com.fiap.iitjd.desafio.agenda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.iitjd.databinding.ActivityDesafioAgendaBinding

class AgendaActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDesafioAgendaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDesafioAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
    }

}