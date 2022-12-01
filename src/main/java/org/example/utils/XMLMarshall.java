package org.example.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Esta clase permite leer o extraer información de un xml con Marshall.
 */
public class XMLMarshall {

    /**
     * Genera un xml dada una lista y un archivo donde se guardará la información,
     * se aplicará un contexto de un tipo de dato concreto y se introducirá la lista
     * con un marshaller para generar dicho xml.
     *
     * @param tipoDato que se va a introducir en el XML.
     * @param archivo donde se almacenará la información.
     */
    public static void generarXML(Object tipoDato, File archivo){

        try {
            JAXBContext context = JAXBContext.newInstance(tipoDato.getClass());
            Marshaller marshall = context.createMarshaller();
            marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshall.marshal(tipoDato, archivo);

        } catch (JAXBException e) {
            e.printStackTrace();
            System.err.println("Error al generar el contexto jaxb, ver archivo -> "+XMLMarshall.class);
        }
    }

    public static Object extraerXML(Object tipoDato, File archivo){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(tipoDato.getClass());
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(archivo);

        } catch (JAXBException e) {
            e.printStackTrace();
            System.err.println("Error al generar el contexto jaxb, ver archivo -> "+XMLMarshall.class);
            return null;
        }
    }
}
