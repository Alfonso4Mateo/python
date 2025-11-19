/*
 * José Manuel Ruiz
 * Ilerna
 */

package Datos.entrega1;

//Librerías de DOM 
import org.w3c.dom.*;

//Clases JAXP 
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilderFactory;

public class EscrituraXml1elemento {

	public static void main(String[] args) {
		
		
		
		try {
			
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.newDocument();

			  //Se define el elemento raíz del documento
			  Element eRaiz = doc.createElement("clase");
			  doc.appendChild(eRaiz);

			  //Se define el nodo que contendrá los elementos del nodo raiz clase
			  Element alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo alumno
			  Attr attr = doc.createAttribute("id");
			  attr.setValue("1");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  Element nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("José"));
			  alumno.appendChild(nombre);

			  Element apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Ruiz González"));
			  alumno.appendChild(apellidos);

			  Element edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("28"));
			  alumno.appendChild(edad);
			  
			  
			  
		
			  
			  
			  

			  // Clases necesarias para la creación del archivo XML a partir de la estructura DOM creada
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource(doc);
			  StreamResult result = new StreamResult(new File("SalidaEscrituraXML_1elemento.xml"));

			  transformer.transform(source, result);
			  
			  System.out.println("Fin de programa -> Se ha creado del fichero XML");
			  
			} catch(Exception e) {
			  e.printStackTrace();
			}
		
		
		// TODO Auto-generated method stub

	}

}
