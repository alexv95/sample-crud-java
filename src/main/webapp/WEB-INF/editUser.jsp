<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

<body>
   <section id="register-form" class="container" >
        <form class="text-center border border-light p-5 col-lg-6" action="/api/users/edit" method="POST" >
                  <p class="h4 mb-4">Editar usuario</p>
                  <div class="form-row mb-4">
                    <div class="col">
                      <input type="text" id="id" name="id" class="form-control mb-4" placeholder="editar por id"  readonly>
                    </div>
                    <div class="col">
                      <input type="text" id="name" name="name" class="form-control mb-4" placeholder="Nombre" required>
                    </div>
                    <div class="col">
                      <input type="password" id="password" name="password" class="form-control mb-4" placeholder="password" required>
                    </div>
                  </div>
                  <input type="number" id="age" name="age" class="form-control mb-4" placeholder="E-mail" required>
                  <button class="btn btn-info my-4 btn-block waves-effect waves-light" type="submit">Editar usuario</button>
        </form>  

     </section>

</body>
</html>