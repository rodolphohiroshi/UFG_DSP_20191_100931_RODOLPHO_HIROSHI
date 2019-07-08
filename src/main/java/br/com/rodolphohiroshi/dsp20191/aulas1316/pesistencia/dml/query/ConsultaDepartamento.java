package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.query;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Departamento;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaDepartamento extends PersistenciaJdbc {

    private Departamento departamento;

    public ConsultaDepartamento(){
        departamento = new Departamento(1, "Desenvolvimento");
    }

    public Departamento consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM DEPARTAMENTO WHERE ID= ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            departamento.setId(rs.getLong("ID"));
            departamento.setNome(rs.getString("NOME"));

        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return departamento;
    }
}