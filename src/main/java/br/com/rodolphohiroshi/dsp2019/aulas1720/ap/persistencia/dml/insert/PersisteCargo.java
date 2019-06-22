package br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.insert;

import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Cargo;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base.PersistenciaJdbc;

public class PersisteCargo extends PersistenciaJdbc {
    public boolean persisteCargo(Cargo cargo) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO CARGO " +
                "VALUES('" + cargo.getId() +
                "','" + cargo.getNome() +
                "','" + cargo.getSalario() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Cargo foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }
}
