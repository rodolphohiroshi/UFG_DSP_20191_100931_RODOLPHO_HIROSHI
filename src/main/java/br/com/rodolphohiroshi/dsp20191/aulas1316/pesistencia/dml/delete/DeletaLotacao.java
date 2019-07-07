package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.delete;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Lotacao;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.query.ConsultaLotacao;

import java.sql.PreparedStatement;

public class DeletaLotacao extends PersistenciaJdbc {

    public boolean deletaLotacao(Long id) throws Exception {
        boolean result = false;
        try {
            Lotacao lotacao = new ConsultaLotacao().consultaPorId(id);
            if (lotacao.getId() != null) {
                preparaPersistencia();

                String sql = "DELETE FROM LOTACAO WHERE ID = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1, id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Lotacao foi excluido corretamente!");
                pstmt.close();
            } else {
                System.out.println("Não foi lotacao funcionario com o id = " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}