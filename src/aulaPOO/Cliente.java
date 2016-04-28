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
public class Cliente extends Pessoa {
    
    private String funcao;

    public Cliente(String funcao, String nome, int idade) {
        super(nome, idade);
        this.funcao = funcao;
    }

    
    

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    
}
