package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.dml.delete;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model.Cargo;
import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;
import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.dml.query.ConsultaCargo;

import java.sql.PreparedStatement;

public class DeletaCargo extends PersistenciaJdbc {
    public boolean deletaCargo(Long id){
        boolean result = false;
        try {
            Cargo cargo = new ConsultaCargo().consultaPorId(id);
            if (cargo.getId() != null){
                preparaPersistencia();

                String sql = "DELETE FROM CARGO WHERE ID_CARGO = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1,id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Cargo foi excluido corretamente!");
                pstmt.close();
            }else{
                System.out.println("Não foi encontrado cargo com id = " + id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
