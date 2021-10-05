package fr.diginamic.template_method.bo;

public class TelephonePortable extends ObjetConnecte {

	public TelephonePortable(Integer limiteVolts) {
		super(limiteVolts);
	}
	
	@Override
	public void indiquerInsuffisance() {
		System.out.println("La tension est insuffisante pour recharger le T�L�PHONE PORTABLE");	
	}

	@Override
	public void indiquerCharge() {
		System.out.println("Le T�L�PHONE PORTABLE est en charge");	
	}

	@Override
	public void indiquerGrillage() {
		System.out.println("Le T�L�PHONE PORTABLE est grill�");	
	}
	
}
