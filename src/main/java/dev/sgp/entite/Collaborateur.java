package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import dev.sgp.util.Constantes;

@Entity
public class Collaborateur {

	@Id
	@GeneratedValue
	private Integer id;
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
	private String intitulePoste;
	@ManyToOne
	private Departement departement;
	private String telephone;

	/**
	 * 
	 */
	public Collaborateur() {
		super();
	}

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
		matricule = "M" + id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		emailPro = prenom + "." + nom + "@societe.com";
		photo = Constantes.DEFAULT_AVATAR;
		dateHeureCreation = ZonedDateTime.now();
		actif = true;
		intitulePoste = "non renseigné";
		departement = Constantes.DEPART_SERVICE.getDepByKey(0);
		telephone = "non renseigné";
	}

	/**
	 * Getter for the id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter for the id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

	/**
	 * Setter for the dateHeureCreation
	 * 
	 * @param dateHeureCreation
	 *            the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

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

	/**
	 * Getter for the intitulePoste
	 * 
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}

	/**
	 * Setter for the intitulePoste
	 * 
	 * @param intitulePoste
	 *            the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	/**
	 * Getter for the departement
	 * 
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/**
	 * Setter for the departement
	 * 
	 * @param departement
	 *            the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	/**
	 * Getter for the telephone
	 * 
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Setter for the telephone
	 * 
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
