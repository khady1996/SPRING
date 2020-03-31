package eu.ensup.springannotations.service;

import java.util.List;

import eu.ensup.springannotations.dao.EleveDao;
import eu.ensup.springannotations.domaine.Eleve;


public class EleveService {

	
	private EleveDao elevedao;
	
	public EleveService(EleveDao elevedao) {
		super();
		this.elevedao = elevedao;
	}

	public EleveService() {
		super();
	}

	public EleveDao getElevedao() {
		return elevedao;
	}

	public void setElevedao(EleveDao elevedao) {
		this.elevedao = elevedao;
	}

	public void creerEleve(Eleve eleve) {
		elevedao.createStudent(new Eleve("TOUCHARD","DAVID"));
	}
	
	public Eleve lireEleve(int id) {
		return elevedao.getEleveById(id);
	}
	
	public void supprimerEleve(Eleve eleve) {
		elevedao.delete(eleve);
	}
	
	public List<Eleve> getAll(){
		return elevedao.getAll();
	}
	
}
