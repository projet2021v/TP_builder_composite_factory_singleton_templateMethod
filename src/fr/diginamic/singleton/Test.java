package fr.diginamic.singleton;

public class Test {

	public static void main(String[] args) {
		
		ConfigurationSingleton config = ConfigurationSingleton.getInstance();
		
		System.out.println(config.getConfiguration().getString("db.url"));
		System.out.println(config.getConfiguration().getString("db.user"));
		System.out.println(config.getConfiguration().getString("db.password"));
	}

}
