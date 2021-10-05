package fr.diginamic.template_method.bo;

public class EnceinteConnectee extends ObjetConnecte {

	public EnceinteConnectee(Integer limiteVolts) {
		super(limiteVolts);
	}
	
	@Override
	public void indiquerInsuffisance() {
		System.out.println("La tension est insuffisante pour recharger l'ENCEINTE CONNECTEE");	
	}

	@Override
	public void indiquerCharge() {
		System.out.println("L'ENCEINTE CONNECTEE est en charge");	
	}

	@Override
	public void indiquerGrillage() {
		System.out.println("L'ENCEINTE CONNECTEE est grillée");	
	}

}
