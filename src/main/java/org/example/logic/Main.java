package org.example.logic;

import org.example.constants.CustomStrings;
import org.example.data.CochesXML;
import org.example.utils.XMLMarshall;

import java.io.File;

import static java.lang.System.out;

public class Main {
    private static CochesXML cochesXML;

    public static void main(String[] args) {
        init();
        obtenerDatosXml();
        crearBD();
        out.println(cochesXML.getCarAvailabilityReponse().getCarAvailabilityResult().getCount());
    }

    /**
     * <h2>Function init</h2>
     * <p>Inicializa los campos de la clase.</p>
     */
    private static void init(){
        cochesXML = new CochesXML();
    }

    /**
     * <h2>Function obtenerDatosXml</h2>
     * <p>Obtiene la estructura de datos del XML y mide el tiempo de extracción de dichos datos.</p>
     */
    private static void obtenerDatosXml(){
        long inicio;

        out.println(CustomStrings.XML_START);
        inicio = System.currentTimeMillis();
        cochesXML = (CochesXML) XMLMarshall.extraerXML(cochesXML, new File(CustomStrings.XML_PATH));
        out.println(CustomStrings.XML_FINISH);
        out.println(CustomStrings.TIMER+ (System.currentTimeMillis() - inicio) / 1000+ CustomStrings.SECONDS);
    }

    /**
     * Crea la bd con la estructura en base a los POJOS generados del XML.
     */
    private static void crearBD(){

    }
}