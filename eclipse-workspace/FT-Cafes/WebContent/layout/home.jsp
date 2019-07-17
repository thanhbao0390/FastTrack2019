<%@ page import="java.io.*"%>
<%@ page import="java.util.List"%>
<%@ page import="ft.edu.vn.cafes.entity.*"%>

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
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.css">
<link rel="stylesheet" type="text/css" href="assets/css/home.css">

<title>Cafes</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><button type="button" class="btn btn-outline-primary navbar-parent" target_tag="tag_hethong">Hệ Thống</button>
				</li>
				<li class="nav-item"><button type="button" class="btn btn-outline-primary navbar-parent" target_tag="tag_thungan">Thu Ngân</button>
				</li>
				<li class="nav-item"><button type="button" class="btn btn-outline-primary navbar-parent" target_tag="tag_cuahang">Cửa Hàng</button></li>
			</ul>
		</div>
	</nav>

	<div>
		<ul id="tag_hethong"  class="navbar-chilrd">
			<li class="btn btn-outline-primary" href="danhmuc"><img src="assets/image/database-settings-icon.png"/>Danh mục</li>
			<li class="btn btn-outline-primary" href="tuychon"><img src="assets/image/options-icon.png"/> Tùy chọn</li>
			<li class="btn btn-outline-primary" href="sanpham"><img src="assets/image/product-icon.png"/>Sản phẩm</li>
			<li class="btn btn-outline-primary" href="khachhang"><img src="assets/image/User-Executive-Green-icon.png"/>Khách hàng</li>
			<li class="btn btn-outline-primary" href="nhanvien"><img src="assets/image/User-Group-icon.png"/>Nhân viên</li>
			<li class="btn btn-outline-primary" href="matkhau"><img src="assets/image/App-password-icon.png"/>Mật khẩu</li>
			<li class="btn btn-outline-primary" href="lienhe"><img src="assets/image/Phone-icon.png"/>Liên hệ</li>
			<li class="btn btn-outline-primary" href="ketthuc"><img src="assets/image/Apps-session-logout-icon.png"/>Kết thúc</li>
		</ul>
		<ul id="tag_thungan"  class="navbar-chilrd">
			<li class="btn btn-outline-primary" href="mauin"><img src="assets/image/invoice-icon.png"/>Mẫu in</li>
			<li class="btn btn-outline-primary" href="mayin"><img src="assets/image/print-icon.png"/>Máy in</li>
			<li class="btn btn-outline-primary" href="sodo"><img src="assets/image/diagram-icon.png"/>Sơ đồ</li>
			<li class="btn btn-outline-primary" href="datban"><img src="assets/image/Apps-preferences-system-time-icon.png"/>Đặt bàn</li>
			<li class="btn btn-outline-primary" href="hoadon"><img src="assets/image/payment-icon.png"/>Hóa đơn</li>
			<li class="btn btn-outline-primary" href="doanhthu"><img src="assets/image/US-dollar-icon.png"/>Doanh thu</li>
			<li class="btn btn-outline-primary" href="thuchi"><img src="assets/image/cash-icon.png"/>Thu chi</li>
			<li class="btn btn-outline-primary" href="phieuthu"><img src="assets/image/box-in-icon.png"/>Phiếu thu</li>
			<li class="btn btn-outline-primary" href="phieuchi"><img src="assets/image/box-out-icon.png"/>Phiếu chi</li>
		</ul>
		<ul id="tag_cuahang"  class="navbar-chilrd">
			<li class="btn btn-outline-primary" href="chungtu"><img src="assets/image/book-bookmark-icon.png"/>Chứng từ</li>
			<li class="btn btn-outline-primary" href="soquy"><img src="assets/image/Books-icon.png"/>Sổ quỹ</li>
			<li class="btn btn-outline-primary" href="tinhtoan"><img src="assets/image/calculate-icon.png"/>Tính toán</li>
			<li class="btn btn-outline-primary" href="candoikho"><img src="assets/image/Healthcare-Scales-Of-Balance-Filled-icon.png"/>Cân đối kho</li>
			<li class="btn btn-outline-primary" href="hieuqua"><img src="assets/image/Election-Result-icon.png"/>Hiểu quả</li>
			<li class="btn btn-outline-primary" href="baotri"><img src="assets/image/maintenance-icon.png"/>Bảo trì</li>
			<li class="btn btn-outline-primary" href="giainen"><img src="assets/image/Folders-OS-Exit-Full-Screen-Metro-icon.png"/>Giải nén</button>
		</ul>
	</div>
	
	<div id="contents"></div>


	<div></div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="assets/js/jquery-3.4.1.js"></script>
	<!-- <script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script> -->
	<script src="assets/js/home.js"></script>
</body>
</html>