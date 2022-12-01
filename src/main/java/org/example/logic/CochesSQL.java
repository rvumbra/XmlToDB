package org.example.logic;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * <h1>Java Class CochesSQL</h1>
 * <p>Contiene las instrucciones necesarias para crear una base de datos e insertar los valores según
 * la estructura y datos de Coches.xml.</p>
 */
public class CochesSQL {

    /**
     * <h2>Function createTables</h2>
     * <p>Crea las tablas de la base de datos COCHES.</p>
     *
     * @param connection Conexión establecida con la base de datos.
     */
    public static void createTables(Connection connection){
        createSuppliers(connection);
    }

    public static void createSuppliers(Connection connection){
        try {
            Statement stmt = connection.createStatement();
            stmt.execute("create table if not exists SUPPLIERS(" +
                    "NAME varchar(50) not null,"+
                    "STATUS varchar(50) default null,"+
                    "COUNT int default null," +
                    "constraint supplier_fk primary key(NAME)"+
                    ");");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertIntoTable(Connection connection, List<Object> list, int params){

    }
}
