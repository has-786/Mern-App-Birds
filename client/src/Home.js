import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";

let username=null,redir=false;


class Home extends Component{
	constructor(props){
		super(props); this.state={username:null}
	}


 signout=(event)=>{
	 event.preventDefault();
	 alert('Signed Out Successfully');
	 	localStorage.removeItem('user');

	 this.componentDidMount();
	 redir=true;  
}

componentDidMount()
{
	
	this.state.username=localStorage.getItem('user');
	if(this.state.username)alert("Hi "+this.state.username);
	if(this.state.username && this.state.username==='admin123'){ document.getElementById('admin1').style.display='block';document.getElementById('admin2').style.display='block';}
username=this.state.username;
	 if(this.state.username)
	 {
		 document.getElementById('login1').style.display='block';document.getElementById('login').style.display='None';
		 		document.getElementById('profile').style.display='block';  
	 }
	 else 
	 {
		 document.getElementById('login').style.display='block';document.getElementById('login1').style.display='None';
	 }
		 
  
}	

//
render()
{
return (<div style={{width:"100%"}}>

 <center style={{width="100%"}}> <h2 style={{backgroundColor:"lightgreen",fontSize:"25pt",fontStyle:'bold',color:"purple",padding:"20px",marginTop:"0%"}}>
 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSCisshD_AFuholwmD4pRX45UU4-GB25YDQyKlyr9P_5hlifqcI&usqp=CA" class='img img-circle'
 style={{float:"left",marginLeft:"0%",width:"150px" ,height:"100%"}}/>
 <span style={{fontFamily:'Dancing Script'}}>Welcome to AliBhai Birds</span><br></br><button class='btn btn-danger' >A Better Place to Learn and Love The Birds </button></h2>
<div style={{width:"100%"}}><img id="MainImage" src="data:image/jpeg;base64,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" style={{height:"300px"}} />
	  </div></center>
	  <br></br><br></br>

<span id='link' >
<button id='login' class='btn btn-primary' id='login1' style={{position:"relative"}} onClick={this.signout.bind(this)}>Logout</button>
<a  href='/Signin' ><button id='login' style={{position:"relative"}}  class='btn btn-primary btn-sm'>Login</button></a>
<br></br>
<a href='/Insert'><button class='btn btn-success' id='admin1' style={{display:'None'}}>Insert</button></a><br></br>
<a href='/Delete'><button class='btn btn-danger' id='admin2' style={{display:'None'}}>Delete</button></a>

</span>	
		
<div id='profile' style={{display:"None"}}>
 <i class='fa fa-male' id="male" style={{float:"left",position:"absolute",color:"green",marginTop:"-60px",marginLeft:"10px",fontSize:"50px"}}></i> <a class='btn btn-primary' 
style={{marginTop:"-10px"}} href="/Profile" >My Profile</a>   

</div> 

 <br></br>
  <section class="features-icons bg-light text-center">
    <div id='contain' class="container" >
      <div class="row">
        <div class="col-lg-4" style={{padding:"50px"}}>
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
<i class='fas fa-dove' style={{fontSize:"40px",color:"green"}}></i>            </div>
            <h3 ><a href="/Studybirds">Study About Birds</a></h3>
            <p class="lead mb-0" style={{fontWeight:"bold"}} >Study About Various Types of Birds Here</p>
          </div>
        </div>
		
		<div class="col-lg-4" style={{padding:"50px"}}>
          <div class="features-icons-item mx-auto mb-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
			<i class='fa fa-money' style={{fontSize:"40px",color:"grey"}}></i>

</div>
            <h3 ><a href='/Bookbirds'>Buy Birds</a></h3>
            <p class="lead mb-0" style={{fontWeight:"bold"}}>Buy Your Favourite Birds Online</p>
          </div>
        </div>
		
        <div class="col-lg-4" style={{padding:"50px"}}>
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
<i class='fa fa-photo'  style={{fontSize:"40px",color:"purple"}}></i>

            </div>
            <h3 ><a href='/Image'>Watch Gallery Images</a> </h3>
            <p class="lead mb-0" style={{fontWeight:"bold"}}>Enjoy Some Awesome Pictures In My gallery</p>
          </div>
        </div>
        
		
      </div>
	  <div class="row">

<div class="col-lg-4" style={{padding:"50px"}}>
          <div class="features-icons-item mx-auto mb-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
			<i class='fa fa-video' style={{fontSize:"40px",color:"red"}}></i>

</div>
            <h3 ><a href='/Video'>Watch Gallery Videos</a></h3>
            <p class="lead mb-0" style={{fontWeight:"bold"}}>Enjoy Some Wonderful Scenes</p>
          </div>
        </div>
<div class="col-lg-4" style={{padding:"50px"}}>
          <div class="features-icons-item mx-auto mb-0 mb-lg-3">
            <div class="features-icons-icon d-flex">
			<i class='fa fa-file' style={{fontSize:"40px",color:"grey"}}></i>

</div>
            <h3 ><a href='/Showblog'>Blogs</a></h3>
            <p class="lead mb-0" style={{fontWeight:"bold"}}>Check Out Daily Updates about Birds With Me</p>
          </div>
        </div>
	
      </div>

	  
	  </div>
  </section>

  
 <span><br></br><br></br><br></br></span>
    <div class="container-fluid p-0" >
      
        <div class="col-md-6 order-lg-1 my-auto showcase-text">
          <h2 >About AliBhai</h2>
          <p class="lead mb-0">AliBhai(Syed Ali Bahadur) is a Professional Bird Breeder.He has very good experience of maintaining the living 
and food of various kinds of birds.You can Study about birds as well as buy any bird you like.And Last but not least dont forger to check Gallery and 
Blogs.You will surely enjoy them.</p>
        </div> <div class="col-md-6 order-lg-2 text-white showcase-img">
		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSCisshD_AFuholwmD4pRX45UU4-GB25YDQyKlyr9P_5hlifqcI&usqp=CAU" class= "img-fluid rounded-circle mb-3" width="500px" height="250px"/>
		</div>
      </div>

<br></br>
<div class="row">
<div class='col-lg-6'  style={{padding:"50px"}}>
 <section class="call-to-action text-white text-center" >
    <div class="container" style={{float:"right", marginRight:"0%", marginTop:"0%"}}>
	<span><br></br></span>
	
	<div class='row'>
         <div class='col-lg-12' style={{padding:"20px"}}><center><b class="btn btn-primary">Contact Details:</b></center></div>   
		 <div class='col-lg-12' style={{padding:"20px"}}><center><b class="btn btn-danger">Email:</b><b class="btn">syedali9432@gmail.com</b></center></div>	
		 <div  class='col-lg-12'style={{marginRight:"20%",padding:"20px"}}><center><b class="btn btn-success" > Phone:</b><b  class="btn">8670450369</b></center></div>	
	     <div  class='col-lg-12'style={{padding:"20px"}}><center><b class="btn btn-warning">Address:</b><b class="btn btn-default">Murshidabad,West Bengal,India</b></center></div>
	 </div>   
	</div>

	<span><br></br></span>
  </section>
	<span><br></br></span>
</div>
<div class='col-lg-6'  style={{padding:"50px"}}>
<center><div class="container" >
     	  <b class="btn btn-info">VISIT US AT SOCIAL MEDIA :</b>

          <ul class="list-inline mb-0">
            <li class="list-inline-item mr-3">
              <a href="#">
                <i class="fab fa-facebook fa-2x fa-fw"></i>
              </a>
            </li>
           
            <li class="list-inline-item">
              <a href="#">
                <i class="fab fa-instagram fa-2x fa-fw"></i>
              </a>
            </li>
            
            <li class="list-inline-item">
              <a href="#">
                <i  class="fab fa-youtube fa-2x fa-fw"></i>
              </a>
            </li>
          </ul>
    </div>
	</center>
</div>
</div>
</div>)
}


	
}


const mapStateToProps = (state) => {
  return {
      prod:state.prod
  };
};

const mapDispatchToProps = (dispatch) => {
    return {
        showAllProds: (arr) => {
            dispatch({
                type: "SHOW_ALL_PROD",
                payload: arr
            });
        },
		searchProds: (arr) => {
            dispatch({
                type: "SEARCH_PROD",
                payload: arr
            });
        }
    };
};

//export default connect(mapStateToProps, mapDispatchToProps)(App);

export default connect(mapStateToProps, mapDispatchToProps)(Home);
//export Showcart;



//export default Home;