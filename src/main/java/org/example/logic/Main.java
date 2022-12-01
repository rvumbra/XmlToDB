package org.example.logic;

import org.example.constants.CustomStrings;
import org.example.data.CochesXML;
import org.example.utils.Conecta;
import org.example.utils.XMLMarshall;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

import static java.lang.System.out;

public class Main {
    private static CochesXML cochesXML;
    private static Connection connection;
    private static long inicio;

    public static void main(String[] args) {
        init();
        obtenerDatosXml();
        crearBD(connection);
    }

    /**
     * <h2>Function init</h2>
     * <p>Inicializa los campos de la clase.</p>
     * <p>LA variable inicio no se inicializa aquí ya que se sobreescribirá
     * para cada proceso con System.CurrentMiliseconds</p>
     */
    private static void init(){
        cochesXML = new CochesXML();
        try {
            connection = Conecta.conectar();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * <h2>Function obtenerDatosXml</h2>
     * <p>Obtiene la estructura de datos del XML y mide el tiempo de extracción de dichos datos.</p>
     */
    private static void obtenerDatosXml(){
        out.println(CustomStrings.XML_START);
        inicio = System.currentTimeMillis();
        cochesXML = (CochesXML) XMLMarshall.extraerXML(cochesXML, new File(CustomStrings.XML_PATH));
        out.println(CustomStrings.XML_FINISH);
        out.println(CustomStrings.TIMER_FINISH+ (System.currentTimeMillis() - inicio)+ CustomStrings.TIMER_MILISECONDS);
    }

    /**
     * <h2>Function crearBD</h2>
     * <p>Crea la bd con la estructura en base a los POJOS generados del XML.</p>
     */
    private static void crearBD(Connection connection){
        out.println("\n"+CustomStrings.DB_STRUCTURE_START);
        inicio = System.currentTimeMillis();
        CochesSQL.createTables(connection);
        out.println(CustomStrings.DB_STRUCTURE_FINISH);
        out.println(CustomStrings.TIMER_FINISH+ (System.currentTimeMillis() - inicio)+ CustomStrings.TIMER_MILISECONDS);
    }
}