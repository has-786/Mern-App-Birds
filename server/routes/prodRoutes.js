module.exports=function(app,upload){

	
app.post('/insertProduct',upload.single('image'), (req,res,next)=>{
	var name=req.body.name;	
	var species=req.body.species;  

	var quantity=req.body.quantity;  
	var price=req.body.price;
	
	var Newprod=new prod({name:name,species:species,quantity:quantity,price:price,img:req.body.img});
					Newprod.save((err,prod1)=>{
						if(err)console.log(err);  
						else {   console.log(prod1);	res.send({msg:"Product Uploaded Successfully"});   } 
					});		
				
});


app.post('/deleteProduct',(req,res)=>{
	var id=req.body.id;

	prod.findOneAndDelete({_id:id},(err,prod1)=>{
		if(err)console.log(err); 
		else if(!prod1)res.send({msg:"No such product"});	
		else   
		{
			res.send({msg:"Product Removed Successfully"});
		}
	});
				
});




app.post('/showAllProd',(req,res)=>{
	prod.find({},(err,prods)=>{
		if(err)console.log(err);
		else  res.send(prods);  
	});    
});



app.post('/showProduct',(req,res)=>{
	var name=req.body.name;   console.log(req.body);
	prod.find({$or:[ {name:{ $regex: name ,$options:'i'}},{species:{ $regex:name,$options:'i' }} ]},(err,prod1)=>{ 
		if(err)console.log(err); 
		else if(!prod1){console.log("No such Bird");res.send({NotFound:'No such Bird'});}	
		else  {console.log(prod1);res.send(prod1);   }
	}); 
});

}
