package br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.query;

import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Funcionario;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaFuncionario extends PersistenciaJdbc {
    private Funcionario funcionario;

    public ConsultaFuncionario(){
        funcionario = new Funcionario();
    }

    public Funcionario consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM FUNCIONARIO WHERE ID_FUNCIONARIO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            funcionario.setId(rs.getLong("ID_FUNCIONARIO"));
            funcionario.setMatricula(rs.getLong("MATRICULA"));
            funcionario.setNome(rs.getString("NOME"));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return funcionario;
    }
}
