package Datos.entrega1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class ej4 {
    public static void main(String[] args) {
       try {
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.newDocument();

			  // definimos el elemento raíz del documento
			  Element eRaiz = doc.createElement("empresa");
			  doc.appendChild(eRaiz);

			  // definimos el nodo que contendrá los elementos
			  Element departamento = doc.createElement("departamento");
			  eRaiz.appendChild(departamento);

			  // atributo para el nodo alumno
			  Attr attr = doc.createAttribute("nombre");
			  attr.setValue("Informatica");
			  departamento.setAttributeNode(attr);

              // definimos el nodo que contendrá los elementos
			  Element empleado = doc.createElement("empleado");
			  departamento.appendChild(empleado);

			  // definimos cada uno de los elementos y le asignamos un valor
			  Element nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Ana"));
			  empleado.appendChild(nombre);
              Element puesto = doc.createElement("puesto");
			  puesto.appendChild(doc.createTextNode("desarroladora"));
			  empleado.appendChild (puesto);

			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource(doc);
			  StreamResult result = new StreamResult(new File("empresa.xml"));
              transformer.transform(source, result);

    }catch  (Exception e) {
        System.out.println("Error al procesar el archivo XML: " + e.getMessage());
    }
  }
}
