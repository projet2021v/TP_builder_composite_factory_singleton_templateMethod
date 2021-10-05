package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZooBuilder {
	private Zoo zoo;
	
	//liste des zones du zoo <nom de la zone, Zone>
	private HashMap<String, Zone> zones;
	
	//liste des animaux des zones du zoo
	private HashMap<Zone, ArrayList<Animal>> animaux;
	
	public ZooBuilder(String nom) {
		this.zoo = new Zoo(nom);
		this.zones = new HashMap<String, Zone>();
		this.animaux = new HashMap<Zone, ArrayList<Animal>>();
	}
	
	public ZooBuilder appendZone(String nom, Integer capacite) {
		this.zones.put(nom, new Zone(nom, capacite));
		this.animaux.put(zones.get(nom), new ArrayList<Animal>());
		return this;
	}
	
	public ZooBuilder appendAnimal(String nomZone, String nomAnimal) {
		Zone zone = zones.get(nomZone);
		if(animaux.get(zone).size() < zone.capacite) {
			animaux.get(zone).add(new Animal(nomAnimal));
		}
		return this;
	}
	
	public Zoo getZoo() {
		return this.zoo;
	}
}
