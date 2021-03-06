package fr.diginamic.builder;

public class Test {

	public static void main(String[] args) {
		
		ZooBuilder zoo1 = new ZooBuilder("monPremierZoo");
		
		zoo1.appendZone("zone1", 3);
		zoo1.appendZone("zone2", 2);
		
		zoo1.appendAnimal("zone1", new Lion());
		zoo1.appendAnimal("zone1", new Dauphin());
		zoo1.appendAnimal("zone1", new Animal("Ours"));
		zoo1.appendAnimal("zone1", new Animal("Girafe"));
		
		zoo1.appendAnimal("zone2", new Animal("Canard"));
		zoo1.appendAnimal("zone2", new Animal("Canard"));
		zoo1.appendAnimal("zone2", new Animal("Canard"));
		
		Zoo z = zoo1.get();
		
		System.out.println(z.toString());

	}

}
