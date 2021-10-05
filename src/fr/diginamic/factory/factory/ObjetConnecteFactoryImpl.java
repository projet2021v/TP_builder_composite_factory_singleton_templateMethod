package fr.diginamic.factory.factory;

import fr.diginamic.factory.bo.EnceinteConnectee;
import fr.diginamic.factory.bo.ObjetConnecte;
import fr.diginamic.factory.bo.Tablette;
import fr.diginamic.factory.bo.TelephonePortable;

public class ObjetConnecteFactoryImpl implements IObjetConnecteFactory {

	@Override
	public ObjetConnecte createElement(Integer param, Integer limiteVolts) {
		switch (param) {
		case 1:
			return new TelephonePortable(limiteVolts);
		case 2:
			return new Tablette(limiteVolts);
		case 3:
			return new EnceinteConnectee(limiteVolts);
		}
		
		return null;
	}

}
