package br.com.rodolphohiroshi.dsp20191.aulas1720;


import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Cargo;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;

public class AtualizaCargo extends PersistenciaJdbc {
    public void updateCargo(Cargo cargo) throws Exception {
        preparaPersistencia();

        String sql = "UPDATE CARGOS SET NOME = ?, SALARIO = ? WHERE ID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, cargo.getNome());
        ps.setDouble(2, cargo.getSalario());
        ps.setLong(3, cargo.getId());
        ps.executeUpdate();
        ps.close();
        System.out.println("Cargo ID: " + cargo.getId() + " atualizado com sucesso!");
    }

    public void updateSalarioFromId(long id, double salario) throws Exception {
        preparaPersistencia();

        String sql = "UPDATE CARGOS SET SALARIO = ? WHERE ID = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setDouble(1, salario);
        ps.setLong(2, id);
        ps.executeUpdate();
        ps.close();
    }
}