<!DOCTYPE html>
<html lang="en">
<head>
  <title>Ur Wardrobe</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="resources/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="resources/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">


</head>
 <style>
  body{
  background:white;
  }
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      height: auto;
  }
    
h2{
font-family: Arial, Helvetica, sans-serif;
font-style: normal;
 font-size: 20px;
  font-style: oblique;
 text-align: right;
}

#bar {
text-shadow: 2px 2px #black;
  text-align:right;
}
input[type=text] {
height:40px;
    width: 130px;
    box-sizing: border-box;
      border-style: solid black groove;
    border: 2px solid #black;
    border-radius: 4px;
    font-size: 14px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px;
    background-repeat: no-repeat;
    padding: 8px 20px 12px 20px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:Hover {
    width: 20%;
}
}


img {
    position: absolute;
    left: 0px;
    top: 0px;
    z-index: 1;
}


  </style>


<body>
     <h2><a href="contact.jsp">Contact Us</a></h2> 
     <div id= "bar">
     <form>
  <input type="text" name="search" placeholder="Search your need"><span class="glyphicon glyphicon-searchicon"></span>
</form>
</div>

  <div id="header_right">
  <nav class="nav navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header"> 
    <ul class="nav navbar-nav">
      <li class="default active"><a href="#"><span class="glyphicon glyphicon-home "></span>  Home</a></li>
  <li><a href="#">About</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Category <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="active"><a href ="product.jsp?name=women">Women's Wardorbe</a></li>
          <li><a href="#">Men's Wardorbe</a></li>
<li><a href="#">Kid's Wardorbe</a></li>
        </ul>
      </li>
    </ul>
   
    
<nav class="nav navbar-nav navbar-right">
 <div class="btn-group">
  <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-user "></span></button>
  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
    <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" role="menu">
    <li><a href="lovalid.jsp"><button type="button" class="btn btn-primary active">Login</button></a></li>
    <li><a href="signuo.jsp"><button type="button" class="btn btn-primary active">Sign Up</button></a></li>
  </ul>
</div>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="images/imgwomen.jpg" alt="women" width="980" height="551">
      </div>
      <div class="item">
        <img src="images/imgmen.jpg" alt="men" width="980" height="551">
      </div>
      <div class="item">
        <img src="images/imgkid.jpg" alt="kid" width="980" height="551">
      </div>
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>





   

</body>
</html>
