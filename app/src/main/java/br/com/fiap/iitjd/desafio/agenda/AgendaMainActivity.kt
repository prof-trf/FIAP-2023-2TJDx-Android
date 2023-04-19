package br.com.fiap.iitjd.desafio.agenda

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.iitjd.aula.Contato
import br.com.fiap.iitjd.aula.Database
import br.com.fiap.iitjd.databinding.ActivityDesafioAgendaBinding

class AgendaMainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDesafioAgendaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDesafioAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        binding.btnRegistrar.setOnClickListener {
            //vou chamar uma outra tela de cadastro

            //exemplo:
//            val campox = binding.btnListar.text.toString()
//            if(campox.length < 3) {
//                alerta
//            }
//
//            if (campox.length < 11) {
//                alert nao é telefone
//            }
//
//            val contato = Contato(campox, campoy)
//            Database.adicionarContato(contato)
        }

        binding.btnConsultar.setOnClickListener {
            val toast = Toast.makeText(this, "Em construção", Toast.LENGTH_LONG)
            toast.show()
        }

        binding.btnListar.setOnClickListener {
            val builder = AlertDialog.Builder(this) //tem que ser a activity
            builder.setMessage("Infelizmente ainda não fiz nada aqui")

            builder.setPositiveButton("Yep", DialogInterface.OnClickListener { dialog, id ->
                val toast = Toast.makeText(this, "Em construção", Toast.LENGTH_LONG)
                toast.show()
            })

            builder.setNegativeButton("Sair", DialogInterface.OnClickListener { dialog, id ->
                dialog.dismiss()
            })

            val dialog = builder.create()
            dialog.show()
        }
    }

}