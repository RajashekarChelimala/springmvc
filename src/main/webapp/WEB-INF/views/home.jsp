<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="card mx-auto mt-5 bg-primary" style="width:50%">
				<div class="card-body py-5">
					<h3 class="text-center text-white" style="text-transform:uppercase">Search</h3>
					<form action="search" class="mt-3">
						<div class="form-group">
							<input type="text" name="query" placeholder="Enter your Keyword" class="form-control" />
						</div>
						<div class="container text-center">
							<button class="btn btn-outline-light mt-4">Search</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	
</body>
</html>