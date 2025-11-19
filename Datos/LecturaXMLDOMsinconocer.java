/*
 * José Manuel Ruiz
 * Ilerna
 */

package Datos.entrega1;

import java.io.*;

//Librerías de DOM 
import org.w3c.dom.*;

//Clases JAXP 
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.ParserConfigurationException;

public class LecturaXMLDOMsinconocer {

	public static void main(String[] args) {

            File file = new File("empresa.xml");

            try {
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(file);

                    //Normalización del fichero
                    doc.getDocumentElement().normalize();

                    // almacenamos los nodos para luego mostrar la
                    // cantidad de ellos con el método getLength()
                    NodeList nList = doc.getElementsByTagName("departamento");

                    System.out.println("Numero de departamentos en la empresa: " + nList.getLength());

                    //Recorro los departamentos
                    for (int i = 0; i < nList.getLength(); i++) {
                        Node node = nList.item(i);

                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                          Element eElement = (Element) node;

                          if(eElement.hasChildNodes()) {
                            NodeList nl = node.getChildNodes();
                            for(int j=0; j<nl.getLength(); j++) {
                              Node nd = nl.item(j);
                              System.out.println(nd.getTextContent());
                            }
                          }
                        }
                    }


            } catch(Exception e) {
              e.printStackTrace();
            }	
	}
}

