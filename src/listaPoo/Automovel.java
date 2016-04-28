/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaPoo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author aqbs
 */
public class Automovel {

    private int id;
    private String marca;
    private String modelo;
    private int anoFab;
    private float valorCompra;
    private float valorVenda;

    public Automovel(int id, String marca, String modelo, int anoFab, float valorComprar, float valorVenda) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.valorCompra = valorComprar;
        this.valorVenda = valorVenda;
    }

    public Automovel(int id, String marca, String modelo, int anoFab, float valorComprar) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.valorCompra = valorComprar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public float desconto() {
        return valorVenda * 0.95f;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public float getValorComprar() {
        return valorCompra;
    }

    public void setValorComprar(float valorComprar) {
        this.valorCompra = valorComprar;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void ligar() {
        String local = "/Users/aqbs/Documents/musica.wav";
        InputStream arquivo = null;
        AudioStream audio = null;
        
        try {
            arquivo = new FileInputStream(local);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir o arquivo");
        }

        //abrir arquivo
        try {
            audio = new AudioStream(arquivo);
        } catch (IOException ex) {
            System.out.println("Não foi possivel tocar o arquivo");
        }

        // tocar
        AudioPlayer.player.start(audio);

    }
   
}
