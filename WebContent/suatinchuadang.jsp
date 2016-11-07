<%@page import="model.bean.Tindang"%>
<%@page import="model.bean.Vacxin"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Trang chủ</title>
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
    height:500px;
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


	ArrayList<Tindang> arrTDD = new ArrayList<Tindang>();
	arrTDD = (ArrayList<Tindang>) request.getAttribute("arrTDD");
	
	
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
 
   </div>
   <div class="col-sm-2">
   
   
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
     <h3>chỉnh sửa mặt hàng <span class = "Success Label"></span></h3>
     <hr>
      <div id="home" class="tab-pane fade in active">
          <div class="row">
          <div class="col-sm-12">
           <div class="col-sm-3">
            <h4>Người đăng tin :</h4>
           </div>
           <div class="col-sm-3">
            <h4>Long</h4>
           </div>
           <div class="col-sm-3">
           </div>
           <div class="col-sm-3">
           </div>
           </div>
           <br>
           <div class="col-sm-12">
           <div class="col-sm-3">
            <h4>Nhu cầu :</h4>
           </div>
           <div class="col-sm-3">
           <div class="form-group">
         <select class="form-control" id="exampleSelect2">
         <option>Muốn bán</option>
         <option>Muốn mua</option>
        </select>
       </div>
           </div>
           <div class="col-sm-3">
           </div>
           <div class="col-sm-3">
           </div>
           </div>
            <div class="col-sm-12">
           <div class="col-sm-3">
            <h4>Tiêu đề rao :</h4>
           </div>
           <div class="col-sm-3">
            <input class="form-control" placeholder="Điện thoại, xe máy,..." id="inputdefault" type="text">
           </div>
           <div class="col-sm-3">
           </div>
           <div class="col-sm-3">
           </div>
           </div>
             <div class="col-sm-12">
           <div class="col-sm-3">
            <h4>Nội dung :</h4>
           </div>
           <div class="col-sm-3">
            <textarea class="form-control" rows="5" id="comment"></textarea>
           </div>
           <div class="col-sm-3">
           </div>
           <div class="col-sm-3">
           </div>
           </div>
            <div class="col-sm-12">
           <div class="col-sm-3">
            <h4>Địa chỉ :</h4>
           </div>
           <div class="col-sm-3">
              <div class="form-group">
         <select class="form-control" id="exampleSelect2">
         <option>Quận Hải Châu</option>
         <option>Quận Thanh Khê</option>
          <option>Quận Sơn Trà</option>
           <option>Quận Ngũ Hành Sơn</option>
            <option>QuậnLiên Chiểu</option>
            <option>Quận Cẩm Lệ</option>
        </select>
       </div>
           </div>
           <div class="col-sm-3">
           </div>
           <div class="col-sm-3">
           </div>
           </div>
            <div class="col-sm-12">
           <div class="col-sm-3">
            <h4>Giá :</h4>
           </div>
           <div class="col-sm-3">
            <input class="form-control" placeholder="Giá VND" id="inputdefault" type="text">
           </div>
           <div class="col-sm-3">
           </div>
           <div class="col-sm-3">
           </div>
           </div>
            <div class="col-sm-12">
           <div class="col-sm-3">
            <h4>Hình ảnh :</h4>
           </div>
           <div class="col-sm-3">
            <input type="file" name="fileToUpload" id="fileToUpload">
           </div>
           <div class="col-sm-3">
           
           </div>
           <div class="col-sm-3">
            
           </div>
           </div>
              <div class="col-sm-12">
           <div class="col-sm-3">
          
           </div>
           <div class="col-sm-3">
            <a href="#" role="button" type="submit" class="btn btn-primary active navb-right">Lưu</a>
           
           </div>
           <div class="col-sm-3">
           </div>
           <div class="col-sm-3">
           </div>
           
           </div>
            <hr>
           <br>
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

