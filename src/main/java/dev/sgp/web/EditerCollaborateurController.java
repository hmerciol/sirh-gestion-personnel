package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

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
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "<h2>Matricule : " + matricule + "</h2>");
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
