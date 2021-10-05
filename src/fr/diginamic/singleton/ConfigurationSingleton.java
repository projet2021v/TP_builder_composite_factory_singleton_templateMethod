package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigurationSingleton {
	
	private static ConfigurationSingleton instance = null;
	private ResourceBundle configuration;
	
	private ConfigurationSingleton() {
		this.configuration = ResourceBundle.getBundle("configuration") ;
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
