package dev.sgp.entite;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departement {
	
	@Id
	private int id;
	private String nom;
	
	/**
	 * 
	 */
	public Departement() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 */
	public Departement(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	/**
	 * Getter for the id
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Setter for the id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Getter for the nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Setter for the nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
