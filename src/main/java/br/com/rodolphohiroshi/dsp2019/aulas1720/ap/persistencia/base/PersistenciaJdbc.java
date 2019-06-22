package br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by Alunoinf_2 on 10/04/2019.
 */
public class PersistenciaJdbc {
        protected Connection connection = null;
        protected Statement stmt = null;
        protected CriaConexao criaConexao = new CriaConexao();
        protected String connectionType = "file";

        protected void preparaPersistencia() throws Exception{

            //STEP 3: Open a connection
            connection = criaConexao.getConnection(connectionType);


            //STEP 4: Execute a SQL statement
            stmt = connection.createStatement();

        }

}
