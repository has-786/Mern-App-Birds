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

render()
{
return (<div style={{width:"100%"}}>

 <center> <h2 style={{backgroundColor:"lightgreen",fontSize:"25pt",fontStyle:'bold',color:"purple",padding:"20px",marginTop:"0%"}}>
 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSCisshD_AFuholwmD4pRX45UU4-GB25YDQyKlyr9P_5hlifqcI&usqp=CA" class='img img-circle'
 style={{float:"left",marginLeft:"0%",width:"150px" ,height:"100%"}}/>
 <span style={{fontFamily:'Dancing Script'}}>Welcome to AliBhai Birds</span><br></br><button class='btn btn-danger' >A Better Place to Learn and Love The Birds </button></h2>
 <div ><img id="MainImage" src="data:image/jpeg;base64,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"   height="300px" />
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