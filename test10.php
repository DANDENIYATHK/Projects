<html>
<head>
<title>Factorial Calculator</title>
</head>
<body>
	<h2> Factorial Calculator</h2>
	<from method="POST">
	Enter a number:
	<input type="number" name="number" required>
	<input type="submit" name="Calculator" value="Calculate factorial">
	</form>
	

	<?php
	if (isset($_POST["number"])){
	//echo $inputnumber;
	$factorial = 1;
	
	for ($i=1; $i<=$inputnumber;$i++){
	$factorial =$factorial*$i;
	}
	echo "Factorial of $inputnumber is $factorial";
	}
	?>

</body>





</html>