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



public class ej9 {
    public static void main(String[] args){

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("libros.xml"));
            doc.getDocumentElement().normalize();

            Element biblioteca = doc.getDocumentElement();
            var libros = biblioteca.getElementsByTagName("libro");

            for(int i = libros.getLength() -1;i>=0;i--){
                Element libro = (Element)libros.item(i);
                Element autorElem = (Element) libro.getElementsByTagName("autor").item(0);
                String autor = autorElem.getTextContent();

                if("Cervantes".equals(autor)){
                    biblioteca.removeChild(libro);
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("libros_actualizado.xml"));
            transformer.transform(source, result);
            System.out.println("Libros actualizados correctamente y archivo guardado como 'libros_actualizado.xml'");

        } catch(Exception e){
            System.out.println("Error al procesar el archivo XML: " + e.getMessage());
        }
    }
}
