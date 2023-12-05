<?php 

$host = "localhost";
$user = "root";
$pass = "";
$database = "user"; 


$conn= mysqli_connect($host,$user,$pass,$database);
if(!$conn){
    echo "Failed " . mysqli_connect_error();
}


// $d_user = $_POST['uname'];
// $d_email = $_POST['email'];
// $d_pass = $_POST['pass'];

$quer = "INSERT INTO `userinfo` (`ID`, `Name`, `Email`, `Pass`) VALUES (NULL, 'Ayush', 'a', 'a')";
//$quer = "UPDATE `userinfo` SET `Email` = 'abcc' WHERE `userinfo`.`ID` = 1";
//$quer = "DELETE FROM `userinfo` WHERE `userinfo`.`ID` = 1";



$status = mysqli_query($conn,$quer);

if($status){
    echo "Data inserted sucessfully" . mysqli_error($conn);
}else{
    echo "something went wrong";
}
mysqli_close($conn);








?>