<?php
$firstname = "my name is kamal";
echo ucwords($firstname);
?>
<br>
<br>

<?php
$firstname = "my name is kamal";
echo strlen($firstname);
?>
<br>
<br>

<?php
$numseries = "123456789";
echo strrev($numseries);
?>
<br>
<br>

<?php
$string = "my name is kamal";
echo str_word_count($string);
?>
<br>
<br>

<?php
$password = "Admin123";
echo md5($password);
?>
<br>
<br>

<?php
if (file_exists("data.txt")){
echo "Yes";
}
else{
	echo "No";
}
?>
<br>
<?php
$fp = fopen('data.txt','W');
fwrite($fp, 'hello');
fclose($fp);
	echo "File written successfully";
?>
