<?php
include 'config.php';

$name = $_POST['name'];
mysqli_query($conn,"INSERT INTO users(name) VALUES('$name')");
?>