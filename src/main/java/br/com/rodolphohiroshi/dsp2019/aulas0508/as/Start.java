package br.com.rodolphohiroshi.dsp2019.aulas0508.as;
import java.io.*;

public class Start {
    public static void main(String[] args) {
        Aluno a = new Aluno();

        try {

            FileOutputStream file = new FileOutputStream("src/main/resources/Atividade_aulas0508.dat");

            DataOutputStream data = new DataOutputStream(file);
            data.writeUTF(a.alunoNome("Rodolpho\n"));
            data.writeLong(a.alunoMatricula(12345L));
            data.writeUTF("\n") ;
            data.writeDouble(a.alunoNota1(8.0));
            data.writeUTF("\n") ;
            data.writeDouble(a.alunoNota2(10.0));
            data.flush();
            data.close();
            //System.out.println("Succcess...");


        } catch (IOException ex) {

        }

    }
}
