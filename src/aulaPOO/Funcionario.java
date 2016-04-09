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
public class Funcionario extends Pessoa {

    private float salario;

    public Funcionario(float salario, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        
    }

    public double getBonificacao() {
        return this.salario * 0.20;
    }
}
