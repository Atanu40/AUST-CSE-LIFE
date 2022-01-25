<!DOCTYPE html>
<html>

<head>
    <title>Assignment #3</title>
       <!-- Latest compiled and minified CSS -->
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="Style.css">
</head>

<body>
<div class="container">
        <div class="title">
            <h2>User messages</h2>
        </div>
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Message</th>
                    </tr>
                </thead>
                <tbody>
                    <?php
                        fopen("messages.csv", "a");
                        if (($messages_file = fopen("messages.csv", "r")) !== FALSE) {
                        while (($message_data = fgetcsv($messages_file, 5000, ",")) !== FALSE) {
                            echo '<tr>';
                                    echo '<td>' . $message_data[0] . '</td>';
                                    echo '<td>' . $message_data[1] . '</td>';
                                    echo '<td>' . $message_data[2] . '</td>';
                                    echo '<td>' . $message_data[3] . '</td>';
                                    echo '<td>' . $message_data[4] . '</td>';
                            echo '</tr>';
                        }
                        fclose($messages_file);
                    }
                    ?>
                </tbody>
            </table>
        </div>
    </div>
   <!-- jQuery library -->
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>