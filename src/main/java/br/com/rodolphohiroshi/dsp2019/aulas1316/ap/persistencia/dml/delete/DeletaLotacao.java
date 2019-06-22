package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.dml.delete;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model.Lotacao;
import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;
import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.dml.query.ConsultaLotacao;

import java.sql.PreparedStatement;

public class DeletaLotacao extends PersistenciaJdbc {
    public boolean deletaLotacao(Long id){
        boolean result = false;
        try {
            Lotacao lotacao = new ConsultaLotacao().consultaPorId(id);
            if (lotacao.getId() != null){
                preparaPersistencia();

                String sql = "DELETE FROM LOTACAO WHERE ID_LOTACAO = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1,id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("A Lotacao foi excluida corretamente!");
                pstmt.close();
            }else{
                System.out.println("Não foi encontrada lotacao com id = " + id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

}
