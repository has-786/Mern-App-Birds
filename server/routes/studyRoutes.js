
module.exports=function(app,upload){

app.post("/insertBird",upload.single('image'), (req, res, next) => {
				
	
				var NewBird=new bird({name:req.body.name,species:req.body.species,img:req.body.img,details:req.body.details});
						NewBird.save((err,bird1)=>{
							if(err)console.log(err);  
							else {   console.log(bird1);	res.send({msg:"Bird Details Uploaded Successfully to Study Section"});   } 
					});		
		});

			app.post('/showAllBirds',(req,res)=>{
			bird.find({},(err,bird1)=>{
			if(err)console.log(err);
			else  res.send(bird1); });
		}); 
		
		app.post('/searchBirds',(req,res)=>{
			
			bird.find({$or:[ {name:{ $regex: req.body.name ,$options:'i'}},{species:{ $regex:req.body.name,$options:'i' }} ]},(err,bird1)=>{
			if(err)console.log(err);
			else  res.send(bird1); });
		}); 
		
app.post('/deleteBird',(req,res)=>{
	var id=req.body.id; 
	bird.findOneAndDelete({_id:id},(err,bird1)=>{
		if(err)console.log(err); 
		else if(!bird1)res.send({msg:"No such Bird"});	
		else   
		{
			res.send({msg:"Bird Details Removed Successfully"});
		}
	});	
});
}