package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.insert;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Funcionario;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

public class PersisteFuncionario extends PersistenciaJdbc {

    private Funcionario funcionario;

    public PersisteFuncionario(){
        funcionario = new Funcionario();
    }

    public boolean persisteFuncionario(Funcionario funcionario) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO FUNCIONARIO " +
                "VALUES('" + funcionario.getId() +
                "','" + funcionario.getNome() +
                "','" + funcionario.getMatricula() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Funcionario foi persistido corretamente!");
        stmt.close();
        connection.close();

        return true;
    }
}