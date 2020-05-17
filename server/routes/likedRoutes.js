
module.exports=function(app){
		
		
		app.post('/likedVideos',(req,res)=>{
			user.findOne({name:req.body.name},(err,user1)=>{
			if(err)console.log(err);
			else {
				console.log(user1.likedvideos);console.log(user1);
				video.find({_id:{"$in":user1.likedVideos}},(err,video1)=>{  console.log(video1); res.send(video1); });
			 }
			});
		}); 
		
		
		app.post('/likedImages',(req,res)=>{
			user.findOne({name:req.body.name},(err,user1)=>{
			if(err)console.log(err);
			else {
				console.log(user1.likedImages);
				image.find({_id:{"$in":user1.likedImages}},(err,image1)=>{  res.send(image1); });
			}
		}); 
		}); 
	

}