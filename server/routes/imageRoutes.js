
module.exports=function(app,upload){
		app.post("/insertImage",upload.single('image'), (req, res, next) => {
				var files=req.file; 		
					console.log(files);
					console.log(req.body);
	
				var NewImage=new image({name:req.body.name,tags:req.body.tags,img:req.file.path,likes:0});
						NewImage.save((err,image1)=>{
							if(err)console.log(err);  
							else {   console.log(image1);	//res.send("Image Uploaded Successfully to your Gallery");  
															
							} 
					});		
		});
		
		app.post('/showAllImages',(req,res)=>{
			image.find({},(err,image1)=>{
			if(err)console.log(err);
			else  res.send(image1); });
		}); 
		
		app.post('/searchImages',(req,res)=>{
			
			image.find({$or:[ {name:{ $regex: req.body.name ,$options:'i'}},{tags:{ $regex:req.body.name,$options:'i' }} ]},(err,image1)=>{
			if(err)console.log(err);
			else  res.send(image1); });
		}); 
		
		
app.post('/deleteImage',(req,res)=>{
	var id=req.body.id; 
	image.findOneAndDelete({_id:id},(err,image1)=>{
		if(err)console.log(err); 
		else if(!image1)res.send({msg:"No such Image"});	
		else   
		{
			res.send({msg:"Image Removed Successfully"});
		}
	});	
});
		
		status=0;
		likedImages=[];
		msg=null;
app.post('/likeImage',(req,res)=>{
	var id=req.body.id;
	var name=req.body.name;
	
	user.findOne({name:name},(err,user1)=>{
		console.log(user1.likedImages);
			
		for(var i=0;i<user1.likedImages.length;i++){console.log(user1.likedImages[i]); if(user1.likedImages[i]===req.body.id)global.status=1;     }
		console.log(global.status);
		setTimeout(()=>{if(global.status==0)	
		{
			user.updateOne({name:name},{ $push: {likedImages:id}},(err,user2)=>{	console.log(user2.likedImages);
				image.updateOne({_id:id},{$inc: {'likes': 1 }},(err,image1)=>{
					if(err)res.send({msg:"Something Went Wrong"});
					else if(!image1)res.send({msg:"Something Went Wrong"});	
					else res.send({msg:"Image was Liked"});
				});
			});
			
		}
		else 		res.send({msg:"You Already Liked It"});
		},1000);
		
    });
});

}