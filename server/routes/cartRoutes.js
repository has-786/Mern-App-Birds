module.exports=function(app){
	
app.post('/addToCart',(req,res,next)=>{
  console.log('hi');

  username=req.body.name;
  
  
  global.prodReq=req.body.name;
  console.log( global.prodReq); 
  global.status=0;
  
	cart.findOne({name:username},(err,cart1)=>{ 
			if(err)console.log(err); 
			else if(!cart1)
			{			
				console.log('Fresh cart');
				 prodArr=[req.body.id]; 				 
				 var Newcart=new cart({name:req.body.name,prods:prodArr});
				 Newcart.save((err,cart1)=>{if (err) res.send({msg:"Error Occured"}); else{console.log(cart1);res.send({msg:"Added to cart"});}  });
              
			} 
			else
			{			console.log(cart1.prods);
							   for(var i=0;i<cart1.prods.length;i++){ if(cart1.prods[i]===req.body.id)global.status=1;     }
							   console.log(global.status);
							   if(global.status==0)
							   {
									cart.updateOne({ name: req.body.name},{ $push: {prods:req.body.id} },(err, cart1)=> 
										{ if (err) res.send({msg:"Error Occured"}); else{ console.log(cart1); res.send({msg:"Added to cart"}); }
									}); 
								}
								else res.send({msg:"Already Added"}); 	
			}
	 });
			
});
		
		
		
		

app.post('/removeFromCart',(req,res,next)=>{
  					
			cart.findOne({name:req.body.name},(err,cart1)=>{
					if(err)console.log(err); 
					else if(!cart1)console.log("No such Cart\n");	
					else cart.update({name: req.body.name }, { $pull: { prods:req.body.id }}, { safe: true},(err, cart1)=> {
									if (err) res.send({msg:"Error Occured"}); console.log(cart1);res.send({msg:" removed from cart"});
						});	
			});
});
		
		

app.post('/showCart',(req,res)=>{
	
	cart.findOne({name:req.body.name},(err,cart1)=>{
		if(cart1){
		console.log(cart1);
		prod.find({_id:{"$in":cart1.prods}},(err,prod1)=>{console.log(prod1); res.send(prod1);  });}
	});	
});

}

