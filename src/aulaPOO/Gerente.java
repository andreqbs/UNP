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
public class Gerente extends Funcionario {//Herdando da classe Funcionario
    
    int numFuncGeren;  

    public Gerente(int numFuncGeren, float salario, String nome, int idade) {
        super(salario, nome, idade);
        this.numFuncGeren = numFuncGeren;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numFuncGeren;
    }

    public void setNumeroFuncionariosGerenciados(int numFuncGeren) {
        this.numFuncGeren = numFuncGeren;
    }
    //Re-escrita o método herdado da classe Funcionario
    @Override
     public double getBonificacao() {
        return getSalario() * 0.30;
    }
}
