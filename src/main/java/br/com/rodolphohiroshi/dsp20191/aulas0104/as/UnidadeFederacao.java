package br.com.rodolphohiroshi.dsp20191.aulas0104.as;

import java.io.File;

public class UnidadeFederacao {

    String id;
    String sigla;
    String nome;
    String codReg;

    public UnidadeFederacao(String id, String sigla, String nome, String codReg) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.codReg = codReg;
    }
    //UF ED_ID ENUFED_SIGL,UFED_NOME,UFED_CODG_REGIAO,
    public String GetAttributes () {
        String attributes = "FED_ID= " + id + " , FED_SIGLA= " + sigla + " , FED_NOME= " + nome + " , FED_CODREG= " + codReg;
        return attributes;
    }

}