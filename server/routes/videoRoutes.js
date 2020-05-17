
module.exports=function(app){
		app.post("/insertVideo", (req, res, next) => {
				
					console.log(req.body);
	
				var NewVideo=new video({name:req.body.name,tags:req.body.tags,link1:req.body.link1,likes:0});
						NewVideo.save((err,video1)=>{
							if(err)console.log(err);  
							else {   console.log(video1);	res.send({msg:"Video Uploaded Successfully to your Gallery"});   } 
					});		
		});
		
		app.post('/showAllVideos',(req,res)=>{
			video.find({},(err,video1)=>{
			if(err)console.log(err);
			else  res.send(video1); });
		}); 
		
		app.post('/searchVideos',(req,res)=>{
			
			video.find({$or:[ {name:{ $regex: req.body.name ,$options:'i'}},{tags:{ $regex:req.body.name,$options:'i' }} ]},(err,image1)=>{
			if(err)console.log(err);
			else  res.send(video1); });
		}); 
		
		
app.post('/deleteVideo',(req,res)=>{
	var id=req.body.id; 
	video.findOneAndDelete({_id:id},(err,video1)=>{
		if(err)console.log(err); 
		else if(!video1)res.send({msg:"No such Video"});	
		else   
		{
			res.send({msg:"Video Removed Successfully"});
		}
	});	
});
		
		
		status=0;
		likedVideos=[];
		msg=null;
		
	app.post('/likeVideo',(req,res)=>{
		var id=req.body.id;
		var name=req.body.name;
		console.log(id);
		user.findOne({name:name},(err,user1)=>{
			console.log(user1.likedVideos);
				
			for(var i=0;i<user1.likedVideos.length;i++){ console.log(user1.likedVideos[i]); if(user1.likedVideos[i]===req.body.id)global.status=1;     }
			console.log(global.status);
			setTimeout(()=>{if(global.status==0)	
			{
				user.updateOne({name:name},{ $push: {likedVideos:id}},(err,user2)=>{	console.log(user2.likedVideos);
					video.updateOne({_id:id},{$inc: {'likes': 1 }},(err,video1)=>{
						if(err)res.send({msg:"Something Went Wrong"});
						else if(!video1)res.send({msg:"Something Went Wrong"});	
						else res.send({msg:"Video was Liked"}); 
					});
				});
			}
			else res.send({msg:"You Already Liked It"});
		},1000);	
	});
});

}