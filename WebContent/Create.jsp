<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Create with prepared statements</h2>
<form class="form-group" action="CreateServlet" method="post">
	
	<p>
	<label for="txtIdEmployee"> Id Employee</label>
	<input class="form-control" type="text" id="txtIdEmployee" name="txtIdEmployee" disabled placeholder="ID Product Generated Automatically">
	</p>
	
	<p>
	<label for="txtNameEmployee"> Name Employee</label>
	<input class="form-control" type="text" id="txtNameEmployee" name="txtNameEmployee">
	</p>
	
	<p>
	<label for="txtAgeEmployee"> Age Employee</label>
	<input class="form-control-range" type="range" id="txtAgeEmployee" name="txtAgeEmployee" min="18" max="65" step="1">
	</p>
	
	<p>
	<label for="txtAddressEmployee"> Address Employee</label>
	<input class="form-control" type="text" id="txtAddressEmployee" name="txtAddressEmployee">
	</p>
	
	<p>
	<label for="txtSalaryEmployee"> Salary Employee</label>
	<input class="form-control" type="text" id="txtSalaryEmployee" name="txtSalaryEmployee">
	</p>
	
	<p>
	<label for="txtDepartmentEmployee"> Department Employee</label>
	<input class="form-control" type="text" id="txtDepartmentEmployee" name="txtDepartmentEmployee">
	</p>
	

	<input class="btn btn-primary" type="submit" value="Create Employee">
</form>

<a class="btn btn-info" href="index.jsp">Back</a>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script type="text/javascript" src="js/script.js"></script>
</body>
</html>