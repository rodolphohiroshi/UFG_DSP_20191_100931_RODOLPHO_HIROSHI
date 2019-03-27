package br.com.rodolphohiroshi.dsp2019.aulas0508.as;

public class Aluno {
    String nome;
    long matricula;
    double nota1, nota2;

    public String alunoNome(String name) {
        this.nome = name;
        return this.nome;
    }

    public Long alunoMatricula(long mat) {
        this.matricula = mat;
        return this.matricula;
    }

    public Double alunoNota1(double n1) {
        this.nota1 = n1;
        return this.nota1;
    }
    public Double alunoNota2(double n2) {
        this.nota2 = n2;
        return this.nota2;
    }

}
