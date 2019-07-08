package br.com.rodolphohiroshi.dsp20191.aulas1316.model;

import java.util.Date;

public class Lotacao {

    private Long id;

    private Date dataInicial;

    private Date dataFinal;

    private Cargo cargo;

    private Departamento departamento;

    private Funcionario funcionario;

    public Lotacao(long id, java.sql.Date data_inicial, java.sql.Date data_final, Cargo cargo, Departamento departamento, Funcionario funcionario) {
    }

    public Lotacao() {

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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}