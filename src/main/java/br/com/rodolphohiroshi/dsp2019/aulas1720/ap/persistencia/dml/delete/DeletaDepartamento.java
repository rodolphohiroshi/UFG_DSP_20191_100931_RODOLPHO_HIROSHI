package br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.delete;


import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.Departamento;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base.PersistenciaJdbc;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.query.ConsultaDepartamento;

import java.sql.PreparedStatement;

public class DeletaDepartamento extends PersistenciaJdbc {
    public boolean deletaDepartamento(Long id){
        boolean result = false;
        try {
            Departamento departamento = new ConsultaDepartamento().consultaPorId(id);
            if (departamento.getId() != null){
                preparaPersistencia();

                String sql = "DELETE FROM DEPARTAMENTO WHERE ID_DEPARTAMENTO = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1,id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Departamento foi excluido corretamente!");
                pstmt.close();
            }else{
                System.out.println("Não foi encontrado departamento com id = " + id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
