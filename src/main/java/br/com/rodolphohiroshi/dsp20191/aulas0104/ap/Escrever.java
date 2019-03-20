package br.com.rodolphohiroshi.dsp20191.aulas0104.ap;

import java.io.*;

public class Escrever {

    public void escrever(File Caminho, String texto) {
        try {
            FileWriter fw = new FileWriter(Caminho);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(texto);
            pw.flush();
            pw.close();

        } catch (IOException ex) {

        }
    }

}