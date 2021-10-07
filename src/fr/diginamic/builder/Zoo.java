package fr.diginamic.builder;

import java.util.HashMap;
import java.util.List;

public class Zoo {
	public String nom;
	
	//map listant les zones du zoo par nom des zones
	private HashMap<String, Zone> zones;
	
	//map listant les animaux par zones du zoo
	private HashMap<Zone, List<Animal>> animaux;

	
	Zoo(String nom) {
		this.nom = nom;
		this.zones = new HashMap<String, Zone>();
		this.animaux = new HashMap<Zone, List<Animal>>();
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		this.getZones().forEach((nom, zone) ->
		{
			builder.append(this.getNom() + " / " + zone.getNom() + " (capacité " + zone.getCapacite() + " animaux) : ");
			
			this.getAnimaux().get(zone).forEach((animal) ->
			{
				builder.append(animal.getNom() + ", ");
			});
			
			//suppression de la dernière virgule
			builder.deleteCharAt(builder.length()-2);
			builder.append("\n");
		});
		
		return builder.toString();
	}
	
	
}
