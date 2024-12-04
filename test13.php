<php
function isprime($input){
	if ($input)<=1){
	return false;//1 and number less than 1 are not prime
	}
	
	for($i=2;$i*$i<=$input;$i++){
	if ($input % $i== 0){
	return false;// The number is divisible by $i,so it's
	}
     }
     return true;//The number is prime
}
$number=5;//replace with the number you want to check
if(isprime($number)){
	echo "$number is a prime number.";
}else{
echo "$number is not a prime Number.";
}
?>