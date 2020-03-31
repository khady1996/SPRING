package eu.ensup.springannotations.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springannotations.configuration.ConfigurationBeans;
import eu.ensup.springannotations.service.EleveService;


public class LanceurConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//1. Chargement du conteneur
		ApplicationContext appContext = (ApplicationContext) new AnnotationConfigApplicationContext(ConfigurationBeans.class);
		// 2. Récupératon d'un bean
		EleveService eleveservice = (EleveService) appContext.getBean("eleveservice");
		
		//3. Manipulation du bean 
		System.out.println(eleveservice.lireEleve(2).toString());
		
	}
	

}
