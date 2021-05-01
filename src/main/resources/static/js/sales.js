function resultClient()
{
try{
fetch("http://localhost:8080/api/sales").then(
	  res => {
	    res.json().then(
	      data => {
	        if (data.length > 0) {
	          var temp = "";
	          data.forEach((itemData) => {
	            temp += "<tr>";
	            temp += "<td>" + itemData.nSale + "</td>";
	            temp += "<td>" + itemData.descripcion + "</td>";
	            temp += "<td>" + itemData.userId + "</td>";
	            temp += "<td>" + itemData.total + "</td>";
	          	temp += "<td>"+ `<a class="btn btn-success" href="http://localhost:8080/api/sales/delete/${itemData.nSale}">Borrar</a>`+ "</td>";
	          	temp += "<td>"+ `<a href="http://localhost:8080//api/sales/edit/${itemData.nSale}">Editar</a>`+ "</td>";
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