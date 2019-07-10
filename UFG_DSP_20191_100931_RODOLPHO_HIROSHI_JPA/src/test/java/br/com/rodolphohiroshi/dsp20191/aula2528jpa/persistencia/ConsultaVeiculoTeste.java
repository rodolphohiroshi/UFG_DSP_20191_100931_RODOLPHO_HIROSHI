package br.com.rodolphohiroshi.dsp20191.aula2528jpa.persistencia;

import br.com.rodolphohiroshi.dsp20191.aula2528jpa.model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class ConsultaVeiculoTeste {

    Logger logger = Logger.getLogger(ConsultaVeiculoTeste.class.getName());

    VeiculoRepository repository;

    Server server;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImpl();
    }

    @Test
    public void consultaPeloIdTeste(){
        Veiculo veiculo = repository.read(1L);
        System.out.println("Nome do Veiculo: " + veiculo.getMarca());
        Assert.assertTrue(veiculo != null);
    }


}
