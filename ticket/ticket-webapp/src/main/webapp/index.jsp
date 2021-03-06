<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application Ticket</title>
<link rel="stylesheet"
  href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
  integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
  crossorigin="anonymous">
<script
  src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
  integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
  crossorigin="anonymous"></script>

<style type="text/css">
html, body {
  width: 100%;
  height: 100%;
}
#bloc
{
  text-align: center;
   display: flex;
  justify-content: space-around;
  margin-top: 30px;
}

.card
{
  border-radius: 25px;
}
.cadre
{
  text-align: center;
}
</style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" id="nav">
  <a class="navbar-brand" href="#">Ticket</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Test <span class="sr-only">(current)</span></a>
      </li>
      </li>
    </ul>
  </div>
</nav>

<div class="col-lg-12 col-md-12 col-sm-12" id="bloc">
  <div class="card text-white bg-dark" style="max-width: 100%; "
      class="card">
      <div class="card-header" id="top">Projet</div>
      <div class="card-body" id="cadre">
        <p>Projet : <a href="http://localhost:8080/ticket_webapp/ticket-ws/projets/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/projets/count">Nombre</a></p>
        <p>Version : <a href="http://localhost:8080/ticket_webapp/ticket-ws/version/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/version/count">Nombre</a></p>
      </div>
    
    </div>

  <div class="card text-white bg-dark mb-3" style="max-width: 100%; "
      class="card">
      <div class="card-header" class="top">Ticket</div>
      <div class="card-body" class="cadre">
         <p>Ticket : <a href="http://localhost:8080/ticket_webapp/ticket-ws/tickets/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/tickets/count">Nombre</a></p>
        <p>Statut : <a href="http://localhost:8080/ticket_webapp/ticket-ws/ticketStatut/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/ticketStatut/count">Nombre</a></p>
         <p>Commentaire : <a href="http://localhost:8080/ticket_webapp/ticket-ws/ticket-ws/commentaire/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/commentaire/count">Nombre</a></p>
        <p>Bug : <a href="http://localhost:8080/ticket_webapp/ticket-ws/bug/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/bug/count">Nombre</a></p>
         <p>BugNiveau : <a href="http://localhost:8080/ticket_webapp/ticket-ws/niveauBug/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/niveauBug/count">Nombre</a></p>
        <p>Evolution : <a href="http://localhost:8080/ticket_webapp/ticket-ws/evolution/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/evolution/count">Nombre</a></p>
         <p>HistoriqueStatus : <a href="http://localhost:8080/ticket_webapp/ticket-ws/historiqueStatut/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/historiqueStatut/count">Nombre</a></p>
      </div>
    
    </div>

  <div class="card text-white bg-dark mb-3" style="max-width: 100%;" id="card" >
      <div class="card-header" class="top">Utilisateur</div>
      <div class="card-body" class="cadre">
    <p>Utilisateur : <a href="http://localhost:8080/ticket_webapp/ticket-ws/utilisateurs/list">Liste</a> - <a href="http://localhost:8080/ticket_webapp/ticket-ws/utilisateurs/count">Nombre</a></p>
      </div>
    </div>
</div>
</body>
</html></body>
</html>