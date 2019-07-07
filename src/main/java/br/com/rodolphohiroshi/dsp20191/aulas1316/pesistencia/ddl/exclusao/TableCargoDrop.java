package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.ddl.exclusao;

import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

public class TableCargoDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Cargo");

        String sql = "DROP TABLE IF EXISTS CARGO";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargo excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}