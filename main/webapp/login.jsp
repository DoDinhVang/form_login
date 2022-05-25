<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="./assets/css/login.css">
</head>
<body>
	<div class="overlay"></div>
	<section class="form-container">
		<h2 class="heading-section text-center mb-3">Đăng nhập</h2>
		<div>
			<form class="login-form" action = "" method = "post">
				<div class="form-group mb-3">
					<input name="email" class="form-control" placeholder="Email">
				</div>
				<div class="form-group mb-3">
					<input name="password" class="form-control" placeholder="Password">
				</div>
				<div class="form-group mb-3">
					<button type="submit"
						class="form-control btn btn-primary submit px-3">Đăng
						nhập</button>
				</div>
				<div class="form-group mb-3 text-end">
					<label class="checkbox-wrap checkbox-primary"><input
						type="checkbox" name = "checkbox"> <span class="checkmark"></span>
						Lưu tài khoản
					</label>
				</div>
			</form>
		</div>
		</div>
	</section>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>