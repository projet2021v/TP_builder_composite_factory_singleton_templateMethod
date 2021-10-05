package fr.diginamic.template_method.test;

import fr.diginamic.template_method.bo.ObjetConnecte;
import fr.diginamic.template_method.factory.ObjetConnecteFactoryImpl;

public class Test {

	public static void main(String[] args) {
		ObjetConnecte tel = new ObjetConnecteFactoryImpl().createElement(1, 100);
		
		ObjetConnecte tab = new ObjetConnecteFactoryImpl().createElement(2, 200);
		
		ObjetConnecte enc = new ObjetConnecteFactoryImpl().createElement(3,  300);
		
		//grillage
		tab.recharger(250);
		
		//charge
		tel.recharger(100);
		
		//insuffisance
		enc.recharger(200);
	}

}
