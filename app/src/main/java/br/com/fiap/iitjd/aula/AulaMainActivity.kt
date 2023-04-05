package br.com.fiap.iitjd.aula

import android.R
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.iitjd.aula.findviewbyid.FindviewbyidActivity
import br.com.fiap.iitjd.aula.viewbinding.ViewBindingActivity
import br.com.fiap.iitjd.databinding.ActivityAulaMainBinding


class AulaMainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityAulaMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAulaMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setupRecycleView()
    }

    private fun setupRecycleView() {
        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.rcvAulas.layoutManager = linearLayoutManager
        binding.rcvAulas.itemAnimator = DefaultItemAnimator()

        val aulas: ArrayList<Pair<String, Class<*>>> = arrayListOf(
            "Centralizacao componente" to FindviewbyidActivity::class.java,
            "FindViewById" to FindviewbyidActivity::class.java,
            "ViewBinding" to ViewBindingActivity::class.java,
            "Eventos caixa de texto" to FindviewbyidActivity::class.java,
            "Eventos Botao" to FindviewbyidActivity::class.java
        )

        val adapter = AulasRecyclerViewAdapter(aulas)
        adapter.setOnItemClickListener {
            val aula = aulas[it]
            startActivity(Intent(this@AulaMainActivity, aula.second))

        /*
            val builder = AlertDialog.Builder(this@AulaMainActivity)
            builder.setMessage("Messagem")
                .setPositiveButton("Ok",
                    DialogInterface.OnClickListener { dialog, id ->
                        //acao
                    })
                .setNegativeButton("Cancelar",
                    DialogInterface.OnClickListener { dialog, id ->
                        // acao cancelar
                    })
            builder.create().show()
            */
        }
        binding.rcvAulas.adapter = adapter
    }


    class AulasRecyclerViewAdapter(val aulas: ArrayList<Pair<String, Class<*>>>):
        RecyclerView.Adapter<AulasRecyclerViewAdapter.AulasRecyclerViewHolder>() {

        private var onItemClickListener:  ((position: Int) -> Unit)? = null

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AulasRecyclerViewHolder {
            val v: View = LayoutInflater.from(parent.context).inflate(
                R.layout.simple_list_item_1,
                parent,
                false
            )

            return AulasRecyclerViewHolder(v)
        }

        override fun getItemCount(): Int = aulas.size

        override fun onBindViewHolder(holder: AulasRecyclerViewHolder, position: Int) {
            val aula = aulas[position]
            holder.setTitulo(aula.first)
            holder.view.setOnClickListener {
                onItemClickListener?.invoke(position)
            }
        }

        fun setOnItemClickListener(onItemClickListener: ((position: Int) -> Unit)? = null) {
            this.onItemClickListener = onItemClickListener
        }

        class AulasRecyclerViewHolder(val view: View): RecyclerView.ViewHolder(view){
            fun setTitulo(titulo: String) {
                view.findViewById<TextView>(android.R.id.text1).text = titulo
            }
        }
    }
}