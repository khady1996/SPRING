package eu.ensup.springannotations.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springannotations.service.EleveService;


public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Chargement du conteneur
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demospringinjection.xml");
		
		// 2. Récupératon d'un bean
		EleveService eleveservice = (EleveService) appContext.getBean("eleveservice");
		
		//3. Manipulation du bean 
		System.out.println(eleveservice.lireEleve(1).toString());
		
		
	}

}
