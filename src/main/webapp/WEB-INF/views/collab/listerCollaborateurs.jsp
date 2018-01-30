<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@page import="java.util.List"%>
<%@page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Liste des collaborateurs</title>
</head>

<body class="container-fluid">
	<!-- entête de navigation -->
	<ul class="navbar navbar-expand-sm">
		<li class="navbar-nav"><a class="navbar-brand" href="../"> <img
				src="../images/logo.jpg" alt="Logo" style="width: 40px;">
		</a></li>
		<li class="navbar-nav"><a class="nav-link active" href="./lister">Collaborateurs</a></li>
		<li class="navbar-nav"><a class="nav-link" href="../statistiques">Statistiques</a>
		</li>
		<li class="navbar-nav"><a class="nav-link" href="../activites">Activités</a>
		</li>
	</ul>

	<!-- haut de page -->
	<header>
		<div class="row">
			<div class="col-xl-12 mt-2 mr-2">
				<div class="float-sm-right">
					<a href="./creer" class="btn btn-basic" role="button">Ajouter
						un nouveau collaborateur</a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xl-12 ml-5 mt-2">
				<p class="h1">Les collaborateurs</p>
			</div>
		</div>
	</header>

	<!-- zone de recherche -->
	<form>
		<div class="ml-5 mt-4">
			<div class="row">
				<div class="col-xl-4">
					<div class="float-sm-right">
						<label for="nameSearch">Rechercher un nom ou un prénom qui
							commence par : </label>
					</div>
				</div>
				<div class="col-xl-2">
					<input type="text" class="form-control" id="nameSearch">
				</div>
				<div class="col-xl-1">
					<button type="button" class="btn btn-basic">Rechercher</button>
				</div>
				<div class="col-xl-4 ml-1">
					<div class="form-check float-sm-right">
						<input class="form-check-input" type="checkbox" value=""
							id="showInactives"> <label class="form-check-label"
							for="showInactives">Voir les collaborateurs désactivés</label>
					</div>
				</div>
			</div>
			<div class="row mt-2">
				<div class="col-xl-4">
					<div class="float-sm-right">
						<label for="departementFilter">Filtrer par département : </label>
					</div>
				</div>
				<div class="col-xl-2">
					<select class="form-control" id="departementFilter">
						<option>Tous</option>
						<%
							Object oDeps = request.getAttribute("listDeps");
							if (oDeps != null) {
								List<Departement> deps = (List<Departement>) oDeps;
								if (!(deps.isEmpty())) {
									for (Departement dep : deps) {
						%>
						<option><%=dep.getNom()%></option>
						<%
							}
								}
							}
						%>
					</select>
				</div>
			</div>
		</div>
	</form>

	<!-- corps de la page (liste des collaborateurs) -->
	<section class="ml-5 mr-5 mt-5">
		<div class="row">
			<%
				Object oCollabs = request.getAttribute("listCollabs");
				if (oCollabs == null) {
			%>
			<div>
				<p>Aucun collaborateur à afficher</p>
			</div>
			<%
				} else {
					List<Collaborateur> collabs = (List<Collaborateur>) oCollabs;
					if (collabs.isEmpty()) {
			%>
			<div>
				<p>Aucun collaborateur à afficher</p>
			</div>
			<%
				} else {
						for (Collaborateur collab : collabs) {
			%>
			<div class="col-xl-4 mb-5">
				<div class="card">
					<div class="card-header">
						<%=collab.getNom()%>
						<%=collab.getPrenom()%>
						<%=collab.getMatricule()%>
					</div>
					<div class="card-body">
						<div class="row">
							<img class="img-thumbnail" src="../images/<%=collab.getPhoto()%>"
								alt="photo">
							<div class="col">
								<div class="row">
									<div class="col">Fonction</div>
									<div class="col"><%=collab.getIntitulePoste()%></div>
								</div>
								<div class="row">
									<div class="col">Département</div>
									<div class="col"><%=collab.getDepartement().getNom()%></div>
								</div>
								<div class="row">
									<div class="col">Email</div>
									<div class="col">
										<%=collab.getEmailPro()%>
									</div>
								</div>
								<div class="row">
									<div class="col">Téléphone</div>
									<div class="col"><%=collab.getTelephone()%></div>
								</div>
							</div>
						</div>
					</div>
					<div class="card-footer">
						<div class="float-sm-right">
							<form method="get" action="./editer">
								<input type="hidden" name="matricule" value="<%=collab.getMatricule() %>">
								<button type="submit" class="btn btn-basic">Editer</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<%
				}
					}
				}
			%>
		</div>
	</section>

</body>

<!-- scripts -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js "
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN "
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js "
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q "
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js "
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl "
	crossorigin="anonymous"></script>
</html>