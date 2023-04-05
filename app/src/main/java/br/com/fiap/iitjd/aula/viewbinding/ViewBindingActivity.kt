package br.com.fiap.iitjd.aula.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.iitjd.databinding.ActivityAulaFindViewByIdBinding

class ViewBindingActivity: AppCompatActivity() {

    private lateinit var binding: ActivityAulaFindViewByIdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_aula_find_view_by_id)
        binding = ActivityAulaFindViewByIdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

//        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtNome = binding.edtNome
//        val txtMensagem = findViewById<TextView>(R.id.txtMensagem)
        val txtMensagem = binding.txtMensagem
//        val btnCliqueMe = findViewById<Button>(R.id.btnCliqueMe)
        val btnCliqueMe = binding.btnCliqueMe

        btnCliqueMe.setOnClickListener {
            val nome = edtNome.text.toString()
            txtMensagem.text = "Bem vindo $nome"
        }
    }

}