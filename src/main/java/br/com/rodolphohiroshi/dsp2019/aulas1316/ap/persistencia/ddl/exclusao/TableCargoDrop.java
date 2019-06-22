package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.ddl.exclusao;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

public class TableCargoDrop extends PersistenciaJdbc {

    public boolean dropTable() throws Exception{
        preparaPersistencia();
        System.out.println("Excluindo a Tabela Cargo");

        String sql = "DROP TABLE IF EXISTS CARGO";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargo excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;

    }
}
