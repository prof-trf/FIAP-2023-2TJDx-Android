package br.com.fiap.iitjd.aula.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.iitjd.databinding.ItemListagemBinding

class ListagemNomesAdapter(val pessoas: Array<Pessoa>): RecyclerView.Adapter<ListagemNomesAdapter.ListagemNomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListagemNomeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val binding: ItemListagemBinding = ItemListagemBinding.inflate(layoutInflater, parent, false)
        return ListagemNomeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pessoas.size
    }

    override fun onBindViewHolder(holder: ListagemNomeViewHolder, position: Int) {
        val pessoa = pessoas[position]

        holder.setNome(pessoa.nome)
        if(position != 1) {
            holder.setSobrenome(pessoa.sobrenome)
        }
    }

    class ListagemNomeViewHolder(val binding: ItemListagemBinding): RecyclerView.ViewHolder(binding.root){
        fun setNome(nome: String) {
            binding.txtNome.text = nome
        }

        fun setSobrenome(sobrenome: String) {
            binding.txtSobrenome.text = sobrenome
        }
    }

}

