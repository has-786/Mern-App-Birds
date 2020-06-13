	
  module.exports=function(app){
	  const bcrypt=require('bcryptjs');
signin=null;
name=null;

app.post('/localSignin',(req,res,next)=>{
	console.log(req.body);
	global.name=req.body.name;  	                          
	 user.findOne({name:req.body.name})
    .then(function(user1) {
		console.log(user1);
		if(user1){ return bcrypt.compare(req.body.pass,user1.pass); }
		else global.signin="Wrong Username";
    })
    .then(function(samePassword) {
         console.log(samePassword);
		 if(samePassword==true){console.log('Signed in SuccessFully');}
		 else global.name=null; 
		 if(global.signin){}
		 else if(global.name)global.signin='Signed in successfully'; 
		 else global.signin="Wrong Password";
		 console.log(global.signin);
		 	res.send({signin:global.signin,username:global.name});
			global.signin=null;


     })
    .catch(function(error){
        console.log("Error authenticating user: ");
        console.log(error);
        next();
    }); 
		 //global.msg=null;

}  );

mail=null;


app.post('/localSignup',(req,res,next)=>{
	console.log(req.body);   global.name=req.body.name; global.mail=req.body.email; 
	user.findOne({$or:[{name:req.body.name},{email:req.body.email}]},(err,user1)=>{
	   if(err)console.log(err); 
	   else if(user1){ res.send({signin:'Already A User'});console.log(user1); global.name=null;}
		else{
			    bcrypt.hash(req.body.pass,12,(err,hash)=>{
					var likedImages=[],likedVideos=[];
				var Newuser=new user({name:req.body.name,email:req.body.email,phone:req.body.phone,pass:hash,likedImages:likedImages,likedVideos:likedVideos});			
				Newuser.save((err,user2)=>{ if(err)console.log(err); else{ console.log(user2); global.name=user2.name;  }  });
				});	
				global.signin="Signed up successfully";
						 	res.send({signin:global.signin,username:global.name});
							global.signin=null;

				
		}
	});
  });
}