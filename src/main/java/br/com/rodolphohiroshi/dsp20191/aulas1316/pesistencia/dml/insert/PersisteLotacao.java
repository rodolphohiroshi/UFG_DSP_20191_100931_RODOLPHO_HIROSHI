package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.dml.insert;

import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Lotacao;
import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

public class PersisteLotacao extends PersistenciaJdbc {

    private Lotacao lotacao;

    public PersisteLotacao() {
        lotacao = new Lotacao();
    }

    public boolean persisteFuncionario(Lotacao lotacao) throws Exception {

        preparaPersistencia();

        String sql = "INSERT INTO LOTACAO " +
                "VALUES('" + lotacao.getId() +
                "','" + lotacao.getDataInicial() +
                "','" + lotacao.getDataFinal() +
                "','" + lotacao.getDepartamento() +
                "','" + lotacao.getCargo() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Lotacao foi persistido corretamente!");
        stmt.close();
        connection.close();

        return true;
    }
}