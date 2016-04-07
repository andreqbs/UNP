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
public class Conta {

    int numero;
    String nome;
    double saldo;
    double limite;

    public Conta() {
      
    }
   
    public Conta(String nome) {
        this.nome = nome;
    }

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    

}
