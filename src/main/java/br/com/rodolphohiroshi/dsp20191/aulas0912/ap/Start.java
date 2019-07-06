package br.com.rodolphohiroshi.dsp20191.aulas0912.ap;

import java.io.File;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Start {

    private static final Long MATRICULA = 201000931L;
    public static void main(String[] args) {

        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read( inputFile );
            List<Node> nodes = document.selectNodes("/class/student" );
            for (Node node : nodes) {
                if (node.selectSingleNode("matricula").getText().equals(MATRICULA.toString())) {
                    System.out.println("Matrícula : "
                            + node.selectSingleNode("matricula").getText());
                    System.out.println("Nome : "
                            + node.selectSingleNode("firstname").getText());
                    System.out.println("Sobrenome : "
                            + node.selectSingleNode("lastname").getText());
                    System.out.println("First Name : "
                            + node.selectSingleNode("nickname").getText());
                    System.out.println("Frequencia  aula: 0104: " + node.selectSingleNode("frequencia/aulas").getText());
                    if(node.selectSingleNode("frequencia/aulas").getText() == "f"){
                        System.out.println("Frequencia  aula: 0104 alterada para:pf");
                     }
                    else {
                        System.out.println("Frequencia  aula: 0104 alterada para: f");
                    }
                    }

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}