<?php
session_start();
?>
<html>
<body>
<?php
	echo "Faviorte colore is".$_SESSION["ID"].".<br>";

	echo "Faviorte animal is".$_SESSION["email"].".";
	?>
</body>
</html>



