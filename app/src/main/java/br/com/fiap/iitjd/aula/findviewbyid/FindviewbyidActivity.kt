package br.com.fiap.iitjd.aula.findviewbyid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.iitjd.R

class FindviewbyidActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_aula_find_view_by_id)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val txtMensagem = findViewById<TextView>(R.id.txtMensagem)
        val btnCliqueMe = findViewById<Button>(R.id.btnCliqueMe)

        btnCliqueMe.setOnClickListener {
            val nome = edtNome.text.toString()
            txtMensagem.text = "Bem vindo $nome"
        }
    }

}