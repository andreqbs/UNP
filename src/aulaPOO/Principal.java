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
public class Principal {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.numero = 190287;
        minhaConta.limite = 200;
        minhaConta.nome = "André";
        minhaConta.saldo = 6000.0;
        System.out.println("Saldo atual: " + minhaConta.saldo);
    }

}
