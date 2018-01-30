package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.util.Constantes;

public class CreerCollaborateurController extends HttpServlet {

	/** serialVersionUID (long) */
	private static final long serialVersionUID = 4545174928265638678L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
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
		String nom = req.getParameter("lastname");
		String prenom = req.getParameter("firstname");
		String strDate = req.getParameter("birthday");
		String adresse = req.getParameter("location");
		String secu = req.getParameter("socialnumber");

		// verification parametres
		if (nom.isEmpty() || prenom.isEmpty() || strDate.isEmpty() || adresse.isEmpty() || secu.isEmpty()) {
			resp.sendError(400,
					"Les paramètres suivants sont incorrects : " + (nom.isEmpty() ? "nom " : "")
							+ (prenom.isEmpty() ? "prenom " : "") + (strDate.isEmpty() ? "date " : "")
							+ (adresse.isEmpty() ? "adresse " : "") + (secu.isEmpty() ? "secu " : ""));
		} else {
			resp.setStatus(201);

			LocalDate dateDeNaissance = LocalDate.parse(strDate);
			Collaborateur newCollab = new Collaborateur(nom, prenom, dateDeNaissance, adresse, secu);
			newCollab.setMatricule("M" + newCollab.getId());
			Constantes.COLLAB_SERVICE.sauvegarderCollaborateur(newCollab);

			resp.sendRedirect("./lister");
		}
	}

}
