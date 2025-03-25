package br.com.erick.demo;

import br.com.erick.demo.convert.ReadXml;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorXmlApplication {

	private static ReadXml readXml = new ReadXml();

	public ConversorXmlApplication(ReadXml readXml) {
		ConversorXmlApplication.readXml = readXml;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConversorXmlApplication.class, args);
		System.out.println("ta rodando");
		readXml.start();
	}

}
