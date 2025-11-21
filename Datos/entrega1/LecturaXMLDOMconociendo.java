package Datos.entrega1;

import java.io.*;

//Librerías de DOM 
import org.w3c.dom.*;

//Clases JAXP 
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.ParserConfigurationException;

public class LecturaXMLDOMconociendo {

    public static void main(String[] args) {

        // Intentar localizar el fichero XML en varias rutas posibles
        File file = new File("libros.xml");
        if (!file.exists()) {
            String alt = System.getProperty("user.dir") + File.separator + "Datos" + File.separator + "libros.xml";
            file = new File(alt);
        }
        if (!file.exists()) {
            file = new File("Datos" + File.separator + "libros.xml");
        }
        if (!file.exists()) {
                System.err.println("No se encuentra el fichero 'libros.xml'. Rutas comprobadas: ./libros.xml, " +
                    System.getProperty("user.dir") + File.separator + "Datos" + File.separator + "libros.xml" + ", " + "Datos" + File.separator + "libros.xml");
            return;
        }

        try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(file);
                //Se ha construido una estructura DOM en doc

                //Normalización del fichero
                 doc.getDocumentElement().normalize();


                // Se almacenan los nodos para luego mostrar la
                // cantidad de ellos con el método getLength()

                NodeList nList = doc.getElementsByTagName("libro");
                System.out.println("Número de libros: " + nList.getLength());

                for(int temp = 0; temp < nList.getLength(); temp++) {

                    Node nNode = nList.item(temp);

                    if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                      Element eElement = (Element) nNode;

                      System.out.println("\n titulo " + eElement.getElementsByTagName("titulo").item(0).getTextContent());
                      
                    }
                }


        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
