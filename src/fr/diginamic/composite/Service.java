package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
	
	private String nom;
	private List<IElement> listeElements;
	
	Service(String nom) {
		this.nom = nom;
		this.listeElements = new ArrayList<IElement>();
	}

	@Override
	public double calculerSalaire() {
		double totalSalairesService = 0;
		for(IElement elt : this.listeElements) {
			totalSalairesService += elt.calculerSalaire();
		}
		return totalSalairesService;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<IElement> getListeElements() {
		return listeElements;
	}
	
	

}
