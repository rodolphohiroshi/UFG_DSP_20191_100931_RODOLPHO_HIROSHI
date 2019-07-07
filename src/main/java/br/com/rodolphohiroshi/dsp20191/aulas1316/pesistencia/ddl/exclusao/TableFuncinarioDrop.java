package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.ddl.exclusao;

import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

public class TableFuncinarioDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Funcionario");

        String sql = "DROP TABLE IF EXISTS FUNCIONARIO";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionario excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}