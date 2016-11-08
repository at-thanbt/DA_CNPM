<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng ký</title>
<style type="text/css">
.tt tr td {
	padding-top: 10px;
	padding: 10px 10px;
	font-size: 16pt;
	width: 20 0px;
}

.sub {
	margin-top: 20px;
	margin-bottom: 20px;
	width: 100px;
	font-size: 14pt;
	background-color: green;
	color: white;
	float: left;
	height: 35px;
}

.tt{
	padding-right: 500px;
}

.text {
	font-size: 14pt;
}

.loi {
	color: red;
}
h4 {
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
<body>
			<%String thongbao=(String)request.getAttribute("Thongbao");%>
<div id="main">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="head-link">
				<ul>
					<li><a href="ShowTrangChu?">Trang chủ</a></li>
					<li><a href="dangnhap.jsp?">>Đăng nhập và đăng ký</a></li>
					<li><a href="dangky.jsp?">>Đăng ký</a></li>
					
				</ul>
			</div>
		<div class="content" align="center">
           <h1>Đăng Ký</h1>
           			  <%
						if("0".equals(request.getParameter("msg"))){
					  		  out.print("<p style='color:red; font=weight: bold '>   Username không được chứa kí tự đặc biệt. </p>");
					  	  	}
				    	if("1".equals(request.getParameter("msg"))){
					  		  out.print("<p style='color:red; font=weight: bold '>   Username của bạn đã trùng với tài khoản khác. </p>");
					  	  	}
		           		if("2".equals(request.getParameter("msg"))){
					  		  out.print("<p style='color:green; font=weight: bold '> Đăng ký thành công</p>");
					  	  	}
					  	
		           		if("3".equals(request.getParameter("msg"))){
					  		  out.print("<p style='color:red; font=weight: bold '> Đăng ký thất bại</p>");
					  	  	}
				  		%>
             <form action="<%=request.getContextPath()%>/CheckDangKy" method="post">
				 Username:<br> <input name = "username" type = "text" ><br><br>
			     Email: <br><input name = "email" type = "text" ><br><br>
				 Mat khau:<br> <input name = "password" type = "password" ><br><br>
				PhoneNumber:<br> <input name = "phonenumber" type = "text" ><br><br>
			 	<br>
			  <div>
				<span><input type="reset" value="Nhập lại"
				style="margin-top: 15px;"></span> <span><input
				type="submit" value="Đăng ký" name="submit"
				style="margin-right: 30px; margin-top: 15px;"></span>

			  </div>
			</form>
</body>
</html>