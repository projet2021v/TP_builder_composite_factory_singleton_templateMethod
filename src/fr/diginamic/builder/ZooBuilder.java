package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ZooBuilder {
	private Zoo zoo;

	public ZooBuilder(String nom) {
		this.zoo = new Zoo(nom);
	}
	
	public ZooBuilder appendZone(String nom, Integer capacite) {
		//ajout d'une nouvelle zone au zoo
		HashMap<String, Zone> zones = this.zoo.getZones();
		zones.put(nom, new Zone(nom, capacite));
		
		//ajout d'une liste d'animaux � la nouvelle zone
		this.zoo.getAnimaux().put(zones.get(nom), new ArrayList<Animal>());
		return this;
	}
	
	public ZooBuilder appendAnimal(String nomZone, Animal animal) {
		//r�cup�ration de la zone dont le nom est en param�tre
		Zone zone = this.zoo.getZones().get(nomZone);
		
		//r�cup�ration de la liste d'animaux relative � la zone
		List<Animal> animaux = this.zoo.getAnimaux().get(zone);
		
		//test sur la capacit� de la zone � accueillir un nouvel animal
		if(animaux.size() < zone.capacite) {
			animaux.add(animal);
		}
		return this;
	}
	
	public Zoo get() {
		return this.zoo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		zoo.getAnimaux().forEach((zone, animaux) -> 
			{
				for(Animal a : animaux) {
					builder.append(
							zoo.getNom()
							+ " : "
							+ zone.getNom()
							+ " (capacit� "
							+ zone.getCapacite()
							+ ") "
							+ a.getNom()
							+ "\n");
				}
			}
		);
		return builder.toString();
	}
	
	
}
