package Datos.entrega1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.time.LocalDate;
import java.time.LocalTime;

public class ej6 {
    public static void main(String[] args) {
        
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element eRaiz = doc.createElement("log");
            doc.appendChild(eRaiz);

            Element evento = doc.createElement("evento");
            eRaiz.appendChild(evento);

            Attr tipo = doc.createAttribute("tipo");
            tipo.setValue("INICIO");
            evento.setAttributeNode(tipo);

            Element fecha = doc.createElement("fecha");
            fecha.appendChild(doc.createTextNode(LocalDate.now().toString()));
            evento.appendChild(fecha);

            Element hora = doc.createElement("hora");
            hora.appendChild(doc.createTextNode(LocalTime.now().toString()));
            evento.appendChild(hora);

            Element mensaje = doc.createElement("mensaje");
            mensaje.appendChild(doc.createTextNode("El sistema ha iniciado correctamente."));
            evento.appendChild(mensaje);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("Hora.xml"));
            transformer.transform(source, result);
        }   catch (Exception e) {
            System.out.println("Error al procesar el archivo XML: " + e.getMessage());
        }

    }
}
