package it.polito.tdp.libretto.model;

import java.util.*;

public class LibrettoModel {

	private List<Esame> esami;
	
	
	public LibrettoModel(){
		this.esami = new ArrayList<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti
	 * verificando che non ci sia già
	 * @param e
	 * @return true se l'ha inserito, false se esisteva già e non lo ha potuto inserire
	 */
	public boolean addEsame(Esame e){
		if(!esami.contains(e)){
			this.esami.add(e);
			return true;
		}else
			return false;
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste lo restitutisce, altrimenti restituisce null
	 * @param codice codice dell'esame da cercare
	 * @return l?esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice){
		int pos = this.esami.indexOf(new Esame(codice, null, null));
		if(pos == -1)
			return null;
		else
			return esami.get(pos);
	}
	
	
	
	
	
}
