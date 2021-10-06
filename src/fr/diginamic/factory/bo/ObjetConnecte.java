package fr.diginamic.factory.bo;

public class ObjetConnecte {
	
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
}
