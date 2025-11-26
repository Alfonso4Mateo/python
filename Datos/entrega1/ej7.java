package Datos.entrega1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ej7 {
    public static void main(String[] args) {
        
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnos.xml"));

            doc.getDocumentElement().normalize();

            Element raiz =(Element)doc.getElementsByTagName("clase").item(0);

            Element nuevoAlumno = doc.createElement("alumno");
            nuevoAlumno.setAttribute("id", "4");
            nuevoAlumno.setAttribute("curso", "2DAM");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Nuevo Alumno");
            nuevoAlumno.appendChild(nombre);

            Element nota = doc.createElement("nota");
            nota.setTextContent("7.3");
            nuevoAlumno.appendChild(nota);

            raiz.appendChild(nuevoAlumno);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("alumnos_actualizado.xml"));

            transformer.transform(source, result);

            System.out.println("nuevo alumno añadido correctamente y archivo guardado como 'alumnos_actualizado.xml'");
           } catch (Exception e) {
            System.out.println("Error al procesar el archivo XML: " + e.getMessage()); 
    }
}
}