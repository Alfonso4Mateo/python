package Datos.entrega1;

import java.io.*;
import java.util.Arrays;

//Librerías de DOM 
import org.w3c.dom.*;

//Clases JAXP 
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  

public class ej2 {

    public static void main(String[] args) {

        // Intentar localizar el fichero XML en varias rutas posibles
        File file = new File("alumnos.xml");
        if (!file.exists()) {
            // Intentar en el subdirectorio 'Datos' relativo al directorio de trabajo
            String alt = System.getProperty("user.dir") + File.separator + "Datos" + File.separator + "alumnos.xml";
            file = new File(alt);
        }
        if (!file.exists()) {
            file = new File("Datos" + File.separator + "alumnos.xml");
        }
        if (!file.exists()) {
            System.err.println("No se encuentra el fichero 'alumnos.xml'. Rutas comprobadas: " +
                    Arrays.asList(
                            "./alumnos.xml",
                            System.getProperty("user.dir") + File.separator + "Datos" + File.separator + "alumnos.xml",
                            "Datos" + File.separator + "alumnos.xml"
                    )
            );
            return;
        }

        try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(file);
                //Se ha construido una estructura DOM en doc

                //Normalización del fichero
                 doc.getDocumentElement().normalize();


                // Se almacenan los nodos <alumno> y se muestra la cantidad
                NodeList nList = doc.getElementsByTagName("alumno");
                System.out.println("Número de alumnos: " + nList.getLength());

                for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;

                        String nombre = "";
                        NodeList nombreList = eElement.getElementsByTagName("nombre");
                        if (nombreList.getLength() > 0) {
                            nombre = nombreList.item(0).getTextContent();
                        }

                        // En el XML el curso es un atributo del elemento <alumno>
                        String curso = eElement.getAttribute("curso");

                        String notaStr = "";
                        NodeList notaList = eElement.getElementsByTagName("nota");
                        if (notaList.getLength() > 0) {
                            notaStr = notaList.item(0).getTextContent();
                        }

                        double nota = 0;
                        try {
                            nota = Double.parseDouble(notaStr);
                        } catch (NumberFormatException ex) {
                            // Si la nota no es numérica, la tratamos como 0
                        }

                        if (nota >= 5.0) {
                            System.out.println("\nAlumno id: " + eElement.getAttribute("id"));
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Curso: " + curso);
                            System.out.println("Nota: " + notaStr);
                        }
                    }
                }
                //Leer todos los alumnos.
                //Mostrar por consola: id, nombre, curso y nota.
                //Solo mostrar los alumnos cuya nota sea mayor o igual que 5.
                

    
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}