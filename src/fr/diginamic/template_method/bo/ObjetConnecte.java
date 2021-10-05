package fr.diginamic.template_method.bo;

public abstract class ObjetConnecte {
	private Integer limiteVolts;

	
	public ObjetConnecte(Integer limiteVolts) {
		this.limiteVolts = limiteVolts;
	}
	
	public Integer getLimiteVolts() {
		return limiteVolts;
	}

	public void setLimiteVolts(Integer limiteVolts) {
		this.limiteVolts = limiteVolts;
	}
	
	public void recharger(Integer volts) {
		if (volts > this.limiteVolts) {
			indiquerGrillage();
		} else if (volts == this.limiteVolts) {
			indiquerCharge();
		} else {
			indiquerInsuffisance();
		}
	}

	public abstract void indiquerInsuffisance();

	public abstract void indiquerCharge();

	public abstract void indiquerGrillage();

	
}
