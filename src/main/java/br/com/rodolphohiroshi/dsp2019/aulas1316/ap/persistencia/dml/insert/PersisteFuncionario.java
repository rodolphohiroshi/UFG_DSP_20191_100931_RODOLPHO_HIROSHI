package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.dml.insert;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model.Funcionario;
import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

public class PersisteFuncionario extends PersistenciaJdbc {
    public boolean persisteFuncionario(Funcionario funcionario) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO FUNCIONARIO " +
                "VALUES('" + funcionario.getId() +
                "','" + funcionario.getNome() +
                "','" + funcionario.getMatricula() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Funcionario foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }
}
