package br.com.rodolphohiroshi.dsp20191.aulas1720;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Cargo;
import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Departamento;
import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Funcionario;
import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Lotacao;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Consultas extends PersistenciaJdbc {
    public ArrayList<Lotacao> consultaDados(Cargo cargo, Departamento departamento) throws Exception {
        ArrayList<Lotacao> lotacoes =  new ArrayList<>();

        preparaPersistencia();
        String sql = "SELECT * FROM LOTACAO WHERE DEPARTAMENTO = ? AND CARGO = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, departamento.getId());
        ps.setLong(2, cargo.getId());

        ResultSet resultSet = ps.executeQuery();


        while(resultSet.next()) {
            lotacoes.add(new Lotacao(resultSet.getLong("ID"),
                    resultSet.getDate("DATA_INICIAL"),
                    resultSet.getDate("DATA_FINAL"),
                    cargo,
                    departamento,
                    this.selectFuncionario(resultSet.getLong("FUNCIONARIO"))));
        }

        ps.close();
        return lotacoes;
    }

    public Funcionario selectFuncionario(long id) throws  Exception{
        Funcionario funcionario = null;

        preparaPersistencia();
        String sql = "SELECT * FROM FUNCIONARIOS WHERE ID = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, id);

        ResultSet resultSet = ps.executeQuery();

        while(resultSet.next()) {
            funcionario = new Funcionario(resultSet.getLong("ID"), resultSet.getString("NOME"),
                    resultSet.getLong("MATRICULA"));
        }

        ps.close();
        return  funcionario;
    }
}