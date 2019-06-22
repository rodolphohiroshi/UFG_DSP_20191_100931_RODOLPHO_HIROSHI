package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model;

/**
 * Created by Rodolpho Hiroshi on 10/04/2019.
 * Criar uma classe chamada Departamento, com os seguinte atributos:
 * 1. id – String;
 * 2. nome – String;
 */
public class Departamento {
    private Long id;
    private String nome;


    public Departamento(Long id, String nome){
            this.id = id;
            this.nome = nome;
    }

    public Departamento() {

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
}
