package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.ddl.alteracao;

import br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base.PersistenciaJdbc;

public class AdicionaFKTableLotacao extends PersistenciaJdbc {
    public boolean alterTable() throws Exception{

        preparaPersistencia();

        System.out.println("Alterando a Tabela Lotacoes");

        String sql = "ALTER TABLE LOTACAO ADD FOREIGN KEY (FUNCIONARIO) REFERENCES FUNCIONARIO(ID_FUNCIONARIO) ON DELETE CASCADE;\n" +
                "ALTER TABLE LOTACAO ADD FOREIGN KEY (CARGO) REFERENCES CARGO(ID_CARGO) ON DELETE CASCADE;\n" +
                "ALTER TABLE LOTACAO ADD FOREIGN KEY (DEPARTAMENTO) REFERENCES DEPARTAMENTO(ID_DEPARTAMENTO) ON DELETE CASCADE;";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacao alterada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }
}
