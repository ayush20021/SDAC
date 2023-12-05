<?php 

$host = "localhost";
$user = "root";
$pass = "";
$database = "user"; 


$conn= mysqli_connect($host,$user,$pass,$database);
if(!$conn){
    echo "Failed " . mysqli_connect_error();
}


$d_user = $_POST['uname'];
$d_email = $_POST['email'];
$d_pass = $_POST['pass'];

$quer = "INSERT INTO `userinfo` (`ID`, `Name`, `Email`, `Pass`) VALUES (NULL, '$d_user', '$d_email', '$d_pass')";


$status = mysqli_query($conn,$quer);

if($status){
   header("Location:login.html");
}else{
    echo "something went wrong";
}
mysqli_close($conn);








?>