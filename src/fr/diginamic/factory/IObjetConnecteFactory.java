package fr.diginamic.factory;

import fr.diginamic.factory.bo.ObjetConnecte;

public interface IObjetConnecteFactory {
	public ObjetConnecte createElement(Integer param, Integer limiteVolts);
}
