package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.ddl.criacao;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

/**
 * Created by Rodolpho Hiroshi on 10/04/2019.
 */
public class TableDepartamentoCreate extends PersistenciaJdbc {
    public boolean createTable() throws Exception{

        preparaPersistencia();
        System.out.println("Criando a tabela Departamento");

        String sql = "CREATE TABLE IF NOT EXISTS DEPARTAMENTO(\n" +
                "ID_DEPARTAMENTO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME STRING NOT NULL"+
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamento criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;



    }
}
