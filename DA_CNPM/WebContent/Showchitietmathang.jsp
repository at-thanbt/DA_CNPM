<%@page import="model.bean.mathang"%>
<%@page import="model.bean.Tindang"%>
<%@page import="model.bean.Vacxin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Rao bán chi tiết </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height:300px;
     background-color: #f1f1a1;
    }
    .row{
    height:450px;
    }
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;}
    }
    .navbar-inverse{
    width: 100%; 
    height: 80px;
    }
  </style>
</head>
<%


	ArrayList<mathang> arrTDD = new ArrayList<mathang>();
	arrTDD = (ArrayList<mathang>) request.getAttribute("arrTDD");
	
	
%>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">
         <img src="images/logo.png" class="img-rounded" alt="Cinque Terre" width="200" height="60">
      </a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
       <li><a href="#"><span class="glyphicon glyphicon-search"></span> Tìm rao vặt</a></li>
        <li><a href="#">Đăng tin miễn phí</a></li>
       
      </ul>
     <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Đăng ký</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="#">Trang cá nhân</a></p>
   
    </div>
    <div class="col-sm-8 text-left">
     <img src="images/dangtin.jpg" class="img-rounded" alt="Cinque Terre" width="100%" height="200px">
      <hr>
      <div class="onimages">
  <div class="col-sm-2">
  </div>
  <div class="col-sm-1">
  </div>
   <div class="col-sm-2">
 
   </div>
   <div class="col-sm-2">
   <div class="form-group">
         
       </div>
   </div>
   <div class="col-sm-2">
    <div class="form-group">
         
       </div>
   
   </div>
     
   <div class="col-sm-1">
  
   </div>
  
    </div>
     
    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
         <img src="images/logo.png" class="img-rounded" alt="Cinque Terre" width="100" height="60">
      </div>
      <div class="well">
        <img src="images/logo.png" class="img-rounded" alt="Cinque Terre" width="100" height="60">
      </div>
    </div>
  </div>
</div>
<div class="container-fluid">
    <div class="row">
    <div class="col-sm-2 sidenav">
    </div>
    <div class="col-sm-8 text-left">
            <div class="col-sm-12">
     <h3>Rao Bán mặt hàng <%= arrTDD.get(0).getTitle() %> <span class = "Success Label"></span></h3>
     <hr>
      <div id="home" class="tab-pane fade in active" align="center">
 
     <div class="col-sm-12">
   <div class="col-xs-7">
      <img src="images/<%= arrTDD.get(0).getPhoto()%>" class="img-rounded" alt="Cinque Terre" width="400" height="300">
    </div>
    <div class="col-xs-5" align="left" >
   <h3>Liên hệ với <%= arrTDD.get(0).getUsername() %> <span class = "Success Label"></span></h3><hr>
   <h4>Số điện thoại : <%= arrTDD.get(0).getPhone() %> <span class = "Success Label"></span></h4><hr>
   <h4>Email : <%= arrTDD.get(0).getEmail() %> <span class = "Success Label"></span></h4><hr>
   
    </div>
     <hr>
     </div>
    
    </div>
    </div>
    </div>
    <div class="col-sm-2 sidenav">
    </div>
    
    </div>
</div>
<div class="container-fluid">
    <div class="row">
    <div class="col-sm-2 sidenav">
    </div>
    <div class="col-sm-8 text-left">
            <div class="col-sm-12">
     <h3>Mặt hàng bán với giá : <%= arrTDD.get(0).getCost() %> VNĐ<span class = "Success Label"></span></h3>
     <hr>
      <h4> Loại : <%= arrTDD.get(0).getIdcategory() %> <span class = "Success Label"></span></h4>
      <hr>
     <h4> Địa chỉ : <%= arrTDD.get(0).getAddress()%> <span class = "Success Label"></span></h4>
     <hr>
     <h4> Nội dung : <%= arrTDD.get(0).getContent() %>  <span class = "Success Label"></span></h4>
      <div id="home" class="tab-pane fade in active" align="center">
 
     <div class="col-sm-12">
   <div class="col-xs-7">
    </div>
    <div class="col-xs-5" align="left" >
   
   
    </div>
     <hr>
     </div>
    
    </div>
    </div>
    </div>
    <div class="col-sm-2 sidenav">
    </div>
    
    </div>
</div>
<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</body>
</html>

