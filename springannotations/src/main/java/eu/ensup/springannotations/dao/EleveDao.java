package eu.ensup.springannotations.dao;

import java.util.List;

import eu.ensup.springannotations.domaine.Eleve;


public class EleveDao {

	public void createStudent(Eleve eleve) {

		 System.out.println("creation de l'eleve");
	}

	public Eleve getEleveById(int id) {

		 System.out.println("recuperation de l'eleve dont l'ID est :" + id);
		 return new Eleve("khady", "ndiaye");
	}
	
	public void delete(Eleve eleve) {

		 System.out.println("suppression de l'eleve");
	}
	public List<Eleve> getAll() {

		 System.out.println("recuperation de tout les eleves");
		return null;
	}
	
	
}
