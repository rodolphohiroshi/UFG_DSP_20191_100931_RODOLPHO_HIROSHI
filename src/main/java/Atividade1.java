import java.io.*;

public class Atividade1{

    public static void main(String[] args) {

        File file = new File("src/main/resources/Atividade1.txt");

        try{
            //Cria arquivo txt
            file.createNewFile();

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter escrever = new BufferedWriter(fileWriter);
            escrever.write("Atividade 1 concluida");

            escrever.close();
            fileWriter.close();


            //Ler arquivo Txt
            FileReader ler = new FileReader(file);
            BufferedReader lerlinha = new BufferedReader(ler);
            String linha = lerlinha.readLine();

           while(linha != null){
                System.out.println(linha);
                linha = lerlinha.readLine();
            }


            } catch(IOException ex){

        }

    }


}

