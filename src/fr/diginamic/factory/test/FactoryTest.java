package fr.diginamic.factory.test;

import fr.diginamic.factory.bo.ObjetConnecte;
import fr.diginamic.factory.factory.ObjetConnecteFactory;
import fr.diginamic.factory.factory.TypeObjetEnum;

public class FactoryTest {

	public static void main(String[] args) {
		
		ObjetConnecte tel = new ObjetConnecteFactory().createElement(TypeObjetEnum.telephonePortable, 100);
		
		ObjetConnecte tab = new ObjetConnecteFactory().createElement(TypeObjetEnum.tablette, 200);
		
		ObjetConnecte enc = new ObjetConnecteFactory().createElement(TypeObjetEnum.enceinteConnectee,  300);
		
		System.out.println("Objet 1 : " + tel.getClass().getSimpleName() + " (" + tel.getLimiteVolts() + " V)");
		System.out.println("Objet 2 : " + tab.getClass().getSimpleName() + " (" + tab.getLimiteVolts() + " V)");
		System.out.println("Objet 3 : " + enc.getClass().getSimpleName() + " (" + enc.getLimiteVolts() + " V)");
	}

}
