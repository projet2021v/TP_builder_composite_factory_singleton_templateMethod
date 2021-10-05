package fr.diginamic.singleton;

public class testSingleton {

	public static void main(String[] args) {
		
		ConfigurationSingleton config = ConfigurationSingleton.getInstance();
		
		System.out.println(config.getConfiguration().getString("db.user"));
	}

}
