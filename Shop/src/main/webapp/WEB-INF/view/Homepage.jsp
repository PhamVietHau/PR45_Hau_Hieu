<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/28/22
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">


    <style>
        a{
            text-decoration: none;
        }

        img{
            max-width: 100%;
        }

        .carousel-inner .top-70{
            top: 70%;
        }

        .padding-rl-7px{
            padding: 0 7px;
        }

        .padding-7px{
            padding: 7px;
        }

        .container{
            width: 100%;
            padding-right: 15px;
            padding-left: 15px;
            margin-right: auto;
            margin-left: auto;
        }




    </style>
    <script src="https://kit.fontawesome.com/ff8e40a58b.js" crossorigin="anonymous"></script>


</head>
<body style="overflow-x: hidden">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<%--==================Header===============--%>
<div>
    <nav style="" class="navbar navbar-expand-lg navbar-light bg-light">
        <a style="margin-left: 15px" class="navbar-brand" href="home"><img style="width: 100px ;" src="https://i.imgur.com/v4jj1Ub.jpg" alt=""></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent" style="margin-left: 5%">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="home">Trang chủ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item ">
                    <a class="nav-link" href="#">Shop</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Dịch vụ
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Trợ Giúp</a>
                        <a class="dropdown-item" href="#">Blog</a>
                    </div>
                </li>
                <li>
                    <form  class="form-inline my-2 my-lg-0">
                        <input style="width: 35rem" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form >
                </li>
                <li style="margin-left: 10vh" class="nav-item ">
                    <a class="nav-link" href="#">
                        <i class="fa-solid fa-cart-shopping"></i> Giỏ Hàng
                    </a>

                </li>
                <li  class="nav-item nav-item dropdown " style="margin-left: 10vh" >
                    <a class="nav-link dropdown-toggle" href="#"  role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fa-regular fa-user"></i> Tài Khoản</a>
                    <div class="dropdown-menu" >
                        <a class="dropdown-item" href="login">Đăng Nhập</a>
                        <a class="dropdown-item" href="regist">Đăng kí</a>
                    </div>

                </li>
            </ul>
        </div>
    </nav>
</div>
<%--==============Header==================--%>



<%--===========Section===============--%>

<%--    <div id="section-header">--%>
<%--        <div class="section-img-header" style="background-image: url('https://i.imgur.com/K5ubvQ8.jpg');">--%>
<%--            --%>
<%--        </div>--%>
<%--    </div>--%>

<div  style="padding: 0 10%; background-color: dimgrey;" id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" >
        <div class="carousel-item active">
            <img class="d-block w-100" src="https://i.imgur.com/03ETmCL.png/800x400?auto=yes&bg=777&fg=555&text=First slide" alt="First slide">
            <div class="carousel-caption d-none d-md-block" >


            </div>
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="https://i.imgur.com/bkUqs7W.png/800x400?auto=yes&bg=666&fg=444&text=Second slide" alt="Second slide">
            <div class="carousel-caption d-none d-md-block" >

            </div>
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="https://i.imgur.com/U9OrjLy.png/800x400?auto=yes&bg=555&fg=333&text=Third slide" alt="Third slide">
            <div class="carousel-caption d-none d-md-block " >


            </div>
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<%--===========Section===============--%>


<%--================Product================--%>


<div style="    width: 50%; margin: auto; text-align: center; padding: 50px 0;">
    <h2>Shop</h2>
</div>
<div class="card-deck" style="padding: 0 10%;">
    <div class="card">
        <img class="card-img-top" src="https://i.imgur.com/x63UaHb.png" alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <a href="#" class="btn btn-primary">Add to cart</a>
        </div>
    </div>
    <div class="card">
        <img class="card-img-top" src="https://i.imgur.com/CKGwteU.png" alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <a href="#" class="btn btn-primary">Add to cart</a>
        </div>
    </div>
    <div class="card">
        <img class="card-img-top" src="https://i.imgur.com/XjRowma.png" alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <a href="#" class="btn btn-primary">Add to cart</a>
        </div>
    </div>
    <div class="card">
        <img class="card-img-top" src="https://i.imgur.com/AUtW9Bg.png" alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <a href="#" class="btn btn-primary">Add to cart</a>
        </div>
    </div>
    <div class="card">
        <img class="card-img-top" src="https://i.imgur.com/HlYX742.png" alt="Card image cap">
        <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <a href="#" class="btn btn-primary">Add to cart</a>
        </div>
    </div>
