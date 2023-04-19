package br.com.fiap.iitjd.aula.listagem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.iitjd.databinding.ItemListagemBinding

class ListagemAdapter(val pessoas: Array<Pessoa>): RecyclerView.Adapter<ListagemAdapter.ListagemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListagemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemListagemBinding.inflate(layoutInflater, parent, false)
        return ListagemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pessoas.size
    }

    override fun onBindViewHolder(holder: ListagemViewHolder, position: Int) {
        val pessoa = pessoas[position]
        holder.setNome(pessoa.nome)

        if(position != 1) {
            holder.setSobrenome(pessoa.sobrenome)
        }
    }

    class ListagemViewHolder(val binding: ItemListagemBinding): RecyclerView.ViewHolder(binding.root) {

        fun setNome(nome: String) {
            binding.txtNome.text = nome
        }

        fun setSobrenome(sobrenome: String) {
            binding.txtSobrenome.text = sobrenome
        }
    }
}