package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.query;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Cargo;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaCargo extends PersistenciaJdbc {

    private Cargo cargo;

    public ConsultaCargo(){
        cargo = new Cargo(1, "Engenheiro de Software", 100.00);
    }

    public Cargo consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM CARGO WHERE ID= ?";
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