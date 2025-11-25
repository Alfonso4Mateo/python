package Datos.entrega1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class ej5 {
    public static void main(String[] args) {
        // Array bidimensional: cada fila es un producto {nombre, precio, cantidad}
        String[][] productos = {
            {"teclado", "19.99", "15"},
            {"raton", "9.99", "25"},
            {"monitor", "199.99", "10"},
            {"altavoces", "49.99", "20"},
            {"webcam", "39.99", "30"}
        };

        try {
            // Crear el documento XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            // Crear el elemento raíz
            Element eRaiz = doc.createElement("productos");
            doc.appendChild(eRaiz);

            // Añadir cada producto al documento
            for (String[] producto : productos) {
                Element eProducto = doc.createElement("producto");
                eRaiz.appendChild(eProducto);

                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(producto[0]));
                eProducto.appendChild(nombre);

                Element precio = doc.createElement("precio");
                precio.appendChild(doc.createTextNode(producto[1]));
                eProducto.appendChild(precio);

                Element cantidad = doc.createElement("cantidad");
                cantidad.appendChild(doc.createTextNode(producto[2]));
                eProducto.appendChild(cantidad);
            }

            // Guardar el documento XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("productos.xml"));
            transformer.transform(source, result);

            System.out.println("Archivo XML 'productos.xml' creado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
