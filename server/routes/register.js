module.exports=function(app){


db=require('../database/db.js');
con=db.con(mongoose);
const fs=require('fs');



  
  app.post('/upload',(req,res,next)=>{
	console.log(req.body);    
	fs.writeFile("out.png", req.body.img,'base64',function(err) {
  console.log(err); });
	
	res.send({msg:"ok boss"});
  });
  
}