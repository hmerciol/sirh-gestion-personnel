package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import dev.sgp.util.Constantes;

public class Collaborateur {

	private static int currentMatricule = 0;

	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numeroDeSecuriteSociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;

	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param adresse
	 * @param numeroDeSecuriteSociale
	 * @param emailPro
	 * @param dateHeureCreation
	 * @param actif
	 */
	public Collaborateur(String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numeroDeSecuriteSociale) {
		super();
		matricule = "M" + (currentMatricule++);
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		emailPro = prenom + "." + nom + "@societe.com";
		photo = Constantes.DEFAULT_AVATAR;
		dateHeureCreation = ZonedDateTime.now();
		actif = true;
	}

	/**
	 * Getter for the matricule
	 * 
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Setter for the matricule
	 * 
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Getter for the nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter for the nom
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter for the prenom
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter for the prenom
	 * 
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter for the dateDeNaissance
	 * 
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * Setter for the dateDeNaissance
	 * 
	 * @param dateDeNaissance
	 *            the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * Getter for the adresse
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter for the adresse
	 * 
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter for the numeroDeSecuriteSociale
	 * 
	 * @return the numeroDeSecuriteSociale
	 */
	public String getNumeroDeSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}

	/**
	 * Setter for the numeroDeSecuriteSociale
	 * 
	 * @param numeroDeSecuriteSociale
	 *            the numeroDeSecuriteSociale to set
	 */
	public void setNumeroDeSecuriteSociale(String numeroDeSecuriteSociale) {
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
	}

	/**
	 * Getter for the emailPro
	 * 
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/**
	 * Setter for the emailPro
	 * 
	 * @param emailPro
	 *            the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/**
	 * Getter for the photo
	 * 
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Setter for the photo
	 * 
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Getter for the dateHeureCreation
	 * 
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	// pas de setter pour dateHeureCreation
	/**
	 * Getter for the actif
	 * 
	 * @return the actif
	 */
	public boolean isActif() {
		return actif;
	}

	/**
	 * Setter for the actif
	 * 
	 * @param actif
	 *            the actif to set
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}

}
