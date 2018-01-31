package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.util.Constantes;

public class EditerCollaborateurController extends HttpServlet {

	/** serialVersionUID (long) */
	private static final long serialVersionUID = -2624817299853340666L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est matricule
		String matricule = req.getParameter("matricule");

		// code HTML ecrit dans le corps de la reponse
		if (matricule == null) {
			resp.sendError(400, "Un matricule est attendu");
		} else {
			Collaborateur collab = Constantes.COLLAB_SERVICE.getCollabByMat(matricule);
			List<Departement> departements = Constantes.DEPART_SERVICE.listerDepartements();
			req.setAttribute("collab", collab);
			req.setAttribute("listDeps", departements);
			req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//TODO !!
		
		// recupere la valeur des parametres
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");

		// code HTML ecrit dans le corps de la reponse
		if (matricule == null || titre == null || nom == null || prenom == null) {
			resp.sendError(400,	"Les param&egrave;tres suivants sont incorrects : " 
					+ (matricule == null ? "matricule " : "")
					+ (titre == null ? "titre " : "") 
					+ (nom == null ? "nom " : "")
					+ (prenom == null ? "prenom " : ""));
		} else {
			resp.getWriter().write("<p>Cr&eacute;ation d'un collaborateur avec les informations suivantes :<br/>"
					+ "matricule=" + matricule + ",titre=" + titre + ",nom=" + nom + ",prenom=" + prenom + "</p>");
			resp.setStatus(201);
		}
	}

}
