package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.util.Constantes;

public class CollaborateurService {

	private List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	public List<Collaborateur> listerCollaborateurs() {
		Constantes.PERSIST_SERVICE.updateCollabs();
		return listeCollaborateurs;
	}

	public Collaborateur getCollabByMat(String matricule) {
		Constantes.PERSIST_SERVICE.updateCollabs();
		for (Collaborateur collaborateur : listeCollaborateurs) {
			if (collaborateur.getMatricule().equals(matricule)) {
				return collaborateur;
			}
		}
		return null;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
		Constantes.PERSIST_SERVICE.persistCollab(collab);
	}

	public void setCollaborateurs(List<Collaborateur> collabs) {
		listeCollaborateurs = collabs;
	}
}
