<?php 

$host = "localhost";
$user = "root";
$pass = "";
$database = "user"; 

$conn= mysqli_connect($host,$user,$pass,$database);
if(!$conn){
    echo "Failed " . mysqli_connect_error();
}

$quer = "select * from userinfo";



$info = mysqli_query($conn,$quer);

while($data = mysqli_fetch_array($info)){

echo $data['Name']."<br>";
echo $data['Pass']."<br>";




}





?>