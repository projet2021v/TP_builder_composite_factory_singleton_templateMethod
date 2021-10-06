package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigurationSingleton {
	
	private static ConfigurationSingleton instance = null;
	private ResourceBundle configuration = ResourceBundle.getBundle("fr.diginamic.singleton.configuration");
	
	private ConfigurationSingleton() {
	}
	
	public static ConfigurationSingleton getInstance() {
		if (instance == null) {
			instance = new ConfigurationSingleton();
		}
		return instance;
	}

	public ResourceBundle getConfiguration() {
		return this.configuration;
	}
}
