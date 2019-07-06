package br.com.rodolphohiroshi.dsp20191.aulas0104.as;
/*Implementar um programa que leia o arquivo UF.csv (este arquivo contém os dados
de todas as unidades da federação, incluindo o Distrito Federal). Para cada linha
lida, um objeto “unidadeFederacao” deverá ser instanciado e adicionado a uma
List<UnidadeFederacao> ufs. Depois esta */

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Start{
    public static void main(String[] args) throws IOException {
        int qtdInteracao = 0;
        String csvFile = "src/main/resources/UF.csv";
        BufferedReader federacao = null;
        String separadorCSV = ",";
        String line = "";

        List<UnidadeFederacao> ufs = new ArrayList<UnidadeFederacao>();
        try {
            federacao = new BufferedReader(new FileReader(csvFile));
            while ((line = federacao.readLine()) != null && qtdInteracao <= 27) {
                if(qtdInteracao != 0) {
                    qtdInteracao++;
                    String[] dados = line.split(separadorCSV);
                    //System.out.println("UF [ID= " + dados[0] + " , SIGLA= " + dados[1] + " , NOME= " + dados[2] + " , CODREG= " + dados[3] + "]");
                    UnidadeFederacao unidadeFederacao = new UnidadeFederacao(dados[0],dados[1],dados[2],dados[3]);
                    ufs.add(unidadeFederacao);
                } else {
                    qtdInteracao++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (federacao != null) {
                try {
                    federacao.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        for(UnidadeFederacao uf : ufs) {
            System.out.println(uf.GetAttributes());
        }
    }
}