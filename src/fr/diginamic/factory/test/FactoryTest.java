package fr.diginamic.factory.test;

import fr.diginamic.factory.bo.ObjetConnecte;
import fr.diginamic.factory.factory.ObjetConnecteFactoryImpl;

public class FactoryTest {

	public static void main(String[] args) {
		
		ObjetConnecte tel = new ObjetConnecteFactoryImpl().createElement(1, 100);
		
		ObjetConnecte tab = new ObjetConnecteFactoryImpl().createElement(2, 200);
		
		ObjetConnecte enc = new ObjetConnecteFactoryImpl().createElement(3,  300);
		
		System.out.println("Objet 1 : " + tel.getClass().getSimpleName() + " (" + tel.getLimiteVolts() + " V)");
		System.out.println("Objet 2 : " + tab.getClass().getSimpleName() + " (" + tab.getLimiteVolts() + " V)");
		System.out.println("Objet 3 : " + enc.getClass().getSimpleName() + " (" + enc.getLimiteVolts() + " V)");
	}

}
