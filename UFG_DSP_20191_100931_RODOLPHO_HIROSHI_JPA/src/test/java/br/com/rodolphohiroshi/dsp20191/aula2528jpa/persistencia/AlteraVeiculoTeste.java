package br.com.rodolphohiroshi.dsp20191.aula2528jpa.persistencia;

import br.com.rodolphohiroshi.dsp20191.aula2528jpa.model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class AlteraVeiculoTeste {

    Logger logger = Logger.getLogger(AlteraVeiculoTeste.class.getName());

    Server server = null;
    VeiculoRepository repository = null;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImpl();
    }

    @Test
    public void alteraNomeTeste(){
        Veiculo veiculo = repository.read(1L);
        if(veiculo != null){

        }

        veiculo.setMarca("Chevrolet");
        //update person record
        repository.update(veiculo);

        System.out.println("Nome do Veiculo: " + veiculo.getMarca());

        Assert.assertTrue(veiculo.getMarca().equals("Chevrolet"));
    }



}
