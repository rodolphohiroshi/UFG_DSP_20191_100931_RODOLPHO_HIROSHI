package br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.exclusao;

import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base.PersistenciaJdbc;

public class TableDepartamentoDrop extends PersistenciaJdbc {
    public boolean dropTable() throws Exception{
        preparaPersistencia();
        System.out.println("Excluindo a Tabela Departamento");

        String sql = "DROP TABLE IF EXISTS DEPARTAMENTO";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamento excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;

    }
}
