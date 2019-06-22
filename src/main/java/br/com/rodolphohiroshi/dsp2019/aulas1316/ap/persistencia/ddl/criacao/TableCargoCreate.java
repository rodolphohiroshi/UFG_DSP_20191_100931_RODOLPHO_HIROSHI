package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.ddl.criacao;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

/**
 * Created by Rodolpho Hiroshi on 10/04/2019.
 */
public class TableCargoCreate extends PersistenciaJdbc{
    public boolean createTable() throws Exception{

        preparaPersistencia();
        System.out.println("Criando a tabela Cargo");

        String sql = "CREATE TABLE IF NOT EXISTS CARGO(\n" +
                "ID_CARGO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME STRING NOT NULL"+
                "SALARIO DOUBLE NOT NULL"+
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargo criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;



    }
}
