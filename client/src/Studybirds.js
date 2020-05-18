import React ,{Component} from 'react';
import { BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";

import {
  // existing imports
  withGoogleMap,
  withScriptjs
} from "react-google-maps";
const MapWrapped = withScriptjs(withGoogleMap(Map));

let username=null;

class  Studybirds extends Component{
constructor(props){ super(props);  this.state={path:"http://localhost:5000/",username:null,arr:[{name:null,species:null,details:null,img:null}],obj:{prodName:null,price:null,disease:null},msg:null}; 
  this.fun = this.fun.bind(this);  
}
componentDidMount()
{ 
	this.state.username=localStorage.getItem('user');
	if(this.state.username)alert("Hi "+this.state.username);
    
	var data={name:this.state.username}; //this.setState({ position: 1 });
	fetch('/showAllBirds',{ method: 'POST',body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then(response=>{
	return response.json()}).then(
 (body)=>{this.setState({arr:body});  
 //this.props.showAllProds(body);               
 document.getElementById('show1').style.opacity=1;}).catch(err=>console.log(err));	
}	
		
		
render()
{
	
 return (
 <div>
 <center><h2 >STUDY THE BIRDS</h2></center>  	
 <div><form onSubmit={this.fun.bind(this)}>
	<center><input type='text'  name='name'  id='1' required/>
				<input type='submit'  value='Search' /></center>
           </form>	<br></br><br></br><br></br>	</div>
<br></br><br></br>
	<div id='show1'>
	<section class="features-icons bg-light text-center"  >
    <div id='contain' class="container"   >
      <div class="row" >
		{this.state.arr.map( res=>( 

	   <div class="col-lg-12" >		<br></br><br></br>
<center>
					 <div class="row" >
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{padding:"15px",border:"5px solid red",borderRadius:"10px",backgroundColor:"lightgreen"}} >
		  		<br></br>

				    <div class="features-icons-icon d-flex" style={{width:"60%"}}>
<div class="col-lg-3" >	<center><button class='btn btn-secondary'>ID</button></center></div><div class="col-lg-9" style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}><center>{res._id}</center></div>
			</div><br></br><br></br>
				
				
				
            <div class="features-icons-icon d-flex"   >
<div class="col-lg-12"><center><img src={res.img} width="400" height="400"/></center></div>
			</div><br></br>
				
            <div class="features-icons-icon d-flex"style={{width:"60%"}} >
<div class="col-lg-3">	<center><button class='btn btn-secondary'>Name</button></center></div><div class="col-lg-9"><center><button class='btn btn-primary'>{res.name}</button></center></div>
			</div><br></br>
			
					
            <div class="features-icons-icon d-flex" style={{width:"60%"}} >
<div class="col-lg-3">	<center><button class='btn btn-secondary'>Species</button></center></div><div class="col-lg-9"><center><button class='btn btn-primary'>{res.species}</button></center></div>
			</div><br></br>
			
							
            <div class="features-icons-icon d-flex" >
	<div class="col-lg-12"><center><p class='jumbotron'  style={{borderRadius:'10px',backgroundColor:'purple',color:"white",fontFamily:"sans-serif-condensed-light",border:'3px solid purple',padding:'5px', fontSize:"18px"}}>{res.details}</p></center></div>
			</div><br></br>
				
			
			</div>
		</div><br></br><br></br><br></br>
	
      </center>  </div>		

				
		))}
		</div></div></section>
	</div> 
		
	
</div>
  )
}
 fun=(event)=>{
	    event.preventDefault(); 
		var data={"name":document.getElementById('1').value};      alert(JSON.stringify(data));
		fetch('/searchBirds',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{ if(!Array.isArray(body)){this.setState({obj:body});document.getElementById('show2').style.opacity=1;} 
           else { this.setState({arr:body});
		    //this.props.searchProds(body);

		   if(!body.length)alert('No result found'); document.getElementById('show1').style.opacity=1;} }).catch(err=>console.log(err));
 
}



}
//export default Medicine;



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

export default connect(mapStateToProps, mapDispatchToProps)(Studybirds);
//export Showcart;
