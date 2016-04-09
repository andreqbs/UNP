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
public class ControleBonificacao {

    private double total = 0;

    public void registra(Funcionario funcionario) {
        total += funcionario.getBonificacao();
    }

    public double getTotal() {
        return this.total;
    }

    public static void main(String[] args) {
        
        ControleBonificacao controle = new ControleBonificacao();
        
        //Funcionario funcionario1 = new Funcionario("Kleber", 22);
        //funcionario1.setSalario(1000);
        //controle.registra(funcionario1);

       // Gerente funcionario2 = new Gerente("Andre", 23);
        //funcionario1.setSalario(5000);
        //controle.registra(funcionario2);
        
        System.out.println(controle.getTotal());
    }

}
