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
constructor(props){ super(props);  this.state={path:"http://localhost:5000",username:null,arr:[{name:null,species:null,details:null,img:null}],obj:{prodName:null,price:null,disease:null},msg:null}; 
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
 <div style={{width:"100%"}}>
 <center ><h2 style={{width:"100%"}}>STUDY THE BIRDS</h2></center>  	
 <div><form onSubmit={this.fun.bind(this)}>
	<center><input type='text'  name='name'  id='1' required/>
				<input type='submit'  value='Search' /></center>
           </form>	<br></br><br></br><br></br>	</div>
<br></br><br></br>
	<div id='show1'>
	<section class="features-icons bg-light text-center"  >
    <div id='contain' class="container"   >
		{this.state.arr.map( (res,ind)=>(   

<div style={{width:"100%"}}>
		
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{border:"5px solid white",borderRadius:"10px",backgroundColor:"pink"}} >
		  						<br></br>		

				<div  class="row">
							<div class="col-lg-12">
								<button class='btn btn-secondary'>ID</button>
								<span style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}>{res._id} </span>
							</div>
				</div>
						<br></br>						<br></br>

			
				<div class="row" >
					<div class="col-lg-12" style={{width:"100%"}}><p style={{backgroundColor:"green",color:"white",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px"}}>
					<button class="btn btn-sm btn-primary" style={{float:"left"}}>Name:</button>&nbsp; &nbsp; &nbsp; 
					 {res.name} </p></div> 
				</div>
				
				<div class="row" >
					<div class="col-lg-12" style={{width:"100%"}}><p style={{backgroundColor:"purple",color:"white",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px"}}>
					<button class="btn btn-sm btn-primary" style={{float:"left"}}>Species:</button>&nbsp; &nbsp; &nbsp; 
					 {res.species}</p></div> 
				</div>
			<div class="row" >
			 <div class="col-lg-6">
					<div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3"  >
						
							<center><img src={res.img} alt='not found' width={"100%"} height={"100%"} /></center>
					</div>	
	         </div>
			  <div class="col-lg-6"  >		
					<center>
						<div class="row" >
					    	<div class="features-icons-icon d-flex">
					 	     	<div class="col-lg-12">
								 <center>
								 <p class='junbotron' id={res._id+'details'} style={{borderRadius:'10px',backgroundColor:'white',fontFamily:"Sans-serif",border:'3px solid purple',padding:'5px', fontSize:"20px"}}>
		                                {((res.details!=null)?res.details.substring(0,500):res.details)}
							   	</p>		<button id={res._id+'change'} class='btn btn--sm btn-success' onClick={this.changeDetails.bind(this,res._id,ind)}>Read More</button>

								</center>
							   </div>
					        </div><br></br><br></br>
				        </div>
                   </center>
				</div>	
		   </div>		
   	   </div>	
	   
		
     </div>	


		
		))}
		</div>
		</section>
	</div> 
		
	
</div>
  )
}

changeDetails=(id,ind)=>
{
	var but=document.getElementById(id+'change');
	if(but.innerHTML==='Read More')
	{		document.getElementById(id+'details').innerHTML=this.state.arr[ind].details;
			but.innerHTML='Read Less';
	}
	else
	{
		document.getElementById(id+'details').innerHTML=this.state.arr[ind].details.substring(0,500);
			but.innerHTML='Read More';
	}		
	
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
