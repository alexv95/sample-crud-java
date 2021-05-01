function resultClient()
{
try{
fetch("http://localhost:8080/api/products").then(
	  res => {
	    res.json().then(
	      data => {
	        if (data.length > 0) {
	          var temp = "";
	          data.forEach((itemData) => {
	            temp += "<tr>";
	            temp += "<td>" + itemData.id + "</td>";
	            temp += "<td>" + itemData.nombre + "</td>";
	            temp += "<td>" + itemData.descripcion + "</td>";
	            temp += "<td>" + itemData.precio + "</td>";
	          	temp += "<td>"+ `<a class="btn btn-success" href="http://localhost:8080/api/product/delete/${itemData.id}">Borrar</a>`+ "</td>";
	          	temp += "<td>"+ `<a href="http://localhost:8080//api/product/edit/${itemData.id}">Editar</a>`+ "</td>";
	          });
	          document.getElementById('clientList').innerHTML = temp;
	        }
	      }
	    )
	  }
	)
}
catch(error){
	alert("No hay productos");
}
	

}

window.onload = resultClient();