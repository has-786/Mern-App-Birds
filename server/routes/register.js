module.exports=function(){
const express = require("express");
const bodyParser = require('body-parser');
const path=require('path');
const bcrypt=require('bcryptjs');
const mongoose=require('mongoose');


db=require('../database/db.js');
con=db.con(mongoose);
const fs=require('fs');


//db=require('../database/db.js');
//con=db.con(mongoose);

app=express();

//app.use(bodyParser.json());
//app.use(bodyParser.urlencoded({ extended: true }));  

app.use(bodyParser.json({ limit: "200mb" }));
app.use(bodyParser.urlencoded({ limit: "200mb",  extended: true, parameterLimit: 1000000 }));

  
  app.post('/upload',(req,res,next)=>{
	console.log(req.body);    
	fs.writeFile("out.png", req.body.img,'base64',function(err) {
  console.log(err); });
	
	res.send({msg:"ok boss"});
  });
  
}