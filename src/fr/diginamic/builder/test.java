package fr.diginamic.builder;

public class test {

	public static void main(String[] args) {
		
		ZooBuilder zoo1 = new ZooBuilder("monPremierZoo");
		
		zoo1.appendZone("zone1", 3);
		
		zoo1.appendAnimal("zone1", "Lion");
		zoo1.appendAnimal("zone1", "Girafe");
		zoo1.appendAnimal("zone1", "Pingouin");
		zoo1.appendAnimal("zone1", "Ours");
		
		Zoo zoo = zoo1.getZoo();

	}

}
