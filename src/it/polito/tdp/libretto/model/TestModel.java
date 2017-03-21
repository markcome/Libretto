package it.polito.tdp.libretto.model;

public class TestModel {

	public static void main(String[] args) {
		LibrettoModel m = new LibrettoModel();
		
		System.out.println(m.addEsame(new Esame("03FYZ", "Tecniche di programmazione", "Fulvio Corso")));
		System.out.println(m.addEsame(new Esame("01QZP", "ambient Intelligence", "Fulvio Corso")));
		System.out.println(m.addEsame(new Esame("03FYZ", "Tecniche di programmazione", "Fulvio Corso")));
		
		System.out.println(m.trovaEsame("03FYZ"));
		System.out.println(m.trovaEsame("01QZP"));
		System.out.println(m.trovaEsame("99QQQ"));

	}

}
