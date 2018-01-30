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
<title>Créer un collaborateur</title>
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
		<div class="col-xl-12 ml-5 mt-2">
			<p class="h1">Nouveau collaborateur</p>
		</div>
	</header>

	<!-- formulaire -->
	<form class="needs-validation" novalidate method="POST"
		action="./creer">
		<div class="row justify-content-md-center">
			<div class="col-xl-10">
				<div class="row ml-5 mt-4">
					<div class="col-xl-4">
						<div class="float-sm-left">
							<label for="lastname">Nom</label>
						</div>
					</div>
					<div class="col-xl-6">
						<input type="text" class="form-control" name="lastname" required>
						<div class="invalid-feedback">Le nom est obligatoire.</div>
					</div>
				</div>
				<div class="row ml-5 mt-4">
					<div class="col-xl-4">
						<div class="float-sm-left">
							<label for="firstname">Prénom</label>
						</div>
					</div>
					<div class="col-xl-6">
						<input type="text" class="form-control" name="firstname" required>
						<div class="invalid-feedback">Le prénom est obligatoire.</div>
					</div>
				</div>
				<div class="row ml-5 mt-4">
					<div class="col-xl-4">
						<div class="float-sm-left">
							<label for="birthday">Date de naissance</label>
						</div>
					</div>
					<div class="col-xl-6">
						<input type="date" class="form-control" name="birthday" required>
						<div class="invalid-feedback">La date de naissance est
							obligatoire.</div>
					</div>
				</div>
				<div class="row ml-5 mt-4">
					<div class="col-xl-4">
						<div class="float-sm-left">
							<label for="location">Adresse</label>
						</div>
					</div>
					<div class="col-xl-6">
						<textarea class="form-control" rows="4" name="location" required></textarea>
						<div class="invalid-feedback">L'adresse est obligatoire.</div>
					</div>
				</div>
				<div class="row ml-5 mt-4">
					<div class="col-xl-4">
						<div class="float-sm-left">
							<label for="socialnumber">Numéro de sécurité sociale</label>
						</div>
					</div>
					<div class="col-xl-6">
						<input type="text" class="form-control" name="socialnumber" required>
						<div class="invalid-feedback">Le numéro de sécurité sociale
							est obligatoire.</div>
					</div>
				</div>
				<div class="row ml-5 mt-4">
					<div class="col-xl-10">
						<div class="float-sm-right">
							<button type="submit" class="btn btn-basic btn-send" id="create"
								onclick="creation()">Créer</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>

	<!-- fenêtre modale -->
	<!-- <div class="modal fade" id="adding" tabindex="-1" role="dialog"
		aria-labelledby="addingLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="addingLabel">Création d'un
						collaborateur</h5>
				</div>
				<div class="modal-body">
					<div class="row ml-1">Vous ètes sur le point de créer un
						nouveau collaborateur :</div>
					<div class="row mt-3">
						<div class="col-6">Nom :</div>
						<div class="col-6">xxxxxxxx</div>
					</div>
					<div class="row mt-2">
						<div class="col-6">Prénom :</div>
						<div class="col-6">xxxxxxxx</div>
					</div>
					<div class="row mt-2">
						<div class="col-6">Date de naissance :</div>
						<div class="col-6">xxxxxxxx</div>
					</div>
					<div class="row mt-2">
						<div class="col-6">Adresse :</div>
						<div class="col-6">xxxxxxxx</div>
					</div>
					<div class="row mt-2">
						<div class="col-6">Numéro de sécurité sociale :</div>
						<div class="col-6">xxxxxxxx</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-basic" data-dismiss="modal">Annuler</button>
					<button type="button" class="btn btn-basic">Confirmer</button>
				</div>
			</div>
		</div>
	</div> -->
</body>

<!-- scripts du validateur -->
<script>
	function creation() {
		//var form = document.querySelector('.needs-validation');
		document.forms[0].submit();
		/* form.addEventListener('submit', function(event) {
			event.preventDefault();
			if (form.checkValidity() === false) {
				location.search = "?errors";
			} else {
				$("#adding").modal();
			}
		});
		if (location.search === "?errors") {
			$('input').addClass('is-invalid');
			$('textarea').addClass('is-invalid');
		} */
	}
</script>

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