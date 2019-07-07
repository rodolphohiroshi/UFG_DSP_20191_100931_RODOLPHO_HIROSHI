package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.insert;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Cargo;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersisteCargo extends PersistenciaJdbc {

    private Cargo cargo;

    public PersisteCargo(){
        cargo = new Cargo();
    }

    public Cargo consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO CARGO ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            cargo.setId(rs.getLong("ID"));
            cargo.setNome(rs.getString("NOME"));
            cargo.setSalario(rs.getDouble("SALARIO"));

        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return cargo;
    }
}