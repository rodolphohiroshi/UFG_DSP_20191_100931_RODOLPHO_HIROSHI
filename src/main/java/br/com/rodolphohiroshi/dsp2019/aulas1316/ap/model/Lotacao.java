package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model;

import java.util.Date;

public class Lotacao {
    private Long id;
    private Date dataInicial;
    private Date dataFinal;
    private Cargo cargo;
    private Departamento departamento;

    public Lotacao(){}

    public Lotacao(Long id, Date dataInicial, Date dataFinal){
        this.id = id;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
