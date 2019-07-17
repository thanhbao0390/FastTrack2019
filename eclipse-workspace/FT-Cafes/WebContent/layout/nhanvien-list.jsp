<%@ page import="java.io.*"%>
<%@ page import="java.util.List"%>
<%@ page import="ft.edu.vn.cafes.entity.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>

	<h1>Page List Nhan Vien</h1>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">MaNV</th>
				<th scope="col">MaBP</th>
				<th scope="col">Hoten</th>
				<th scope="col">Diachi</th>
				<th scope="col">Dienthoai</th>
				<th scope="col">Masothue</th>
				<th scope="col">IsKetoan</th>
				<th scope="col">IsThungan</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<NhanVien> list = (List<NhanVien>) request.getAttribute("list");
				for (NhanVien e : list) {
			%>
			<tr>
				<th scope="row">1</th>
				<td><%= e.getMaNV() %></td>
				<td><%= e.getMaBP() %></td>
				<td><%= e.getHoten() == null ? "" : e.getHoten() %></td>
				<td><%= e.getDiachi() == null ? "" : e.getDiachi() %></td>
				<td><%= e.getDienthoai() == null ? "" : e.getDienthoai() %></td>
				<td><%= e.getMasothue() == null ? "" : e.getMasothue() %></td>
				<td><%= e.isKetoan() %></td>
				<td><%= e.isThungan() %></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>