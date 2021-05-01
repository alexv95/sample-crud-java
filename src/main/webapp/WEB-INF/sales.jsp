<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
      <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<script src="js/sales.js" ></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">Usuario</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/product">Productos</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/sale">Ventas</a>
      </li>

    </ul>

  </div>
</nav>

   <section id="register-form" class="container" >
        <form class="text-center border border-light p-5 col-lg-6" action="/api/sales/create" method="POST" >
                  <p class="h4 mb-4">Registrar venta</p>
                  <div class="form-row mb-4">
                    <div class="col">
                      <input type="text" id="name" name="name" class="form-control mb-4" placeholder="sales description " required>
                    </div>
                    <div class="col">
                      <input type="number" id="password" name="password" class="form-control mb-4" placeholder="user id" required>
                    </div>
                  </div>
                  <input type="number" id="age" name="age" class="form-control mb-4" placeholder="monto de venta" min="1" max="149" required>
                  <button class="btn btn-info my-4 btn-block waves-effect waves-light" type="submit">Registrar usuario</button>
        </form>  
            <div class="container col-lg-6">
		         <h1>Listado de ventas</h1>
		        <table class="table table-secondary table-borderless ">
		            <thead>
		                <tr>
		                <th scope="col">Número de venta</th>
		                <th scope="col">descripcion</th>
		                <th scope="col">Id del cliente</th>
		                <th scope="col">Monto de venta</th>
		                <th scope="col">Acciones</th>
		                <th scope="col"></th>
		                </tr>
		            </thead>
		            <tbody id="clientList">

		            </tbody>
		            </table>
		            
		           
		    </div>
     </section>
</body>
</html>