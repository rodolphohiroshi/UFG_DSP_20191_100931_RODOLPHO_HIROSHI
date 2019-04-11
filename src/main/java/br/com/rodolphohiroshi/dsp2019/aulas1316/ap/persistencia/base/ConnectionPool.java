package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.persistencia.base;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Rodolpho Hiroshi on 10/04/2019.
 */
public interface ConnectionPool {
    Connection getConnection() throws SQLException;
    boolean releaseConnection (Connection connection);
    String getUrl();
    String getUser();
    String getPassword();

}
