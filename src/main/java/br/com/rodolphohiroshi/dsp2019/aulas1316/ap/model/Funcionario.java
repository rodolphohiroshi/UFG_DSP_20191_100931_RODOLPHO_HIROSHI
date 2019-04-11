package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model;

/**
 * Created by Rodolpho Hiroshi on 10/04/2019.
 */
public class Funcionario {
    private Long id;
    private String nome;
    private String matricula;

    public Funcionario(){}

    public Funcionario(Long id, String nome, String matricula){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
