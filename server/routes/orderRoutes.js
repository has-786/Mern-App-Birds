
module.exports=function(){
app.post('/CompleteCashOrder',(req,res)=>{
	var paymentId=null;
	var name=req.body.name;
	var amount=req.body.amount;
	var timestamp=req.body.timestamp;
	var paymentMethod="Cash";
	var address=req.body.address;
	
	cart.findOneAndDelete({ name:name }).then((cart1)=>{console.log(cart1);
		prod.find({_id:{"$in":cart1.prods}},(err,prod1)=>{
			console.log(prod1); 
			var Neworder=new order({name:name,paymentId:paymentId,address:address,prods:prod1,amount:amount,paymentMethod:paymentMethod,timestamp:timestamp});
			Neworder.save((err,order1)=>{if(err)console.log(err); else {console.log(order1);  global.msg="Order Was Successful";  res.send({msg:global.msg});} });
		});
	 }).catch((err)=> {if(err)console.log(err); else console.log("Successful deletion"); });
});


app.post('/CompletePaidOrder',(req,res)=>{
	var paymentId=req.body.paymentId;
	var name=req.body.name;
	var amount=req.body.amount/100;
	var timestamp=req.body.timestamp;
	var paymentMethod="Done";
	var address=req.body.address;
	user.findOne({name:name},(err,user1)=>{
		if(err){console.log(err); }
		else if(!user1){console.log('user not available');}
		else if(user1){
			cart.findOneAndDelete({ name:name }).then((cart1)=>{
				prod.find({_id:{"$in":cart1.prods}},(err,prod1)=>{
					console.log(prod1);
			var Neworder=new order({name:name,paymentId:paymentId,address:address,prods:prod1,amount:amount,paymentMethod:paymentMethod,timestamp:timestamp});
			Neworder.save((err,order1)=>{if(err)console.log(err); else console.log(order1); });			
			});
		}).catch((err)=> {if(err)console.log(err); else console.log("Successful deletion of Cart"); });
	  }
	});
});


app.post('/showOrder',(req,res)=>{

 order.find({name:req.body.name},(err,order1)=>{if(err)console.log(err); else {console.log(order1); res.send(order1);}  });


});}