</div>
<div>
    <div style="margin: 15px 0">
        <img src="https://i.imgur.com/knBs66n.png" alt="">
    </div>
    <div style="    width: 50%; margin: auto; text-align: center; padding: 50px 0;">
        <h2>Áo</h2>
    </div>
    <div class="card-deck" style="padding: 0 10%;">
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/x63UaHb.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/47fhVXR.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/CKGwteU.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/6yafYNv.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/Q438wWd.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
    </div>
</div>
<div>
    <div style="margin: 15px 0">
        <img src="https://i.imgur.com/Ivt3mJs.png" alt="">
    </div>
    <div style="    width: 50%; margin: auto; text-align: center; padding: 50px 0;">
        <h2>Quần</h2>
    </div>
    <div class="card-deck" style="padding: 0 10%;">
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/XjRowma.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/PLpfFEu.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/YrMRwk0.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/HlYX742.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
        <div class="card">
            <img class="card-img-top" src="https://i.imgur.com/AUtW9Bg.png" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <a href="#" class="btn btn-primary">Add to cart</a>
            </div>
        </div>
    </div>
</div>


<%--==================Product===================--%>


<%--==================Artice============--%>
<div style="margin: 50px 0; padding: 0 15px">
    <table style="width: 75%;margin: auto">
        <tr>
            <td class="padding-7px"><img src="https://i.imgur.com/VEQxfsx.png" alt=""></td>
            <td class="padding-7px"><img src="https://i.imgur.com/rnwy0Tu.png" alt=""></td>
            <td class="padding-7px"><img src="https://i.imgur.com/u8MJG0i.png" alt=""></td>
            <td class="padding-7px"><img src="https://i.imgur.com/MHXPwEL.png" alt=""></td>
        </tr>
        <tr>
            <td class="padding-7px"><img src="https://i.imgur.com/Yl223dA.png" alt=""></td>
            <td class="padding-7px"><img src="https://i.imgur.com/ivpc1ry.png" alt=""></td>
            <td class="padding-7px"><img src="https://i.imgur.com/fYANrkY.png" alt=""></td>
            <td class="padding-7px"><img src="https://i.imgur.com/4J2EV73.png" alt=""></td>
        </tr>
    </table>
</div>


<%--==================Artice============--%>


<%--==================footer=============--%>
<div >
    <footer class="bg-light text-center text-white">
        <!-- Grid container -->
        <div class="container p-4 pb-0">
            <!-- Section: Social media -->
            <section class="mb-4">
                <!-- Facebook -->
                <a
                        class="btn text-white btn-floating m-1"
                        style="background-color: #3b5998;"
                        href="#!"
                        role="button"
                ><i class="fab fa-facebook-f"></i
                ></a>

                <!-- Twitter -->
                <a
                        class="btn text-white btn-floating m-1"
                        style="background-color: #55acee;"
                        href="#!"
                        role="button"
                ><i class="fab fa-twitter"></i
                ></a>

                <!-- Google -->
                <a
                        class="btn text-white btn-floating m-1"
                        style="background-color: #dd4b39;"
                        href="#!"
                        role="button"
                ><i class="fab fa-google"></i
                ></a>

                <!-- Instagram -->
                <a
                        class="btn text-white btn-floating m-1"
                        style="background-color: #ac2bac;"
                        href="#!"
                        role="button"
                ><i class="fab fa-instagram"></i
                ></a>

                <!-- Linkedin -->
                <a
                        class="btn text-white btn-floating m-1"
                        style="background-color: #0082ca;"
                        href="#!"
                        role="button"
                ><i class="fab fa-linkedin-in"></i
                ></a>
            </section>
            <!-- Section: Social media -->
        </div>
        <!-- Grid container -->

        <!-- Copyright -->
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
            © 2022 Copyright:
            GreenDolphin
        </div>
        <!-- Copyright -->
    </footer>
</div>
<%--==================footer=============--%>
</body>
</html>
