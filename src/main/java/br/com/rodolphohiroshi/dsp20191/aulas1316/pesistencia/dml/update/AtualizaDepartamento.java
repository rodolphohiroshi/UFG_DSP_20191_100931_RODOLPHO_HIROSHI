package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.update;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Departamento;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.query.ConsultaDepartamento;

import java.sql.PreparedStatement;

public class AtualizaDepartamento extends PersistenciaJdbc {

    public boolean atualizaDepartamento(Departamento departamento) throws Exception {

        boolean result = false;

        try {
            Departamento departamento1 = new ConsultaDepartamento().consultaPorId(departamento.getId());
            if (departamento1.getId() != null) {
                preparaPersistencia();

                String sql = "UPDATE CARGO " +
                        "SET NOME = '" + departamento.getNome() +
                        "' WHERE ID = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1, departamento.getId());
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Departamento foi atualizado corretamente!");
            } else {
                System.out.println("Não foi localizado o departamento com o id = " + departamento.getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}