package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.dml.insert;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model.Departamento;
import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

public class PersisteDepartamento extends PersistenciaJdbc {
    Departamento departamento;

    public PersisteDepartamento(){
        departamento = new Departamento();
    }

    public boolean persisteDepartamento(Departamento departamento) throws Exception{

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
