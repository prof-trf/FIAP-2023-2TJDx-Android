package br.com.fiap.iitjd

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import br.com.fiap.iitjd.aula.AulaMainActivity
import br.com.fiap.iitjd.aula.Contato
import br.com.fiap.iitjd.aula.Database
import br.com.fiap.iitjd.databinding.ActivityAulaMainBinding
import br.com.fiap.iitjd.databinding.ActivityMainBinding

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

        //binding.btnAccessProject.setOnClickListener(Manipulador(binding.imgFiap))
        binding.btnAccessProject.setOnClickListener {
            //binding.imgFiap.setImageResource(R.drawable.logotipo)
            val toast = Toast.makeText(baseContext, "Em construção", Toast.LENGTH_LONG)
            toast.show()

            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setMessage(R.string.fiap)
            builder.setPositiveButton(android.R.string.ok, DialogInterface.OnClickListener { dialog, id ->
                binding.textView.text = "Apertou o botão do Alert"
            })
            builder.setNegativeButton(android.R.string.cancel, DialogInterface.OnClickListener { dialog, id ->
                dialog.dismiss()
            })
            val dialog = builder.create()
            dialog.show()
        }

        binding.btnAccessClasses.setOnClickListener {
            val intent = Intent(baseContext, AulaMainActivity::class.java)
            intent.putExtra("chave", "valor")
            startActivity(intent)
        }
    }
}

class Manipulador(private val image: ImageView): View.OnClickListener {
    override fun onClick(view: View?) {
        image.setImageResource(R.drawable.logotipo)
    }

}