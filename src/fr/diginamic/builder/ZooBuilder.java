package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ZooBuilder {
	private Zoo zoo;

	public ZooBuilder(String nom) {
		this.zoo = new Zoo(nom);
	}
	
	public ZooBuilder appendZone(String nom, Integer capacite) {
		//ajout d'une nouvelle zone au zoo
		HashMap<String, Zone> zones = this.zoo.getZones();
		zones.put(nom, new Zone(nom, capacite));
		
		//ajout d'une liste d'animaux (vide) � la nouvelle zone
		this.zoo.getAnimaux().put(zones.get(nom), new ArrayList<Animal>());
		
		System.out.println("La zone \"" + nom + "\" a �t� ajout�e");
		
		return this;
	}
	
	public ZooBuilder appendAnimal(String nomZone, Animal animal) {
		//r�cup�ration de la zone dont le nom est en param�tre
		Zone zone = this.zoo.getZones().get(nomZone);
		
		//r�cup�ration de la liste d'animaux relative � la zone
		List<Animal> animauxDeLaZone = this.zoo.getAnimaux().get(zone);
		
		//test sur la capacit� de la zone � accueillir un nouvel animal
		if(animauxDeLaZone.size() < zone.capacite) {
			animauxDeLaZone.add(animal);
			System.out.println("Un(e) " + animal.getNom() + " a �t� ajout� � la zone " + zone.getNom());
		} else  {
			System.err.println("La zone \"" + zone.getNom() + "\" ne peut plus accepter d'animaux (capacit� d�j� atteinte)");
		}
		return this;
	}
	
	public Zoo get() {
		return this.zoo;
	}

}
