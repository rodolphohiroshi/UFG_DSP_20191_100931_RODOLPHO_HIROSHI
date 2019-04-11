package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.ddl.criacao;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

/**
 * Created by Rodolpho Hiroshi on 10/04/2019.
 */
public class TableFuncionarioCreate extends PersistenciaJdbc {
    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Funcionario ");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACAO(\n" +
                "ID_FUNCIONARIO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME STRING NOT NULL"+
                "MATRICULA STRING NOT NULL"+
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionario criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }
}
