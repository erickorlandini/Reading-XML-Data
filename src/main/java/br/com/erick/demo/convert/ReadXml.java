package br.com.erick.demo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ReadXml {

    @Autowired
    PaisXml paisXml;

    public void start() {
        System.out.println("Starting reading xml \n");
        File diretorio = new File("/home/erick/Documentos/Projetos/Java/LeituraXML/src/main/dadosxml");
        File[] files = diretorio.listFiles();
        if (files == null) {
            System.err.println("Erro: O diretório 'dadosxml' não existe ou não é um diretório válido.");
            return;
        }
        int count = 0;
        for (File file : files) {
            count++;
            if(file.isFile() && file.getName().equalsIgnoreCase("pais.xml")) {
                System.out.println("O nome do arquivo é " + file.getName());
                paisXml.convert(file);
            }
        }
        System.out.println("temos " + count +" arquivos no diretorio.");
    }
}
