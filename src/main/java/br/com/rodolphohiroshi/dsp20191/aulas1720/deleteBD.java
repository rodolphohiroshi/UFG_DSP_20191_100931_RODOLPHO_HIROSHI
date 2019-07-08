package br.com.rodolphohiroshi.dsp20191.aulas1720;

import br.com.rodolphohiroshi.dsp20191.aulas1316.pesistencia.base.PersistenciaJdbc;

public class deleteBD extends PersistenciaJdbc {
    public void limpaBD() throws Exception {
        preparaPersistencia();

        String sql =
                "DELETE FROM CARGOS;\n" +
                "DELETE FROM DEPARTAMENTOS;\n" +
                "DELETE FROM FUNCIONARIOS;"+
                "DELETE FROM LOTACAO;\n";

        stmt.executeUpdate(sql);
        stmt.close();
        System.out.println("Dados excluídos");
    }
}