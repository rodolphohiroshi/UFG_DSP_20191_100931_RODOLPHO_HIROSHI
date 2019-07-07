package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.update;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Cargo;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.query.ConsultaCargo;

import java.sql.PreparedStatement;

public class AtualizaCargo extends PersistenciaJdbc {

    public boolean atualizaCargo(Cargo cargo) throws Exception {

        boolean result = false;

        try {
            Cargo cargo1 = new ConsultaCargo().consultaPorId(cargo.getId());
            if (cargo1.getId() != null) {
                preparaPersistencia();

                String sql = "UPDATE CARGO " +
                        "SET NOME = '" + cargo.getNome() +
                        "', SALARIO = '" + cargo.getSalario() +
                        "' WHERE ID = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1, cargo.getId());
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Cargo foi atualizado corretamente!");
            } else {
                System.out.println("Não foi localizado o cargo com o id = " + cargo.getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}