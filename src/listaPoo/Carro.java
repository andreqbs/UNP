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
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author aqbs
 */
public class Carro extends Automovel{
    
    private boolean ar;
    private boolean alarme;
    private boolean farol;

    public Carro(int id, boolean ar, boolean alarme, boolean farol, String marca, String modelo, int anoFab, float valorComprar, float valorVenda) {
        super(id, marca, modelo, anoFab, valorComprar, valorVenda);
        this.ar = ar;
        this.alarme = alarme;
        this.farol = farol;
    }

    public Carro(int id, String marca, String modelo, int anoFab, float valorComprar) {
        super(id, marca, modelo, anoFab, valorComprar);
    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isFarol() {
        return farol;
    }

    public void setFarol(boolean farol) {
        this.farol = farol;
    }
    
    @Override
    public void ligar() {
       String local = "/Users/aqbs/NetBeansProjects/ProjetoCar/src/outros/carro.wav";
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
    
    
    @Override
    public float desconto() {
        float des = 0;
        if (!alarme) {
            des += 1000;
        }
        if (!farol) {
            des += 1000;
        }
        if (!ar) {
            des += 1000;
        }

        return super.getValorVenda() - des;
    }
    
    
    
}
