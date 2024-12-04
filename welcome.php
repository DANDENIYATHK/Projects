<?php
session_start();
if (isset($_SESSION['username'])){
	$username=$_SESSION['username'];
	echo"Welcome, $username!";
}else{
	echo "You are not logged in.Please log in first.";
}
?>