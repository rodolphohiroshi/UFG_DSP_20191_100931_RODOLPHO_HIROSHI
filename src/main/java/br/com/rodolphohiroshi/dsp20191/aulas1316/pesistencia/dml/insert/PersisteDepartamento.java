package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.insert;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Departamento;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

public class PersisteDepartamento extends PersistenciaJdbc {

    private Departamento departamento;

    public PersisteDepartamento(){
        departamento = new Departamento();
    }

    public boolean persisteCargo(Departamento departamento) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO DEPARTAMENTO " +
                "VALUES('" + departamento.getId() +
                "','" + departamento.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Departamento foi persistido corretamente!");
        stmt.close();
        connection.close();

        return true;
    }
}