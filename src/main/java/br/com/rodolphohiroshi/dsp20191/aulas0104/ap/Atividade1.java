package br.com.rodolphohiroshi.dsp20191.aulas0104.ap;

import java.io.*;

public class Atividade1 {
    public static void main(String[] args){
        File file = new File("src/main/resources/Atividade1.txt");
        try{
            //Cria arquivo txtC:\Users\Rodolpho\IdeaProjects\Estudo_Java\
           // file.createNewFile();

            //FileWriter fileWriter = new FileWriter(file);
           // PrintWriter escrever = new PrintWriter(fileWriter);
            //escrever.write("Atividade 2 concluida");

           // escrever.close();
           // fileWriter.close();
            //Ler arquivo Txt
            FileReader ler = new FileReader(file);
            BufferedReader lerlinha = new BufferedReader(ler);
            String linha = lerlinha.readLine();

            while(linha != null){
                System.out.println(linha);
                linha = lerlinha.readLine();
            }

            //AS-aulas0104
            Escrever esc = new Escrever();

            for (int i = 0; i <6 ; i++) {
                esc.escrever(file, "texto "+i+"\r\n");

            }


        } catch(IOException ex){

        }
    }
}