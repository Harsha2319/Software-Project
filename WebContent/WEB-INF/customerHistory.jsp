<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Welcome Driver </title>
    <link rel="shortcut icon" href="adminResources/images/favicon.ico">
    <!--STYLESHEET-->
    <!--=================================================-->
    <!--Roboto Slab Font [ OPTIONAL ] -->
    <link href="http://fonts.googleapis.com/css?family=Roboto+Slab:400,300,100,700" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Roboto:500,400italic,100,700italic,300,700,500italic,400" rel="stylesheet">
    <!--Bootstrap Stylesheet [ REQUIRED ]-->
    <link href="adminResources/css/bootstrap.min.css" rel="stylesheet">
    <!--Jasmine Stylesheet [ REQUIRED ]-->
    <link href="adminResources/css/style.css" rel="stylesheet">

    <!--SCRIPT-->
    <!--=================================================-->
    <!--Page Load Progress Bar [ OPTIONAL ]-->
    <link href="adminResources/css/pace.min.css" rel="stylesheet">
    <script src="adminResources/js/pace.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body style="background-color:#cccccc;">

  <nav class="navbar navbar-inverse navbar-fixed-top navbar-dark bg-dark navbar-expand-lg">
    <div class="container-fluid">
      <ul class="nav navbar-nav" style="font-size:18px;font-family:helvetica;color:white;">
        <li class="active "><a href="customerPage.html">Customer</a></li>
      <li><a href="customerPage.html">Book</a></li>
      <li><a href="joinRide.html">Join Ride</a></li>
      <li><a href="addPayment.html">Add Payment</a></li>
      <li><a href="customerHistory.html">Customer History</a></li>
      <li><a href="home.html">Logout</a></li>
      </ul>
    </div>
  </nav>

<div class="container">
      <div class="row justify-content-center">
          <div class="col-auto">
                      <h3 style="text-align:center; margin-top:15%;margin-bottom:35px;">History</h3>
                        <div class="table-responsive">
                          <table class="table table-hover mx-auto w-auto" style="font-size:16px;margin:auto; width:50% !important;">
                            <thead class="bg-primary white-text">
                              <tr>
                                <th scope="col">S.No</th>
                                <th scope="col">Origin</th>
                                <th scope="col">Destination</th>
                                <th scope="col">Rating</th>
                                <th scope="col">Charge</th>
                                <th scope="col">Payment Type</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">1</th>
                                <td>Baseball court</td>
                                <td>Berlington road</td>
                                <td>4</td>
                                <td>$23</td>
                                <td>Cash</td>
                              </tr>
                              <tr>
                                <th scope="row">2</th>
                                <td>Bustop</td>
                                <td>Hospital</td>
                                <td>5</td>
                                <td>$32</td>
                                <td>Credit Card</td>
                              </tr>
                              <tr>
                                <th scope="row">3</th>
                                <td>Metro</td>
                                <td>Brixton road</td>
                                <td>5</td>
                                <td>$25</td>
                                <td>Cash</td>
                              </tr>
                            </tbody>
                          </table>
                        </div>
              </div>
            </div>
        </div>
</body>
</html>
