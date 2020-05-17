	
  module.exports=function(app){
	  const bcrypt=require('bcryptjs');

app.post('/localSignin',(req,res,next)=>{
	console.log(req.body);
	
	global.name=req.body.name;  	                          
	 user.findOne({name:global.name})
    .then(function(user1) {
		if(user1){type=user1.type; return bcrypt.compare(req.body.pass,user1.pass); }
    })
    .then(function(samePassword) {
         console.log(samePassword);if(samePassword==true){console.log('Signed In SuccessFully');}
		 else global.name=null; 
		 if(global.name)user.findOne({name:global.name},(err,user2)=>{	console.log(user2.type);	res.send({username:global.name,type:user2.type});  }); 
     })
    .catch(function(error){
        console.log("Error authenticating user: ");
        console.log(error);
        next();
    }); 
}  );

name=null;
mail=null;


app.post('/localSignup',(req,res,next)=>{
	console.log(req.body);   global.name=req.body.name; global.mail=req.body.email; 
	user.findOne({$or:[{name:req.body.name},{email:req.body.email}]},(err,user1)=>{
	   if(err)console.log(err); 
	   else if(user1){ console.log('Already A User');console.log(user1); global.name=null;}
		else{
			    bcrypt.hash(req.body.pass,12,(err,hash)=>{
					var likedImages=[],likedVideos=[];
				var Newuser=new user({name:req.body.name,email:req.body.email,phone:req.body.phone,pass:hash,likedImages:likedImages,likedVideos:likedVideos});			
				Newuser.save((err,user2)=>{ if(err)console.log(err); else{ console.log(user2); global.name=user2.name;  }  });
				});
		}
		res.send({username:global.name}); 
	});
  });
}