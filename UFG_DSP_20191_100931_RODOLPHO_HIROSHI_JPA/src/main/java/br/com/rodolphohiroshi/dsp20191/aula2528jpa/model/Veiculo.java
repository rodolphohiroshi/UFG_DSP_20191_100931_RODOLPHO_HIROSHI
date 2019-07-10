package br.com.rodolphohiroshi.dsp20191.aula2528jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String marca;

    private String modelo;

    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        AnoModelo = anoModelo;
    }

    public int getPotenciaMotor() {
        return PotenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        PotenciaMotor = potenciaMotor;
    }

    private int AnoFabricacao;

    private int AnoModelo;

    private int PotenciaMotor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String firstName) {
        this.marca = firstName;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String lastName) {
        this.modelo = lastName;
    }


}
