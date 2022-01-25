<?php 

$name = '';
$email = '';
$phone = '';
$message = '';

if(isset($_POST["submit"])) {
    $name = trim($_POST["name"]);
    $email = trim($_POST["email"]);
    $phone = trim($_POST["phone"]);
    $message = trim($_POST["message"]);

    $messages_file = fopen("messages.csv", "a");
    $new_message_id = count(file("messages.csv")) + 1;
    
    $new_message = array(
        'id' => $new_message_id,
        'name' => $name,
        'email' => $email,
        'phone' => $phone,
        'message' => $message
     );

    fputcsv($messages_file, $new_message);
    fclose($messages_file);

    $name = '';
    $email = '';
    $phone = '';
    $message = '';
}

?>



<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Offline 3</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="Style.css">

<body>

    <!--Header start-->
    <header>
        <div class=" row ">
            <div class="col-12 col-sm-12 text-center">
                <h3>Tech Flow</h3>
            </div>
        </div>
        <!--NAV BER START-->
        <div class=" row ">
            <div class="col-12 col-sm-12">
                <nav class="  navbar navbar-expand-sm justify-content-center  pt-3   ">

                    <ul class="navbar-nav">
                        <li class="nav-item active"><a class="nav-link mycolor mycolor1" href="#">HOMEPAGE</a></li>
                        <li class="nav-item"><a class="nav-link mycolor mycolor1" href="#">LAPTOP</a></li>
                        <li class="nav-item"><a class="nav-link mycolor mycolor1" href="#">DESK-LAPTOP</a></li>
                        <li class="nav-item"><a class="nav-link mycolor mycolor1" href="#">MOUSE</a></li>
                        <li class="nav-item"><a class="nav-link mycolor mycolor1" href="#">KEYBOARD</a></li>
                        <li class="nav-item"><a class="nav-link mycolor mycolor1" href="#">MOTHERBOARD</a></li>
                    </ul>





            </div>
            </nav>
        </div>
    </header>

    <!--header end-->
    <div class="div-clear"></div>

    <!--MAIN START-->
    <main>
        <!--CAROUSEL START-->
        <div class="row mt-3  ">
            <div class="col-lg-12 col-sm-12">
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100 feadback-img" src="PIC/pav.jpg" alt="First slide">
                            <div class="carousel-caption">
                                <h3 class="text-center">Tech Flow</h3>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="PIC/Legion.jpg" alt="Second slide">
                            <div class="carousel-caption">
                                <h3 class="text-center">Tech Flow</h3>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="PIC/acernitro5.jpg" alt="Third slide">
                            <div class="carousel-caption">
                                <h3 class="text-center">Tech Flow</h3>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100" src="PIC/msi-gf63.jpg" alt="Third slide">
                            <div class="carousel-caption">
                                <h3 class="text-center">Tech Flow</h3>

                            </div>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    </a>
                </div>
            </div>
        </div>


        <!--BLACK PART START-->

        <div class="row bac ml-0 mr-0">

            <div class="col-lg-4 col-md-4 col-sm-12 text-center mt-4 pt-3 pb-2">

                <h5 class="cal">CALL US 24 hours</h5>

                <p class="ca"> <a href="tel:  (8802) 8870422">Phone : (8802) 8870422</a></p>

            </div>


            <div class="col-lg-4 col-md-4 col-sm-12 text-center mt-4 pt-3 pb-2">
                <h5 class="cal">EMAIL ADDRESS</h5>
                <p class="ca"> <a href="mailto:  170204003@aust.edu">Email : 170204003@aust.edu</a></p>


            </div>


            <div class="col-lg-4 col-md-4 col-sm-12 text-center mt-4 pt-3 pb-2">

                <h5 class="cal"> OPEN HOURS </h5>
                <p class="ca">Daily 9:00 AM - 8:00 PM</p>

            </div>

        </div>
        <!--BLACK PART END-->

        <!--white & blue mixed start-->

        <div class="row ml-0 mr-0 bgx ">
             <h1 class="text-center col-lg-12 col-md-12 col-sm-12 mt-3">About Us</h1>

             <div class="col-lg-4 col-md-4 col-sm-12  mt-4 pt-5 pb-2">
                   

                <div class="ms1 text-center big mt-4 pt-2">
                    <div class="round ">
                        <img src="PIC/Atanu.jpg" alt="" class="rounded-circle img-fluid picx">
                    </div>
                    <h3>Atanu Kumar Saha</h3>
                    <p>Studies B.Sc in CSE at AUST </p>
                    <p class="ca"> <a href="mailto:  170204003@aust.edu">Email : 170204003@aust.edu</a></p>
                    <p><a href="http://facebook.com/apon.saha.3705/">Facebook </a></p>
                </div>

            </div>

            


            <div class="col-lg-4 col-md-4 col-sm-12  mt-4 pt-5 pb-2 pl-3 ">
                <div class="ms1 text-center big mt-4 pt-2">
                    <div class="round ">
                        <img src="PIC/Tonmoy.jpg" alt="" class="rounded-circle img-fluid picx">
                    </div>
                    <h3>Faisal Ahmmed Tonmoy</h3>
                    <p>Studies B.Sc in CSE at AUST </p>
                    <p class="ca"> <a href="mailto:  170204025@aust.edu">Email : 170204025@aust.edu</a></p>
                    <p><a href="https://www.facebook.com/faisal.ahmmed.tonmoy">Facebook </a></p>
                </div>
            </div>

            <div class="col-lg-4 col-md-4 col-sm-12  mt-4 pt-5 pb-2 pl-3">

                <div class="ms1 text-center big mt-4 pt-2">
                    <div class="round ">
                        <img src="PIC/Mahin.png" alt="" class="rounded-circle img-fluid picx">
                    </div>
                    <h3>Mahîn Õpù</h3>
                    <p>Studies B.Sc in CSE at AUST </p>
                    <p class="ca"> <a href="mailto:  170204006@aust.edu">Email : 170204006@aust.edu</a></p>
                    <p><a href="https://www.facebook.com/mahin.opu.733/">Facebook </a></p>
                </div>
            </div>
        </div>

        <!--Form PART START-->
    
        
        <div class="contact-form">
        <form class="shadow-sm" method="POST">
            <div class="title">
                <h2>Contact us</h2>
            </div>
            <div class="form-group">
                <input class="form-control" type="text" name="name" placeholder="Name" required="required" value="<?php echo $name; ?>"></input>
            </div>
            <div class="form-group">
                <input class="form-control" type="email" name="email" placeholder="Email" required="required" value="<?php echo $email; ?>"></input>
            </div>
            <div class="form-group">
                <input class="form-control" type="tel" name="phone" placeholder="Phone" value="<?php echo $phone; ?>"></input>
            </div>
            <div class="form-group">
                <textarea class="form-control" name="message" placeholder="Message" required="required" value="<?php echo $message; ?>"></textarea>
            </div>
            <div class="form-group">
                <button class="btn btn-primary shadow-sm" type="submit" name="submit">Submit</button>
            </div>
            <div class="admin-button">
                <a href="Admin.php">Open admin panel</a>
            </div>
        </form>
    </div>

        

        

        
    </main>

    <!--main end-->
    <div class="div-clear"></div>

    <!--FOOTER START-->
    <footer>
        <div class="fot ml-0 mr-0  ">
            <h6>&copy;Copyright 2021 All Rights Reserved</h6>
        </div>

    </footer>

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>