package fr.diginamic.template_method.bo;

public class Tablette extends ObjetConnecte {

	public Tablette(Integer limiteVolts) {
		super(limiteVolts);
	}

	@Override
	public void indiquerInsuffisance() {
		System.out.println("La tension est insuffisante pour recharger la TABLETTE");	
	}

	@Override
	public void indiquerCharge() {
		System.out.println("La TABLETTE est en charge");	
	}

	@Override
	public void indiquerGrillage() {
		System.out.println("La TABLETTE est grillée");	
	}
	
}
