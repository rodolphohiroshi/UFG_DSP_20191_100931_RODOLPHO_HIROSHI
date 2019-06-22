package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.dml.insert;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model.Lotacao;
import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

public class PersisteLotacao extends PersistenciaJdbc {
    public boolean persisteLotacao(Lotacao lotacao) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO LOTACAO " +
                "VALUES('" + lotacao.getId() +
                "','" + lotacao.getDataInicial() +
                "','" + lotacao.getDataFinal() +
                "','" + lotacao.getCargo().getId() +
                "','" + lotacao.getDepartamento().getId() +
                "','" + lotacao.getFuncionario().getId() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("A Lotacao foi persistida corretamente!");
        stmt.close();
        connection.close();

        return true;
    }
}
