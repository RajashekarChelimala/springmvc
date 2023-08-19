<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Contact Page</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-6 offset-3">
				<div class="text-center">
					<h3>${Header}</h3>
					<p>${Desc }</p>	
				</div>
				<form action="processForm" method="post">
					<div class="mb-3">
						<label for="InputEmail" class="form-label">Email address</label> <input
							type="email" class="form-control" id="InputEmail" name="email"
							aria-describedby="emailHelp" placeholder="Enter Email">
					</div>
					<div class="mb-3">
						<label for="InputUserName" class="form-label">User name</label> <input
							type="text" class="form-control" id="InputUserName" name="userName"
							aria-describedby="nameHelp" placeholder="Enter Name">
					</div>
					<div class="mb-3">
						<label for="InputPassword" class="form-label">Password</label> <input
							type="password" class="form-control" id="InputPassword" name="password"
							placeholder="Enter Password">
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
			</div>

		</div>
	</div>
</body>
</html>