package br.com.rodolphohiroshi.dsp20191.aula2528jpa.persistencia;


import br.com.rodolphohiroshi.dsp20191.aula2528jpa.model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLException;

public class PersisteVeiculoTeste {

    Logger logger = Logger.getLogger(PersisteVeiculoTeste.class.getName());

    Server server = null;
    VeiculoRepository repository;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImpl();
    }

    @Test
    public void TestaPersistenciaVeiculo(){
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Chevrolet");
        veiculo.setModelo("Onix");

        // Create person
        Veiculo novoVeiculo =  repository.create(veiculo);
        System.out.println("Id do veiculo: " + novoVeiculo.getId());
        Assert.assertTrue(veiculo != null);
    }


}
