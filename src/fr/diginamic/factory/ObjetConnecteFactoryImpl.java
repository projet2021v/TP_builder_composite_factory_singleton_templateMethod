package fr.diginamic.factory;

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
