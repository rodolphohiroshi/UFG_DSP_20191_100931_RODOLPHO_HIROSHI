package br.com.rodolphohiroshi.dsp20191.aulas0912.ap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Start {
    public static void main(String[] args){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder  builder = factory.newDocumentBuilder();

            Document doc = builder.parse("src/main/resources/students.xml");
            NodeList listaStudent = doc.getElementsByTagName("student");
            int tamanhoLista = listaStudent.getLength();

            for (int i = 0;i<tamanhoLista;i++){

                Node noStudent = listaStudent.item(i);
                if(noStudent.getNodeType()==Node.ELEMENT_NODE){
                    Element elementoStudent = (Element) noStudent;

                    NodeList listaStudentAtributos = elementoStudent.getChildNodes();

                    int tamanhoListaChild = listaStudentAtributos.getLength();

                    for(int j = 0 ; j <tamanhoListaChild;j++ ){
                        Node noFilho = listaStudentAtributos.item(j);

                        if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                            Element elementoFilho = (Element) noFilho;

                            String s = elementoFilho.getTagName();
                            if ("matricula".equals(s)) {
                                System.out.println("Matricula = " + elementoFilho.getTextContent());
                            } else if ("firstname".equals(s)) {
                                System.out.println("firstname = " + elementoFilho.getTextContent());
                            } else if ("lastname".equals(s)) {
                                System.out.println("lastname = " + elementoFilho.getTextContent());
                            } else if ("nickname".equals(s)) {
                                System.out.println("nickname = " + elementoFilho.getTextContent());
                            }
                        }



                    }

                }
            }



        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }


    }
}
