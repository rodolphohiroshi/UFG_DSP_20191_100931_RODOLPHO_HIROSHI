package br.com.rodolphohiroshi.dsp20191.aulas2124;

import java.io.Serializable;

public class Aluno implements Serializable {
    String nome;
    String matricula;
    String disciplina;
    String frequencia;
    Double nota1, nota2;

    Aluno(String nome, String matricula, String disciplina, String frequencia, Double nota1, Double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.frequencia = frequencia;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    String getAvaliacao() {
        return (this.nota1 + this.nota2) / 2 >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Matricula: " + this.matricula + "\n" +
                "Disciplina: " + this.disciplina + "\n" +
                "Frequência: " + this.frequencia + "\n" +
                "Nota 1: " + this.nota1 + "\n" +
                "Nota 2: " + this.nota2 + "\n" +
                "Resultado: " + this.getAvaliacao() + "\n";
    }
}