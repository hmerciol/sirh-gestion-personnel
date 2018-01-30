package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;
import dev.sgp.util.Constantes;

public class DepartementService {

	private List<Departement> listeDepartements = new ArrayList<>();

	public List<Departement> listerDepartements() {
		Constantes.PERSIST_SERVICE.updateDeps();
		if (listeDepartements.isEmpty()) {
			listeDepartements.add(new Departement(0, "Non renseigné"));
			listeDepartements.add(new Departement(1, "Comptabilité"));
			listeDepartements.add(new Departement(2, "Ressources Humaines"));
			listeDepartements.add(new Departement(3, "Informatique"));
			listeDepartements.add(new Departement(4, "Administratif"));
			for (Departement dep : listeDepartements) {
				Constantes.PERSIST_SERVICE.persistDep(dep);
			}
		}
		return listeDepartements;
	}

	public Departement getDepByKey(int key) {
		for (Departement departement : listeDepartements) {
			if (departement.getId() == key) {
				return departement;
			}
		}
		return null;
	}

	public void setDepartements(List<Departement> deps) {
		listeDepartements = deps;
	}
}
