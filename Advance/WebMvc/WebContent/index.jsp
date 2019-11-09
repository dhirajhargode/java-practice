<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<link rel="bootstrap" href="" />
<script src=""></script>
<title>Insert title here</title>
</head>
<body>

	<form action="validate.jsp" method="post">
		<table class="ui-responsive" align="center">
			<thead>
				<tr>
					<th colspan="2" align="center"><h2 id="heading-1"
							class="ui-bar ui-bar-b ui-corner-all">Login Page</h2></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<div class="ui-field-contain">
						<td><label><b>Usename :</b></label></td>
						<td><input type="text" data-clear-btn="true" name="username"
							autofocus="true" required="true" /></td>
					</div>
				</tr>

				<tr>
					<div >
						<td><label><b>Password :</b></label></td>
						<td><input type="password" name="password" required="true" /></td>
					</div>
				</tr>

				<tr>
					<td colspan="2">
						<div>
							<input type="submit" value="login" />
						</div>
					</td>

				</tr>


			</tbody>
		</table>
	</form>

</body>
</html>