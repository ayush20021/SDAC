<?php 

$host = "localhost";
$user = "root";
$pass = "";
$database = "user"; 

$d_user = $_POST['uname'];
$d_pass = $_POST['pass'];

$quer = "SELECT * FROM `userinfo` WHERE `Name` ='$d_user' AND `Pass` ='$d_pass'";
$conn=  mysqli_connect($host,$user,$pass,$database);

$status = mysqli_query($conn,$quer);

if(mysqli_num_rows($status)>0){
   header("Location:home.html");
}else{
    header("Location:ERR.html");
}






?>