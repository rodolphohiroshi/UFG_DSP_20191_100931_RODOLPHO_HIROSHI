package br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.ddl.exclusao;

import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

public class TableLotacaoDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Lotação");

        String sql = "DROP TABLE IF EXISTS LOTACAO";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotação excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}