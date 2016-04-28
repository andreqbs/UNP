/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPoo;

import javax.swing.DefaultListModel;

/**
 *
 * @author aqbs
 */
public class Controlador {
    
    static Controlador geral = new Controlador();
    
    private Automovel vendidos[] = new Automovel[100];
    private int topoV = 0;
    
    private Automovel estoque[] = new Automovel[100];
    private int topoE = 0;
    
    public void venda(Automovel x) {
        float venda = x.desconto();
        x.setValorVenda(venda);
        vendidos[topoV] = x;
        topoV++;
        for (int i = 0 ; i < topoE; i++) {
            if(estoque[i] != null && estoque[i].getId() == x.getId())
                 estoque[i] = null;
        }
    }
    
    public Automovel pesquisar(int id) {
        for (int i = 0; i < topoE; i ++) {
            if(estoque[i] != null && estoque[i].getId() == id)
                return estoque[i];
        }
        return null;
    }
    
    public DefaultListModel listar() {
        DefaultListModel x = new DefaultListModel();
        for (int i = 0; i < topoE; i ++) {
            if (estoque[i] != null)
                x.addElement(estoque[i].getId() + " " + estoque[i].getMarca() + " " + estoque[i].getModelo() + " " + estoque[i].getAnoFab());
        }
        
        return x;
    }
    
    public void compra(Automovel x) {
        x.setValorVenda(x.getValorComprar() + 5000);
        estoque[topoE] = x;
        topoE++;
        
    }
    
    public float total() {
       int i = 0;
       float totala = 0;
       while(vendidos[i] != null) {
           totala += vendidos[i].getValorVenda();
           i++;
           
       }
       return totala;
    }
    
    public static void main(String[] args) {
        Carro a = new Carro(2, false, false, false, "peugeot", "208", 2015, 40000, 45000);
        Caminhão a1 = new Caminhão(1, true, true, true, 0, "volvo", "p200", 300, 40, 5);
        Controlador c = new Controlador();
        c.venda(a);
        c.venda(a1);
        
        System.out.println(c.total());
    }
    
}
