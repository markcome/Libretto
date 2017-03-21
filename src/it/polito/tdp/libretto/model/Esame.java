package it.polito.tdp.libretto.model;

import java.time.LocalDate;

/**
 * oggetto semplice che contiene i dati relativi
 * ad un singolo esame
 * POJO - Plain Old Java Object
 * 
 * dati privati
 * costruttore
 * motodi getters/setters
 * metodi di servizio (toString, equals, hashCode)
 * 
 * @author mark
 *
 */

public class Esame {

	private String codice;
	private String titolo;
	private String docente;
	private boolean superato;
	private int voto;
	private LocalDate dataSuperamento;
	
	
	/**
	 * Nuovo esame, non ancora superato
	 * @param codice codice dell'esame
	 * @param titolo denominazione del corso
	 * @param docente cognome e nome del docente titolare
	 */
	public Esame(String codice, String titolo, String docente) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.docente = docente;
		
		this.superato = false;
	}


	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}


	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}


	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}


	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	}


	/**
	 * @param docente the docente to set
	 */
	public void setDocente(String docente) {
		this.docente = docente;
	}


	/**
	 * @return the superato
	 */
	public boolean isSuperato() {
		return superato;
	}


	/** Restitutisce il voto solo se l'esame è superato,
	 * altrimenti eccezzione.
	 * @return the voto
	 */
	public int getVoto() {
		if(this.superato)
			return voto;
		else
			throw new IllegalStateException("Esame" + this.codice + "non ancora superato");
			
	}

	/**
	 * Restitutisce la data soltanto se l'esame è superato,
	 * se no eccezzione
	 * @return the dataSuperamento
	 */
	public LocalDate getDataSuperamento() {
		if(this.superato)
			return this.dataSuperamento;
		else
			throw new IllegalStateException("Esame" + this.codice + "non ancora superato");
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", titolo=" + titolo + ", docente=" + docente + ", superato=" + superato
				+ ", voto=" + voto + ", dataSuperamento=" + dataSuperamento + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}
	
	/**
	 * Se l'esame non è ancora suoerato, lo considera
	 * superato con il voto e la data spiecificati.
	 * Se invece l'esame è già superato, genera un'eccezione.
	 * 
	 * @param voto
	 * @param data
	 */
	public void supera(int voto, LocalDate data){
		if(!this.superato){
			//non ancora superato: OK
			this.superato = true;
			//if(voto > 17 && voto < 31)
			this.voto = voto;
			this.dataSuperamento = data;
		}else{
			throw new IllegalStateException("Esame" + this.codice + "già superato");
		}
	}
	
	
	
	
	
	
	
	
	
	
}