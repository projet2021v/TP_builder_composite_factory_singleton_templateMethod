package fr.diginamic.composite;

public class test {

	public static void main(String[] args) {
		Service DSIN = new Service("DSIN");
		Service BigData = new Service("Big Data");
		Service JavaDev = new Service ("Java Dev");
		
		Employe CecileRaspey = new Employe("Raspey", "Cécile", 10000);
		Employe BilelBechkar = new Employe("Bechkar", "Bilel", 8000);
		DSIN.getListeElements().add(CecileRaspey);
		DSIN.getListeElements().add(BilelBechkar);
		
		Employe JbRanmey = new Employe("Ranmey", "JB", 7500);
		Employe JaneDoe = new Employe("Doe", "Jane", 3500);
		BigData.getListeElements().add(JbRanmey);
		BigData.getListeElements().add(JaneDoe);
		
		Employe KevinGuineau = new Employe("Guineau", "Kevin", 7500);
		Employe PaulMartin = new Employe("Martin", "Paul", 3500);
		JavaDev.getListeElements().add(KevinGuineau);
		JavaDev.getListeElements().add(PaulMartin);
		
		System.out.println(CecileRaspey.calculerSalaire());
		System.out.println(DSIN.calculerSalaire());
	}

}
