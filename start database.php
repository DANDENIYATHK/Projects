<?php
$server="localhost";
$username="root";
$password="";
$dbname="university";
//connecting to the database

$connection= mysqli_connect($server, $username, $password, $dbname);
if(!$connection){
	die("Connection failed:".mysqli_connect_error());
}
echo"Connected successfully";


//inserting data & updating data
if (!empty($_POST["save"])){
	//collecting form data
	$indexNo=$_POST["studentID"];
	$stName=$_POST["studentName"];
	$email=$_POST["email"];
	
	$insertQuery="INSERT INTO student VALUES('$indexNo', '$stName', '$email')";
	$result=mysqli_query($connection, $insertQuery);
	
	if (!$result){
		die("Data not inserted");
	}
	echo "One record Inserted";
}

//Delete a record
if(!empty($_GET["ID"])){
	$deleteQuery="DELETE FROM student WHERE studentID='".$_GET["ID"]."'";
	$result=mysqli_query($connection, $deleteQuery);
	
	if (!result){
		die("Record is not deleted");
	}
	header("Location:welcome1.php");
	echo "One record deleted";
}
?>

<html>
<body>
	<h2>Registration Form</h2>
	<table>
	<form action="<?php echo $_SERver["PHP_SELF"]?>" method="post">
		<tr><td><label>Student Index No</label></td>
			<td><input type="text" name="studentID"></td></tr>
			
		<tr><td><label>Student Name</label></td>
			<td><input type="text" name="studentName"></td></tr>
			
		<tr><td><label>Student Email</label></td>
			<td><input type="text" name="email"></td></tr>
			
		<tr><td colspan=2 align="center"><input type="submit" value="Save" name="save"></td></tr>
</form>
</table>
<br><br>

<table border=1>
<tr><th>StudentIndex</th><th>Student Name</th><th>Email</th><th>Delete</th></tr>
<?php

//select data and display in HTML table
	$selectQuery="SELECT * FROM student";
	$result=mysqli_query($connection, $selectQuery);
	
	if(mysqli_num_rows($result)>0){
		while($record=mysqli_fetch_row($result)){
			echo "<tr>";
			echo "<td>".$record['0']."</td>";
			echo "<td>".$record[1]."</td>";
			echo "<td>".$record[2]."</td>";
			echo "<td> &nbsp <a href='".$_SERVER["PHP_SELF"]."?ID=$record[0]'>DELETE</a> &nbsp | &nbsp";
			echo "</tr>";
		}
	}
	mysqli_close($connection)
	?>
	</table>
</body>
</html>
	
	
			
	