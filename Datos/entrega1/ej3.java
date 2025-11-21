package Datos.entrega1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;



public class ej3 {
    public static void main(String[] args) {
    try{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("alumnos.xml"));

        NodeList alumnos = doc.getElementsByTagName("alumno");

        int totalAlumnos = alumnos.getLength();
        double sumaNotas = 0.0;

        for (int i = 0; i < totalAlumnos; i++) {
            Element alumno = (Element) alumnos.item(i);
            String notaStr = alumno.getElementsByTagName("nota").item(0).getTextContent();
            double nota = Double.parseDouble(notaStr.trim());
            sumaNotas += nota;
        }
        double media = (totalAlumnos > 0) ? (sumaNotas / totalAlumnos) : 0.0;
        System.out.println("Número total de alumnos: " + totalAlumnos);
        System.out.println("Nota media: " + media);
    }catch (Exception e) {
        System.out.println("Error al procesar el archivo XML: " + e.getMessage());
    }
}
}