package br.com.rodolphohiroshi.dsp20191.aulas2124;

import java.io.*;
import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Rodolpho Hiroshi Takahashi", "201000931", "Software para Persistencia", "85%", 6.0, 8.0);
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(aluno);
        escreveArquivo(list);
        ArrayList<Object> read = readFromFile("src/main/resources/aluno.dat");
        for(Object al : read) {
            System.out.println(al.toString());
        }
    }

    public static void escreveArquivo(ArrayList<Object> alunos) {
        File newFile = new File("src/main/resources/aluno.dat");
        try {
            newFile.delete();
            newFile.createNewFile();

            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(newFile));
            output.writeObject(alunos);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Object> readFromFile(String filename) {
        ArrayList<Object> alunos = new ArrayList<Object>();
        try {
            File fileRead = new File(filename);
            if(fileRead.exists()) {
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename));
                System.out.println("Aprovado com Sucesso");
                alunos = (ArrayList<Object>) input.readObject();
                input.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return alunos;
    }
}