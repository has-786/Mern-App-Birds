
const express = require("express");
const bodyParser = require('body-parser');
const path=require('path');
const bcrypt=require('bcryptjs');
app=express();

app.use(bodyParser.urlencoded({ extended: false }));  
app.use(bodyParser.json());

app.use(express.static(__dirname));
/*app.use(express.static(path.join(__dirname, 'client','build')));

app.get('*',(req,res)=>{
	res.sendFile(path.join(__dirname,'client','build','index.html'));
});*/

require('./server/routes/mainRoutes.js')(app,bodyParser,path,bcrypt);

port=process.env.PORT||5000;

app.listen(port,()=>{console.log('Server On');});

