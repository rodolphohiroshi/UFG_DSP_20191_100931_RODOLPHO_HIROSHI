package br.com.rodolphohiroshi.dsp20191.aulas0104.ap;

import java.io.File;
import java.io.*;
import java.util.Scanner;
public class ManipulaArquivo {

    public static void main(String[] args) throws IOException  {


        File arq = new File("src/main/resources/primeiroArquivo.txt");
        arq.createNewFile();

        PrintWriter pw = new PrintWriter (new BufferedWriter (new FileWriter (arq)));
        pw.printf("teste");

        Scanner ler = new Scanner(System.in);

            FileReader arq1 = new FileReader(arq);
            BufferedReader lerArq = new BufferedReader(arq1);

            String linha = lerArq.readLine();

            linha = lerArq.readLine(); // lê da segunda até a última linha


            arq1.close();


        }

    }



