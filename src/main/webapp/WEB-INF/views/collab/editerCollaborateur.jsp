<%@page import="dev.sgp.entite.Collaborateur"%>
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
<title>Editer un collaborateur</title>
</head>

<body class="container-fluid">
	<!-- entête de navigation -->
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

	<section>
		<%
			Object oCollab = request.getAttribute("collab");
			if (oCollab == null) {
		%>
		<div>
			<p>Aucun collaborateur à afficher</p>
		</div>
		<%
			} else {
				Collaborateur collab = (Collaborateur) oCollab;
		%>
		<!-- photo -->
		<div class="col-auto">
			<img class="float-left img-fluid img-thumbnail" style="width: 30%;"
				src="../images/<%=collab.getPhoto()%>" alt="photo">
		</div>
		<div class="col-xl-10">
			<!-- entête -->
			<div class="row">
				<h1><%=collab.getNom()%>
					<%=collab.getPrenom()%>
					-
					<%=collab.getMatricule()%></h1>
				<div class="col-lg-2 ml-1">
					<div class="form-check float-sm-right">
						<input class="form-check-input" type="checkbox" value=""
							id="inactive"> <label class="form-check-label"
							for="inactive">Désactiver</label>
					</div>
				</div>
			</div>

			<!-- données -->
			<div class="row">
				<div class="col-xl-10" id="accordion">
					<div class="card">
						<div class="card-header" id="headingOne">
							<h5 class="mb-0">
								<button class="btn btn-link" data-toggle="collapse"
									data-target="#identity" aria-expanded="true"
									aria-controls="collapseOne">Identité</button>
							</h5>
						</div>
						<div id="identity" class="collapse show"
							aria-labelledby="headingOne" data-parent="#accordion">
							<div class="card-body">
								<form class="needs-validation" novalidate>
									<!-- <div class="row">
										<div class="col-4">
											<label class="float-right" for="gender">Civilité</label>
										</div>
										<div class="col-6">
											<select class="form-control" name="gender">
												<option class="is-invalid"></option>
												<option>M.</option>
												<option>Mme.</option>
											</select>
											<div class="invalid-feedback">La civilité est
												obligatoire.</div>
										</div>
									</div> -->
									<div class="row mt-4">
										<div class="col-4">
											<label class="float-right" for="lastname">Nom</label>
										</div>
										<div class="col-6">
											<input type="text" class="form-control" name="lastname"
												value="<%=collab.getNom()%>" required>
											<div class="invalid-feedback">Le nom est obligatoire.</div>
										</div>
									</div>
									<div class="row mt-4">
										<div class="col-4">
											<label class="float-right" for="firstname">Prénom</label>
										</div>
										<div class="col-6">
											<input type="text" class="form-control" name="firstname"
												value="<%=collab.getPrenom()%>" required>
											<div class="invalid-feedback">Le prénom est
												obligatoire.</div>
										</div>
									</div>
									<div class="row mt-4">
										<div class="col-4">
											<label class="float-right" for="birthday">Date de
												naissance</label>
										</div>
										<div class="col-6">
											<input type="date" class="form-control" name="birthday"
												value="<%=collab.getDateDeNaissance()%>" required>
											<div class="invalid-feedback">La date de naissance est
												obligatoire.</div>
										</div>
									</div>
									<div class="row mt-4">
										<div class="col-4">
											<label class="float-right" for="location">Adresse</label>
										</div>
										<div class="col-6">
											<textarea class="form-control" rows="4" name="location"
												value="<%=collab.getAdresse()%>" required></textarea>
											<div class="invalid-feedback">L'adresse est
												obligatoire.</div>
										</div>
									</div>
									<div class="row mt-4">
										<div class="col-4">
											<label class="float-right" for="social">Numéro de
												sécurité sociale</label>
										</div>
										<div class="col-6">
											<input type="text" class="form-control" name="social"
												value="<%=collab.getNumeroDeSecuriteSociale()%>" required>
											<div class="invalid-feedback">Le numéro de sécurité
												sociale est obligatoire.</div>
										</div>
									</div>
									<div class="row mt-4">
										<div class="col-4">
											<label class="float-right" for="phone">Téléphone</label>
										</div>
										<div class="col-6">
											<input type="text" class="form-control" name="phone"
												value="<%=collab.getTelephone()%>" required>
											<div class="invalid-feedback">Le numéro de téléphone
												est obligatoire.</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>

					<div class="card">
						<div class="card-header" id="headingTwo">
							<h5 class="mb-0">
								<button class="btn btn-link collapsed" data-toggle="collapse"
									data-target="#station" aria-expanded="false"
									aria-controls="collapseTwo">Poste</button>
							</h5>
						</div>
						<div id="station" class="collapse" aria-labelledby="headingTwo"
							data-parent="#accordion">
							<div class="card-body">
								<form class="needs-validation" novalidate>
									<div class="row">
										<div class="col-2">
											<label class="float-right" for="stationLocation">Département</label>
										</div>
										<div class="col-6">
											<select class="form-control" id="stationLocation">
												<option class="is-invalid"></option>
												<option>Comptabilité</option>
												<option>Ressources Humaines</option>
												<option>Informatique</option>
											</select>
											<div class="invalid-feedback">Le département du poste
												est obligatoire.</div>
										</div>
									</div>
									<div class="row mt-4">
										<div class="col-2">
											<label class="float-right" for="staionName">Nom</label>
										</div>
										<div class="col-6">
											<input type="text" class="form-control" id="stationName"
												required>
											<div class="invalid-feedback">Le libellé du poste est
												obligatoire.</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>

					<div class="card">
						<div class="card-header" id="headingThree">
							<h5 class="mb-0">
								<button class="btn btn-link collapsed" data-toggle="collapse"
									data-target="#bankData" aria-expanded="false"
									aria-controls="collapseThree">Coordonnées banquaires</button>
							</h5>
						</div>
						<div id="bankData" class="collapse" aria-labelledby="headingThree"
							data-parent="#accordion">
							<div class="card-body">
								<form class="needs-validation" novalidate>
									<div class="row">
										<div class="col-2">
											<label class="float-right" for="iban">IBAN</label>
										</div>
										<div class="col-6">
											<input type="text" class="form-control" id="iban" required>
											<div class="invalid-feedback">Le numéro IBAN est
												obligatoire.</div>
										</div>
									</div>
									<div class="row mt-4">
										<div class="col-2">
											<label class="float-right" for="bic">BIC</label>
										</div>
										<div class="col-6">
											<input type="text" class="form-control" id="bic" required>
											<div class="invalid-feedback">Le numéro BIC est
												obligatoire.</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>

				</div>
			</div>

			<div class="row">
				<div class="col mr-3 mt-3">
					<div class="float-sm-right">
						<button type="submit" class="btn btn-basic" id="saveBtn">
							Sauvegarder</button>
					</div>
				</div>
			</div>
		</div>
		<%
			}
		%>
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

<!-- script du validateur -->
<script>
	(function() {
		'use strict';
		$(document).ready(
				function() {
					document.getElementById("saveBtn").addEventListener(
							"click",
							function(event) {
								event.preventDefault();
								var forms = document
										.querySelectorAll('.needs-validation');
								for (var i = 0; i < forms.length; i++) {
									if (forms[i].checkValidity() === false) {
										location.search = "?errors";
									}
								}
							});
					if (location.search === "?errors") {
						$('.form-control').addClass('is-invalid');
					}
				});
	})();
</script>
</html>