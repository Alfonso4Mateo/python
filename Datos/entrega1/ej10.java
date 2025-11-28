package Datos.entrega1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import java.io.File;
import org.w3c.dom.Element;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ej10 {
    public static void main(String[] args){

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnos.xml"));
            doc.getDocumentElement().normalize();

            Element clase = doc.getDocumentElement();
            var alumnos = clase.getElementsByTagName("alumno");

            for(int i =0;i<alumnos.getLength();i++){
                Element alumno =(Element) alumnos.item(i);
                Element notaElemt = (Element) alumno.getElementsByTagName("nota").item(0);
                double nota = Double.parseDouble(notaElemt.getTextContent());

                if(nota >=5.0){
                    alumno.setAttribute("estado","APROBADO");
                } else {
                    alumno.setAttribute("estado","SUSPENDIDO");
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(); 
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("alumnos_actualizado.xml"));
            transformer.transform(source, result);
            System.out.println("Xml actualizado correctacmente y guardado como 'alumnos_actualizado.xml'");
        } catch (Exception e){
            System.out.println("Error al procesar el archivo XML: " + e.getMessage());
        }
    }
    
}
