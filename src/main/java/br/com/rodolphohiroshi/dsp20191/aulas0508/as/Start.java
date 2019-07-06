package br.com.rodolphohiroshi.dsp20191.aulas0508.as;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Start {
    static File arq = new File("src/main/resources/avaliacao.dat");
    static Scanner ler = new Scanner(System.in);
    static DataOutputStream doStream;
    static FileOutputStream foStream;
    private static DataInputStream diStream;

    public static void main(String[] args) {
            callAluno();
            lerAluno();
        }
        private static void lerAluno() {
            Aluno aluno = new Aluno();
            String nomeAluno;
            Long matricula;
            Double n1;
            Double n2;
            try {
                FileInputStream fiStream = new FileInputStream(arq);
                diStream = new DataInputStream(fiStream);
                String s = diStream.readUTF();
                List<String> list = new ArrayList<>();
                list = Arrays.asList(s.split(","));
                nomeAluno = list.get(0);
                String mat =  list.get(1);
                matricula = Long.parseLong(mat);
                n1 = Double.parseDouble(list.get(2));
                n2 = Double.parseDouble(list.get(3));

                //Setando os valores para as variáveis da classe Aluno
                aluno.setNome(nomeAluno);
                aluno.setMatricula(matricula);
                aluno.setNota1(n1);
                aluno.setNota2(n2);

                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Nota 1: " + aluno.getNota1());
                System.out.println("Nota 2: " + aluno.getNota2());

                Double md = (aluno.getNota1() + aluno.getNota2())/2;
                System.out.println("Media das notas: " +md );
                if (md >= 5) {
                    System.out.println("Aluno Aprovado");
                } else {
                    System.out.println("Aluno Reprovado");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    private static void callAluno() {

        Aluno aluno = new Aluno();

        String nomeAluno;
        Long matricula;
        Double n1;
        Double n2;
        System.out.println("Insira o nome do aluno: ");
        nomeAluno = ler.nextLine();
        System.out.println("Insira a matricula do aluno: ");
        matricula = ler.nextLong();
        System.out.println("Insira a nota 1: ");
        n1 = ler.nextDouble();
        System.out.println("Insira a nota 2: ");
        n2 = ler.nextDouble();
        aluno.setNome(nomeAluno);
        aluno.setMatricula(matricula);
        aluno.setNota1(n1);
        aluno.setNota2(n2);

        salvarAluno(aluno);

    }

    private static void salvarAluno(Aluno aluno) {
        try {
            verificaArq();
            doStream.writeUTF(aluno.toString());
            doStream.close();
            foStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

        private static void verificaArq() throws IOException {
            try {
                foStream = new FileOutputStream(arq);
                doStream = new DataOutputStream(foStream);
            } catch (FileNotFoundException e) {
                arq.createNewFile();
                verificaArq();
            }
        }



}
