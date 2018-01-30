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

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
		Constantes.PERSIST_SERVICE.persistCollab(collab);
	}
	
	public void setCollaborateurs(List<Collaborateur> collabs) {
		listeCollaborateurs = collabs;
	}
}
