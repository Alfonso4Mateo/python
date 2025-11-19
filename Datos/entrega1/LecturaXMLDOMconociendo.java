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

        File file = new File("liga.xml");

        try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(file);
                //Se ha construido una estructura DOM en doc

                //Normalización del fichero
                 doc.getDocumentElement().normalize();


                // Se almacenan los nodos para luego mostrar la
                // cantidad de ellos con el método getLength()

                NodeList nList = doc.getElementsByTagName("libros");
                System.out.println("Número de libros: " + nList.getLength());

                for(int temp = 0; temp < nList.getLength(); temp++) {

                    Node nNode = nList.item(temp);

                    if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                      Element eElement = (Element) nNode;

                      System.out.println("\nEquipo id: " + eElement.getAttribute("id"));
                      System.out.println("Nombre: "
                                  + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                      System.out.println("Ciudad: "
                                  + eElement.getElementsByTagName("ciudad").item(0).getTextContent());
                      System.out.println("Fundacion: "
                                  + eElement.getElementsByTagName("fundacion").item(0).getTextContent());
                    }
                }


        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
