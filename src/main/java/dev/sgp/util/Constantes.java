package dev.sgp.util;

import dev.sgp.persistence.GestionnairePersistence;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;

public interface Constantes {
	
	static final CollaborateurService COLLAB_SERVICE = new CollaborateurService();
	static final DepartementService DEPART_SERVICE = new DepartementService();
	static final GestionnairePersistence PERSIST_SERVICE = new GestionnairePersistence();
	
	static final String DEFAULT_AVATAR = "avatar.jpg";
}
