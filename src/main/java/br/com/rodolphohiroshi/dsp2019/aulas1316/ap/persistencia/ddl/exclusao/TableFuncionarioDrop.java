package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.ddl.exclusao;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

public class TableFuncionarioDrop extends PersistenciaJdbc {
    public boolean dropTable() throws Exception{
        preparaPersistencia();
        System.out.println("Excluindo a Tabela Funcionario");

        String sql = "DROP TABLE IF EXISTS FUNCIONARIO";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionario excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;

    }
}
