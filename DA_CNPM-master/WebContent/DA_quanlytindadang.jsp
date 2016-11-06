<%@page import="model.bean.Tindang"%>
<%@page import="model.bean.Vacxin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Tin đã đăng</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
.tt tr td {
	padding-top: 10px;
	padding: 10px 10px;
	font-size: 16pt;
}

.sub {
	margin-top: 20px;
	margin-bottom: 20px;
	width: 150px;
	font-size: 14pt;
	background-color: green;
	color: white;
	height: 35px;
}

.text {
	font-size: 14pt;
}

.loi {
	color: red;
}

.content {
	padding-top: 10px;
	padding-bottom: 20px;
	background-image: url(images/default.png);
	width: 100%;
}

#main {
	padding-left: 5%;
}
</style>
</head>
<%


	ArrayList<Tindang> arrTDD = new ArrayList<Tindang>();
	arrTDD = (ArrayList<Tindang>) request.getAttribute("arrTDD");
	
	
%>
<body>
	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="head-link" align="center">
				<ul>
					<li><a href="ShowTrangChu?">Trang chủ</a></li>
					<li><a href="DA_showtrangcanhan?">>Trang cá nhân</a></li>
					<li><a href="DA_showquanlytindadang?">>Quản lý tin đã đăng</a></li>
					
				</ul>
		</div> 
		
		<div class="content" align="center">
			<h2>Quản lí tin đã đăng</h2>
			<form action="" method="post">
				
				<table class="table">
				<thead>
				
      <tr>
        <th>Người đăng</th>
        <th>Nhu cầu</th>
        <th>Tiêu đề</th>
        <th>Nội dung</th>
        <th>Địa chỉ</th>
        <th>Giá</th>
        <th>Ảnh</th>
      </tr>
    </thead>

						
					<%
						for (int i = 0; i < arrTDD.size(); i++) {
					%>
					 <tbody>
                     <tr class="success">
				<% 
				String nhucau="Bán";
				if(!arrTDD.get(i).isSalebuy())
					nhucau="mua";
				%>
						<th align="center"><%=arrTDD.get(i).getUsername()%></th>
						<th align="center">Muốn <%= nhucau %></th>
						<th align="center"><%=arrTDD.get(i).getTitle()%></th>
						<th align="center"><%=arrTDD.get(i).getContent()%></th>
						<th align="center"><%=arrTDD.get(i).getAddress()%></th>
						<th align="center"><%=arrTDD.get(i).getCost()%></th>
						
						<th align="center"> <img src="images/<%= arrTDD.get(i).getLinkImage() %>" class="img-rounded" alt="Cinque Terre" width="100" height="100"></th>
                     <th ><a href="DA_duyettin?ID=<%=arrTDD.get(i).getId()%>&key=1" role="button" class="btn btn-success btn-large"> Lưu </a>
                      <a href="DA_xoatin?ID=<%=arrTDD.get(i).getId()%>&key=1" role="button" class="btn btn-danger">Xóa</a></th>
					</tr>
					<%
						}
					%>
					
				
				</table>
			
			</form>
		</div>
		<jsp:include page="footter.jsp"></jsp:include>
	</div>
</body>
</html>