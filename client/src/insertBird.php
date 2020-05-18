<?php
$target_dir = "uploads/";
$target_file = $target_dir . basename($_FILES["image"]["name"]);
$uploadOk = 1;
//$imageFileType = strtolower(pathinfo($target_file,PATHINFO_EXTENSION));
// Check if image file is a actual image or fake image

$type=$_FILES["image"]["type"];
 if($type=="image/jpeg" || $type=="image/png")
 {
	  
	if(move_uploaded_file($_FILES['image']['tmp_name'], $target_path)) {  
		echo "File uploaded successfully!";  
	}
	else{  
		echo "Sorry, file not uploaded, please try again!";  
	}  
 }
 else   echo "Sorry,Only Images are allowed";  


?>