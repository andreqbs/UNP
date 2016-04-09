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
public class PrincipalPolimorfismo {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente(10, 1000, "Andre", 24);
        System.out.println(gerente.getBonificacao()); 
    } 
}
    

