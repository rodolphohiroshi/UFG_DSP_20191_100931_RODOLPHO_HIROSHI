package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.delete;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Funcionario;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.query.ConsultaFuncionario;

import java.sql.PreparedStatement;

public class DeletaFuncionario extends PersistenciaJdbc {

    public boolean deletaFuncionario (Long id) throws Exception {
        boolean result = false;
        try {
            Funcionario funcionario = new ConsultaFuncionario().consultaPorId(id);
            if (funcionario.getId() != null) {
                preparaPersistencia();

                String sql = "DELETE FROM FUNCIONARIO WHERE ID = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1, id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Funcionario foi excluido corretamente!");
                pstmt.close();
            } else {
                System.out.println("Não foi encontrado funcionario com o id = " + id);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}