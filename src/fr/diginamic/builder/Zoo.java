package fr.diginamic.builder;

import java.util.HashMap;
import java.util.List;

public class Zoo {
	public String nom;
	
	//map listant les zones du zoo par nom des zones
	private HashMap<String, Zone> zones = new HashMap<String, Zone>();
	
	//map listant les animaux par zones du zoo
	private HashMap<Zone, List<Animal>> animaux = new HashMap<Zone, List<Animal>>();

	
	Zoo(String nom) {
		this.nom = nom;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashMap<String, Zone> getZones() {
		return zones;
	}

	public HashMap<Zone, List<Animal>> getAnimaux() {
		return animaux;
	}
	
	
}
