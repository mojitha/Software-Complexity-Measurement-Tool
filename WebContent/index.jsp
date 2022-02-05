<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
	<link rel="stylesheet" href="./css/style.css">
	
    <title>Home</title>
  </head>
  <body>
    
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	  </button>

	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<a class="navbar-brand" href="#">CDE IT Solutions</a>
		</ul>
		
		<div class="my-2 my-lg-0">
		  <ul class="navbar-nav mr-auto">
			  <li class="nav-item active">
				<a class="nav-link" href="#">Home</a>
			  </li>
			  <div>

			  </div>
			  <li class="nav-item">
			</ul>
		</div>
	  </div>
	</nav>
	
	<div class="container">
	<h1>Home</h1>
	
		<div class="card" style="height: 80vh;">
		  <div class="card-body">
			<form action="SaveSourceCodeServlet" class="dropzone inputfile" id="my-awesome-dropzone" method="POST" enctype="multipart/form-data">
				<small class="card-title" style="position: absolute; top: 20%; left: 45%;">Drop code here</small>
				<input id="my-awesome-dropzone-file" type="file" name="sourcecode" class="btn btn-light" style="height: 30vh; width: 100%;" size="50" />
				<div class="dropdown">
			  		<select class="custom-select" id="languageSelect" style="width: 15vw;" required>
						<option selected value="0">Choose language</option>
						<option value="1">JAVA</option>
						<option value="2">C++</option>
					</select>
				</div>
				
				 <input type="submit" id="uploadCodeBtn" class="btn btn-sm btn-outline-dark mt-2" style="display:inline-block; width:15vw;" value="Upload" />
			</form>
			
			<form method="POST" action="SetWeightsServlet">
			<!-- WEIGHT MODALS (start) -->
			<!-- Button trigger modal -->
			<button type="button" class="btn btn-sm btn-outline-dark mt-2 float-right" data-toggle="modal" data-target="#staticBackdrop">
			  Customize Weight
			</button>
			<div class="clearfix"></div>
			
			<!-- Modal -->
			<div class="modal fade" id="staticBackdrop" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
			  <div class="modal-dialog" role="document">
				<div class="modal-content">
				  <div class="modal-header">
					<h5 class="modal-title" id="staticBackdropLabel">Set Weights</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					  <span aria-hidden="true">&times;</span>
					</button>
				  </div>
				  <div class="modal-body">
				  	<small>Size Factor</small>
					<table class="table table-sm">
					  <thead>
						<tr>
						  <th scope="col">Program Component</th>
						  <th scope="col">Weight</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td scope="row">Keyword</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="sizeKW" name="sizeKW" data-toggle="sizeKW" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Identifier</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="sizeID" name="sizeID" data-toggle="sizeID" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Operator</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="sizeOP" name="sizeOP" data-toggle="sizeOP" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Numerical value</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="sizeNV" name="sizeNV" data-toggle="sizeNV" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">String literal</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="sizeSL" name="sizeSL" data-toggle="sizeSL" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
					  </tbody>
					</table>
					
					<small>Variable Factor</small>
					<table class="table table-sm">
					  <thead>
						<tr>
						  <th scope="col">Program Component</th>
						  <th scope="col">Weight</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td scope="row">Global variable</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="variableGV" name="variableGV" data-toggle="variableGV" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Local variable</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="variableLV" name="variableLV" data-toggle="variableLV" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Primitive data type variable</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="variablePTV" name="variablePTV" data-toggle="variablePTV" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Composite data type variable</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="variableCTV" name="variableCTV" data-toggle="variableCTV" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
					  </tbody>
					</table>
					
					<small>Method Factor</small>
					<table class="table table-sm">
					  <thead>
						<tr>
						  <th scope="col">Program Component</th>
						  <th scope="col">Weight</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td scope="row">Method with a primitive return type</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="methodPRT" name="methodPRT" data-toggle="methodPRT" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Method with a composite return type</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="methodCRT" name="methodCRT" data-toggle="methodCRT" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Method with a void return type</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="methodVRT" name="methodVRT" data-toggle="methodVRT" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Primitive data type parameter</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="methodPDTP" name="methodPDTP" data-toggle="methodPDTP" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Composite data type parameter</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="methodCDTP" name="methodCDTP" data-toggle="methodCDTP" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
					  </tbody>
					</table>
					
					<small>Inheritance Factor</small>
					<table class="table table-sm">
					  <thead>
						<tr>
						  <th scope="col">Program Component</th>
						  <th scope="col">Weight</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td scope="row">Class with no inheritance</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="inheritanceNI" name="inheritanceNI" data-toggle="inheritanceNI" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">First level inheritance</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="inheritanceFLI" name="inheritanceFLI" data-toggle="inheritanceFLI" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Second level inheritance</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="inheritanceSLI" name="inheritanceSLI" data-toggle="inheritanceSLI" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Third level inheritance</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="inheritanceTLI" name="inheritanceTLI" data-toggle="inheritanceTLI" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">Other level inheritance</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="inheritanceOLI" name="inheritanceOLI" data-toggle="inheritanceOLI" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
					  </tbody>
					</table>
					
					<small>Control Structures Factor</small>
					<table class="table table-sm">
					  <thead>
						<tr>
						  <th scope="col">Program Component</th>
						  <th scope="col">Weight</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <td scope="row">'if' or 'else-if' condition</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="controlStructuresIF" name="controlStructuresIF" data-toggle="controlStructuresIF" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">'for','while' or 'do-while' loop</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="controlStructuresLOOP" name="controlStructuresLOOP" data-toggle="controlStructuresLOOP" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">'switch' of 'switch-case' control structure</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="controlStructuresSCH" name="controlStructuresSCH" data-toggle="controlStructuresSCH" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <td scope="row">'case' statement of 'switch-case' control structure</td>
						  <td>
							<select class="form-control form-control-sm wSelect" id="controlStructuresCASE" name="controlStructuresCASE" data-toggle="controlStructuresCASE" title="Changes" data-content="changes saved">
								<option>0</option>
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
					  </tbody>
					</table>
					
				  <div class="modal-footer">
					<button type="button" class="btn btn-sm btn-danger" data-dismiss="modal">close</button>
					<button type="submit" class="btn btn-sm btn-success">OK</button>
				  </div>
				</div>
			   </div>
			  </div>
			</div>			
			<!-- WEIGHT MODALS (end) -->			
		  	</form>
		  </div>
		</div>
	</div>
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.0.min.js" integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=" crossorigin="anonymous"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.7.0/dropzone-amd-module.js" integrity="sha256-AMRpKEj1J26PHZHs6p+Ds+BEluRn7wz2FfArNF5a138=" crossorigin="anonymous"></script> -->
  	
  	<!-- My script #1 -->
  	<script type="text/javascript" src="./js/checkUploadValidity.js"></script>
  	
  	<!-- My script #2 -->
  	<script type="text/javascript" src="./js/setWeights.js"></script>
  </body>
</html>