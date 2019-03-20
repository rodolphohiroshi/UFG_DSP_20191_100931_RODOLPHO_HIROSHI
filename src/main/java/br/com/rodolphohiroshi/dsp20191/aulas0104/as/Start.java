package br.com.rodolphohiroshi.dsp20191.aulas0104.as;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        File arquivoCSV = new File("src/main/resources/UF.CSV");

        try {

            //cria um scanner para ler o arquivo
            Scanner leitor = new Scanner(arquivoCSV);

            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivo = new String();

            //ignora a primeira linha do arquivo
            //leitor.nextLine();
            List<String> ufs = new ArrayList<String>();

            //percorre o arquivo
            while (leitor.hasNext()) {
                linhasDoArquivo = leitor.nextLine();
                //recebe cada linha do arquivo
                ufs.add(linhasDoArquivo);

            }
            Iterator<String> iterator = ufs.iterator();
            while (iterator.hasNext()){
                String next = iterator.next();
            }
            for(String next: ufs){
                System.out.println(next);
            }

        } catch (FileNotFoundException e) {

        }
    }
}

/*

        BufferedReader conteudoCSV = null;

        String linha = "";

        String csvSeparadorCampo = ",";
        try{
            conteudoCSV = new BufferedReader(new FileReader(arquivoCSV));
            while((linha = conteudoCSV.readLine()) != null){


            }


        }*/
