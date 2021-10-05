package fr.diginamic.builder;

public class Zone {
	public String nom;
	public Integer capacite;
	
	Zone(String nom, Integer capacite) {
		this.nom = nom;
		this.capacite = capacite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}
	
	
	
	
}
