
const express = require("express");
const bodyParser = require('body-parser');
const path=require('path');
const bcrypt=require('bcryptjs');
app=express();

app.use(bodyParser.json({ limit: "200mb" }));
app.use(bodyParser.urlencoded({ limit: "200mb",  extended: true, parameterLimit: 1000000 }));


app.use(express.static(__dirname));
app.use(express.static(path.join(__dirname, 'client','build')));

app.get('*',(req,res)=>{
	res.sendFile(path.join(__dirname,'client','build','index.html'));
});


require('./server/routes/mainRoutes.js')(app,bodyParser,path,bcrypt);

port=process.env.PORT || 5000;

app.listen(port,()=>{console.log('Server On');});

