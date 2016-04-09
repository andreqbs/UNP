/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unp.aed.entidade;

/**
 *
 * @author aqbs
 */
public class Pessoa {

    String nome;
    int idade ;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void setNome(String valor) {
        nome = valor;
    }

    String getNome() {
        return nome;
    }

    void setIdade(int valor) {
        idade = valor;
    }

    int getIdade() {
        return idade;
    }
}
