package Datos.entrega1;

import javax.xml.parsers.DocumentBuilder;

public class ej8 {
    public static void main(String[] args){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File("productos.xml"));
        doc.getDocumentElement().normalize();

        if(curso=="2DAM"){
            nota = nota+0.5;
            else if(nota>10){
                nota=10;
            }
            
        }
    }
}
