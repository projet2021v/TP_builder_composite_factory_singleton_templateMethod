package fr.diginamic.template_method.factory;

import fr.diginamic.template_method.bo.ObjetConnecte;

public interface IObjetConnecteFactory {
	public ObjetConnecte createElement(Integer param, Integer limiteVolts);
}
