/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaPOO;

/**
 *
 * @author aqbs
 */
public class Principal {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setNumero(190287);
        minhaConta.setLimite(200);
        minhaConta.setNome("André");
        minhaConta.setSaldo(6000.0);
        System.out.println("Saldo atual: " + minhaConta.getSaldo());
    }

}
