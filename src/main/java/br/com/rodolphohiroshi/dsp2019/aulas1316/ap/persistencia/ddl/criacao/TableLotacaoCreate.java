package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.ddl.criacao;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

/**
 * Created by Rodolpho Hiroshi on 10/04/2019.
 */
public class TableLotacaoCreate extends PersistenciaJdbc{
    public boolean createTable() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Lotacao ");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACAO(\n" +
                "ID_LOTACAO LONG NOT NULL PRIMARY KEY,\n" +
                "DATAINICIAL TIMESTAMP NOT NULL"+
                "DATAFINAL TIMESTAMP NOT NULL"+
                "CARGO LONG NOT NULL"+
                "DEPARTAMENTO LONG NOT NULL"+
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacao criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }


}
