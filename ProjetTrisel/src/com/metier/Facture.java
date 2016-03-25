package com.metier;

import javax.persistence.*;


@Entity
@Table (name="facture")
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
public class Facture {
	
	@Id
	@GeneratedValue 
	@Column (name="idFacture")
	private int idF;
	
	@Column (name="idHabitation")
	private String idHabitation; 
	@Column (name="nomF")
	private String nomF;
	@Column (name="moisF")
	private int moisF;
	@Column (name="anF")
	private int anneeF;
	public Facture(){		
	}
	
	public Facture(String nom,int a,int m){
		
		nomF = nom;
		moisF = m;
		anneeF = a;
		
	}
	public Facture(int id,String nom,int a,int m){
		idF = id;
		
		nomF = nom;
		moisF = m;
		anneeF = a;
	}
	public int getIdF() {
		return idF;
	}
	
	public int getMois() {
		return moisF;
	}
	public void setMois(int mois) {
		this.moisF = mois;
	}
	public int getAnnee() {
		return anneeF;
	}
	public void setAnnee(int annee) {
		this.anneeF = annee;
	}
	public String getNomF() {
		return nomF;
	}
	public void setNomF(String nomF) {
		this.nomF = nomF;
	}
}
