
function resultClient()
{
try{
fetch("http://localhost:8080/api/users").then(
	  res => {
	    res.json().then(
	      data => {
	        if (data.length > 0) {
	          var temp = "";
	          data.forEach((itemData) => {
	            temp += "<tr>";
	            temp += "<td>" + itemData.id + "</td>";
	            temp += "<td>" + itemData.nombre + "</td>";
	            temp += "<td>" + itemData.password + "</td>";
	            temp += "<td>" + itemData.edad + "</td>";
	          	temp += "<td>"+ `<a class="btn btn-success" href="http://localhost:8080/api/users/delete/${itemData.id}">Borrar</a>`+ "</td>";
	          	temp += "<td>"+ `<a href="http://localhost:8080/editUser/${itemData.id}">Editar</a>`+ "</td>";
	          });
	          document.getElementById('clientList').innerHTML = temp;
	        }
	      }
	    )
	  }
	)
}
catch(error){
	alert("No hay clientes");
}
	

}

window.onload = resultClient();