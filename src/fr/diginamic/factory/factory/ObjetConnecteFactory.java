package fr.diginamic.factory.factory;

import fr.diginamic.factory.bo.EnceinteConnectee;
import fr.diginamic.factory.bo.ObjetConnecte;
import fr.diginamic.factory.bo.Tablette;
import fr.diginamic.factory.bo.TelephonePortable;

public class ObjetConnecteFactory {

	public ObjetConnecte createElement(TypeObjetEnum typeObjet, Integer limiteVolts) {
		switch (typeObjet) {
		case telephonePortable:
			return new TelephonePortable(limiteVolts);
		case tablette:
			return new Tablette(limiteVolts);
		case enceinteConnectee:
			return new EnceinteConnectee(limiteVolts);
		}
		return null;
	}

}
