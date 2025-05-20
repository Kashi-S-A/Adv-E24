<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<h1>Register Here,</h1>

		<form action="register" method="post">
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Name</label>
				<input type="text" name="name" class="form-control"
					id="exampleFormControlInput1" placeholder="ex: Allen" required>
			</div>
			
			<div class="mb-3">
				<label for="exampleFormControlInput2" class="form-label">Email</label>
				<input type="email" name="email" class="form-control"
					id="exampleFormControlInput2" placeholder="ex: allen@gmail.com" required>
			</div>
			
			<div class="mb-3">
				<label for="exampleFormControlInput3" class="form-label">Phone</label>
				<input type="number" name="phone" class="form-control"
					id="exampleFormControlInput3" placeholder="ex: 1234567890" required>
			</div>
			
			<div class="mb-3">
				<label for="exampleFormControlInput4" class="form-label">Password</label>
				<input type="password" name="password" class="form-control"
					id="exampleFormControlInput4" placeholder="ex: Allen@123" required>
			</div>

			<button type="submit" class="btn btn-primary">Register</button>
		</form>
		
		<a href="login">Already Registered ?</a>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
		crossorigin="anonymous"></script>
</body>
</html>