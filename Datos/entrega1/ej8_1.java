package Datos.entrega1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import java.io.File;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ej8_1 {
    public static void main(String[] args){
        
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnos.xml"));
            doc.getDocumentElement().normalize();

            NodeList alumnos = doc.getElementsByTagName("alumno");

            for(int i = 0; i < alumnos.getLength(); i++){
                Element alumno = (Element) alumnos.item(i);
                String curso = alumno.getAttribute("curso");

                if("1DAM".equals(curso)){
                    Element notaElem = (Element) alumno.getElementsByTagName("nota").item(0);
                    double nota = Double.parseDouble(notaElem.getTextContent());

                  //  nota = Math.min(nota + 0.5, 10.0);
                    nota += 0.5;
                    if(nota>10.0){
                        nota = 10.0;
                    }

                    notaElem.setTextContent(String.valueOf(nota));
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("alumnos_actualizado.xml"));
            transformer.transform(source, result);

            System.out.println("Notas actualizadas correctamente y archivo guardado como 'alumnos_actualizado.xml'");
       } catch (Exception e) {
        System.out.println("Error al procesar el archivo XML: " + e.getMessage());
        }

    }
}