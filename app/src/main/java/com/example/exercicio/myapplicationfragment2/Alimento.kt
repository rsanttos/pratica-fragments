package com.example.exercicio.myapplicationfragment2

data class Alimento(var nome: String, var preco: Double) {

    override fun toString(): String {
        return this.nome
    }
}