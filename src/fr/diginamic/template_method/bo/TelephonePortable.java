package fr.diginamic.template_method.bo;

public class TelephonePortable extends ObjetConnecte {

	public TelephonePortable(Integer limiteVolts) {
		super(limiteVolts);
	}
	
	@Override
	public void indiquerInsuffisance() {
		System.out.println("La tension est insuffisante pour recharger le TÉLÉPHONE PORTABLE");	
	}

	@Override
	public void indiquerCharge() {
		System.out.println("Le TÉLÉPHONE PORTABLE est en charge");	
	}

	@Override
	public void indiquerGrillage() {
		System.out.println("Le TÉLÉPHONE PORTABLE est grillé");	
	}
	
}
