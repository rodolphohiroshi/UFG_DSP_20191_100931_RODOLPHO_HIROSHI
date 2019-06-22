package br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.query;

import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Cargo;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Departamento;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Funcionario;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Lotacao;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaLotacao extends PersistenciaJdbc {
    private Lotacao lotacao;

    public ConsultaLotacao(){

        lotacao = new Lotacao();
    }

    public Lotacao consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM LOTACAO WHERE ID_LOTACAO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        Cargo cargo = new Cargo();
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario();
        while(rs.next()){
            lotacao.setId(rs.getLong("ID_LOTACAO"));
            lotacao.setDataInicial(rs.getDate("DATAINICIAL"));
            lotacao.setDataFinal(rs.getDate("DATAFINAL"));
            cargo.setId(rs.getLong("CARGO"));
            lotacao.setCargo(cargo);
            departamento.setId(rs.getLong("DEPARTAMENTO"));
            lotacao.setDepartamento(departamento);
            funcionario.setId(rs.getLong("FUNCIONARIO"));
            lotacao.setFuncionario(funcionario);
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return lotacao;
    }
}
