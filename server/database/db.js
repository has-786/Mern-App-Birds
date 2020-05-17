mongoose=require('mongoose');
function con(mongoose){
	//mongodb+srv://has123:<password>@cluster0-xzpel.mongodb.net/test
	//mongodb+srv://has_123:yaali786@cluster0-okd19.mongodb.net/test
	//mongodb://localhost/test
mongoose.connect('mongodb+srv://has_123:yaali786@cluster0-okd19.mongodb.net/test', {useNewUrlParser: true, useUnifiedTopology: true});                
var db = mongoose.connection;
db.on('error', console.error.bind(console, 'connection error:'));
db.once('open', function() {
  console.log('Database is connected');
});			
}

var imageSchema=new mongoose.Schema({name:String,tags:String,img:String,likes:Number});
var image=mongoose.model('image',imageSchema);

var videoSchema=new mongoose.Schema({name:String,tags:String,link1:String,likes:Number});
var video=mongoose.model('video',videoSchema);

var birdSchema=new mongoose.Schema({name:String,species:String,img:String,details:String});
var bird=mongoose.model('bird',birdSchema);

var userSchema=new mongoose.Schema({name:String,email:String,phone:String,pass:String,likedImages:[String],likedVideos:[String]});
var user=mongoose.model('user',userSchema);


var prodSchema=new mongoose.Schema({name:String,species:String,quantity:Number,price:Number,img:String});
var prod=mongoose.model('prod',prodSchema);


var cartSchema=new mongoose.Schema({name:String,prods:[String]});
var cart=mongoose.model('cart',cartSchema);


var orderSchema=new mongoose.Schema({name:String,paymentId:String,paymentMethod:String,address:String,amount:Number,timestamp:String,prods:[prodSchema]});
var order=mongoose.model('order',orderSchema);

var blogSchema=new mongoose.Schema({topic:String,data:String,img:String,timestamp:String});
var blog=mongoose.model('blog',blogSchema);

module.exports={con:con,image:image,bird:bird,user:user,prod:prod,cart:cart,order:order,blog:blog,video:video};

