module.exports=function(app,bodyParser,path,bcrypt)
{

const multer = require('multer');
const mongoose=require('mongoose');


db=require('../database/db.js');
con=db.con(mongoose);
image=db.image;
bird=db.bird;
user=db.userandroid;
cart=db.cart;
prod=db.prod;
order=db.order;
video=db.video;
blog=db.blog;


const storage = multer.diskStorage({
  destination: function(req, file, cb) {
    cb(null, './uploads');
  },
  filename: function(req, file, cb) {
   cb(null, file.originalname);
  }
});

const fileFilter = (req, file, cb) => {
  // reject a file
  if (file.mimetype === 'image/jpeg' || file.mimetype === 'image/png') {
    cb(null, true);
  } else {
    cb(null, false);
  }
};

const upload = multer({
  storage: storage,
  limits: {
    fileSize: 1024 * 1024 * 5
  },
  fileFilter: fileFilter
});

require("./imageRoutes.js")(app,upload);
require("./videoRoutes.js")(app);
require("./studyRoutes.js")(app,upload);

//require("./loginRoutes.js")(app);

require("./blogRoutes.js")(app,upload);

require("./prodRoutes.js")(app,upload);
require("./cartRoutes.js")(app);
require("./orderRoutes.js")(app,upload);

require("./likedRoutes.js")(app);
require("./unlikedRoutes.js")(app);
require("./register.js")();


}
