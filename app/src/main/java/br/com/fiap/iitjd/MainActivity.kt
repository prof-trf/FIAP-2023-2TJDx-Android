package br.com.fiap.iitjd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.iitjd.aula.AulaMainActivity
import br.com.fiap.iitjd.aula.Contato
import br.com.fiap.iitjd.aula.Database
import br.com.fiap.iitjd.databinding.ActivityAulaMainBinding
import br.com.fiap.iitjd.databinding.ActivityMainBinding
import br.com.fiap.iitjd.desafio.agenda.AgendaActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        supportActionBar?.title = "Fiap"
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        binding.btnAccessClasses.setOnClickListener {
            Database.adicionarContato(Contato("a", "b"))

            val intent = Intent(baseContext, AulaMainActivity::class.java)
            intent.putExtra("chave", "valor")
            startActivity(intent)
        }

        binding.btnAccessChallenge.setOnClickListener {
            val intent = Intent(baseContext, AgendaActivity::class.java)
            startActivity(intent)
        }
    }
}