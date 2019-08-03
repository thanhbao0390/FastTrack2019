<%@ page import="java.io.*"%>
<%@ page import="java.util.List"%>
<%@ page import="ft.edu.vn.cafes.entity.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">


<body>


	<div id="sodo">
		<div class="card">
			<div class="container">

				<div class="row">
					<div class="col-12">
						<h1>Page Sodo</h1>
						<div class="row justify-content-md-center">
							<div class="col-8">
								<div>
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#sodo_modalAdd">Thêm mới</button>
									<button></button>
									<button></button>
								</div>
								<table id="dtSodo" class="table table-striped table-bordered"
									cellspacing="0" width="100%">
									<thead>
										<tr>
											<th class="th-sm">Số bàn</th>
											<th class="th-sm">Mã Khu Vực</th>
											<th class="th-sm">Mã Bảng Giá</th>
											<th class="th-sm"></th>
										</tr>
									</thead>
									<tbody>
										<%
											List<BanPhong> list = (List<BanPhong>) request.getAttribute("list");
											for (BanPhong e : list) {
										%>
										<tr>
											<td><%=e.getSoban() == null ? "" : e.getSoban()%></td>
											<td><%=e.getMaKV() == null ? "" : e.getMaKV()%></td>
											<td><%=e.getMaBG() == null ? "" : e.getMaBG()%></td>
											<td><a href="sodo/edit">Edit</a>&nbsp&nbsp&nbsp&nbsp
												<a href="sodo/delete">Delete</a></td>
										</tr>
										<%
											}
										%>
									</tbody>

								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="sodo_modalAdd" class="modal fade" tabindex="-1" role="dialog">
			<form action="sodo/add">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">Add new</h4>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<table>
								<tr>
									<td>Số bàn</td>
									<td><input name="soban" type="text"></td>
								</tr>
								<tr>
									<td>Mã Khu Vực</td>
									<td><select name="khuvuc">
											<%
												List<KhuVuc> kvs = (List<KhuVuc>) request.getAttribute("khuvucs");
												for (KhuVuc e : kvs) {
											%>
											<option value="<%=e.getMaKV() == null ? "" : e.getMaKV()%>"><%=e.getTenKV() == null ? "" : e.getTenKV()%></option>
											<%
												}
											%>
									</select></td>
								</tr>
								<tr>
									<td>Mã Bảng Giá</td>
									<td><select name="loaibanggia">
											<%
												List<LoaiBangGia> loaibanggias = (List<LoaiBangGia>) request.getAttribute("loaibanggias");
												for (LoaiBangGia e : loaibanggias) {
											%>
											<option value="<%=e.getMaBG() == null ? "" : e.getMaBG()%>"><%=e.getTenBG() == null ? "" : e.getTenBG()%></option>
											<%
												}
											%>
									</select></td>
								</tr>
							</table>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button id="sodo_btnAdd" type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</form>
		</div>
		<!-- /.modal -->




	</div>


	<script src="assets/js/sodo.js"></script>
</body>

</html>