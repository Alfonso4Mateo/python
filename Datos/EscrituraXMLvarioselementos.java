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

public class EscrituraXMLvarioselementos {

	public static void main(String[] args) {
		
		
		
		try {
			
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.newDocument();

			  // definimos el elemento raíz del documento
			  Element eRaiz = doc.createElement("clase");
			  doc.appendChild(eRaiz);

			  // definimos el nodo que contendrá los elementos
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
			  apellidos.appendChild(doc.createTextNode("Álvarez García"));
			  alumno.appendChild(apellidos);

			  Element edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  

			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("2");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("María"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Baena López"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("3");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("José"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Bello García"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("4");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Gonzalo"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Clara Pérez"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("5");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Alejandro"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Collantes Linares"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("6");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("José Antonio"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Espinal Menacho"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("7");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Rafael"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Fernández Barroso"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("8");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Marina Fara"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Fernández Crespo"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("9");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Antonio Luis"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Macías Mestre"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("10");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("José Luis"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Marcelo Garratón"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("11");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Ismael"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Orcero Púa"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("12");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("José Antonio"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Ramos Lado"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("13");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("José Manuel"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Rodríguez González"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
			  
			  
			  // definimos el nodo que contendrá los elementos
			  alumno = doc.createElement("alumno");
			  eRaiz.appendChild(alumno);

			  // atributo para el nodo coche
			  attr = doc.createAttribute("id");
			  attr.setValue("14");
			  alumno.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  nombre = doc.createElement("nombre");
			  nombre.appendChild(doc.createTextNode("Coral"));
			  alumno.appendChild(nombre);

			  apellidos = doc.createElement("apellidos");
			  apellidos.appendChild(doc.createTextNode("Torralba Núñez"));
			  alumno.appendChild(apellidos);

			  edad = doc.createElement("edad");
			  edad.appendChild(doc.createTextNode("22"));
			  alumno.appendChild(edad);
			  
		
			  
			  
			  

			  // clases necesarias finalizar la creación del archivo XML
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource(doc);
			  StreamResult result = new StreamResult(new File("AccesoADatos.xml"));

			  transformer.transform(source, result);
			  
			  System.out.println("Fin de programa");
			  
			} catch(Exception e) {
			  e.printStackTrace();
			}
		
		
		// TODO Auto-generated method stub

	}
}
