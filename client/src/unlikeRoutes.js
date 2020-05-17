  module.exports=function(app){

app.post('/unlikeImage',(req,res)=>{
	var id=req.body.id;
	var name=req.body.name;
	
	user.findOne({name:name},(err,user1)=>{
		console.log(user1.likedImages);
			
		setTimeout(()=>{
			user.updateOne({name:name},{ $pull: {likedImages:id}},(err,user2)=>{	//console.log(user2.likedImages);
				image.updateOne({_id:id},{$inc: {'likes': -1 }},(err,image1)=>{
					if(err)res.send({msg:"Something Went Wrong"});
					else if(!image1)res.send({msg:"Something Went Wrong"});	
					else res.send({msg:"Image was unliked"});
				});
			});
		},1000);
		
    });
});


app.post('/unlikeVideo',(req,res)=>{
	var id=req.body.id;
	var name=req.body.name;
	
	user.findOne({name:name},(err,user1)=>{
		console.log(user1.likedVideos);
			
		setTimeout(()=>{
			user.updateOne({name:name},{ $pull: {likedVideos:id}},(err,user2)=>{	//console.log(user2.likedImages);
				video.updateOne({_id:id},{$inc: {'likes': -1 }},(err,image1)=>{
					if(err)res.send({msg:"Something Went Wrong"});
					else if(!image1)res.send({msg:"Something Went Wrong"});	
					else res.send({msg:"Video was unliked"});
				});
			});
		},1000);
		
    });
});
}