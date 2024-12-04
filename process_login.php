<?php
if ($_SERVER['REQUEST_METHOD']==='POST'){
    $username = $_POST['username'];

session_start();
$_SESSION['username']=$username;
header("Location:Welcome.php");
}
?>