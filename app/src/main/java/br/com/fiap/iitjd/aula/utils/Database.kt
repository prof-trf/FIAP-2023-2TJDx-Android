package br.com.fiap.iitjd.aula

class Contato(val nome: String, val telefone: String)

object Database {

    private var contatos = arrayListOf<Contato>()

    fun adicionarContato(contato: Contato): Int {
        contatos.add(contato)
        return contatos.size
    }

    fun recuperaContato(index: Int): Contato {
        return contatos[index]
    }

    fun alterarContato(contato: Contato) {
        val index = contatos.indexOf(contato)
        contatos.set(index, contato)
    }

    fun removerContato(contato: Contato) {
        val index = contatos.indexOf(contato)
        contatos.removeAt(index)
    }

}