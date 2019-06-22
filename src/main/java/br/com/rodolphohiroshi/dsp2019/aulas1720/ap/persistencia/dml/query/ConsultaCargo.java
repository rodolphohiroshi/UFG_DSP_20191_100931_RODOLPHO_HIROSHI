package br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.query;

import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Cargo;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaCargo extends PersistenciaJdbc {
    private Cargo cargo;

    public ConsultaCargo(){

        cargo = new Cargo();
    }

    public Cargo consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM CARGO WHERE ID_CARGO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            cargo.setId(rs.getLong("ID_CARGO"));
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
