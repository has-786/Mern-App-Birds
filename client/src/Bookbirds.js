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

class  Bookbirds extends Component{
constructor(props){ super(props);  this.state={username:null,arr:[{name:null,quantity:null,price:null,species:null,img:null}],obj:{prodName:null,price:null,disease:null},msg:null}; 
 this.fun = this.fun.bind(this);  this.fun1 = this.fun1.bind(this);  
}
componentDidMount()
{ 
	this.state.username=localStorage.getItem('user');
	if(this.state.username)alert("Hi "+this.state.username);
    
	var data={name:this.state.username}; //this.setState({ position: 1 });
	fetch('/showAllProd',{ method: 'POST',body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then(response=>{
	return response.json()}).then(
 (body)=>{  this.setState({arr:body});  
 //alert(JSON.stringify(body));
 //this.props.showAllProds(body);               
 document.getElementById('show1').style.opacity=1;}).catch(err=>console.log(err));	
}	
		
		
render()
{
	
 return (
 <div style={{width:"100%"}}>
 <center><h2 style={{"width":"100%"}}>BUY BIRDS</h2></center>  
<div class='row'>
<div class='col-lg-8'>
<form onSubmit={this.fun}><button class='btn btn-sm btn-primary'>Search Birds </button><input type='text'  name='name'  id='1' required/><input type='submit'  value='Search' /></form></div>
<div class='col-lg-4'> <a href="/Showcart"><button  id='showcart' class='btn btn-success' >Show Cart</button></a>   </div>
</div>					
	<div id='show1'>
	<section class="features-icons bg-light text-center"  >
    <div id='contain' class="container"   >
		{this.state.arr.map( res=>( 
		<div style={{width:"100%"}}>
      <div class="row" >
	            <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{border:"5px solid red",borderRadius:"10px",backgroundColor:"pink"}} >

	    <div class="col-lg-6"  >		<br></br><br></br>
<center>
					 <div class="row" >	
<div class="col-lg-12">	<center><button class='btn btn-secondary'>ID</button><p  style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}>{res._id}</p></center></div>
			         </div>
			<br></br><br></br>
					 <div class="row" >	
<div class="col-lg-12"><p style={{backgroundColor:"green",color:"white",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px"}}>
					<button class="btn btn-sm btn-primary" style={{float:"left"}}>Name:</button>&nbsp; &nbsp; &nbsp; 
					{res.name} </p></div>
			      </div>
			<br></br>
			
					 <div class="row" >	
<div class="col-lg-12"><p style={{backgroundColor:"green",color:"white",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px"}}>
					<button class="btn btn-sm btn-primary" style={{float:"left"}}>Species:</button>&nbsp; &nbsp; &nbsp; 
					{res.species}</p></div>
			</div><br></br>
			
					 <div class="row" >	
<div class="col-lg-12">	<p style={{backgroundColor:"green",color:"white",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px"}}>
					<button class="btn btn-sm btn-primary" style={{float:"left"}}>Quantity:</button>&nbsp; &nbsp; &nbsp; 
					{res.quantity} </p></div>
			</div><br></br>
			
					 <div class="row" >	
						
		<div class="col-lg-12"><p style={{backgroundColor:"green",color:"white",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px"}}>
					<button class="btn btn-sm btn-primary" style={{float:"left"}}>Price:</button>&nbsp; &nbsp; &nbsp; 
					 Rs.&nbsp;{res.price} </p></div>
            </div><br></br>
			
					 <div class="row" >	
		 <div class="col-lg-12">	<button  class='btn btn-danger' id={res._id} onClick={this.fun1.bind(this,this.state.username,res._id)} style={{marginRight:"15px"}}>Add To Cart</button></div>
		 <br></br><br></br><br></br>
			    </div>	
	</center>
</div>
	<div class="col-lg-6">	
				 <center><img src={res.img} width="100%" height="100%"/></center>
	</div>
	<br></br><br></br>
		</div>
		<br></br><br></br><br></br>
	
        </div>		
		</div>		
		))}
		</div></section>
	</div> 
		
	
</div>
  )
}
 fun=(event)=>{
	    event.preventDefault(); 
		var data={"name":document.getElementById('1').value};      alert(JSON.stringify(data));
		fetch('/showProduct',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{ if(!Array.isArray(body)){this.setState({obj:body});document.getElementById('show2').style.opacity=1;} 
           else { this.setState({arr:body});
		   // this.props.searchProds(body);

		   if(!body.length)alert('No result found'); document.getElementById('show1').style.opacity=1;} }).catch(err=>console.log(err));
 
}

fun1=(username,id)=>{
	
if(document.getElementById(id).innerHTML==='Add To Cart'){
	if(!this.state.username){alert('Please Login First');return false;}
	var data={"name":username,"id":id};      alert(JSON.stringify(data));
		fetch('/addToCart',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{alert(body.msg);   if(body.msg=='Added to cart')document.getElementById(id).innerHTML='Remove From Cart';  }).catch(err=>console.log(err));
}

else 
{
	var data={"name":username,"id":id};      alert(JSON.stringify(data));
		fetch('/removeFromCart',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
(body)=>{alert(body.msg);document.getElementById(id).innerHTML='Add To Cart';}).catch(err=>console.log(err));                                                                                                    
}
	
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

export default connect(mapStateToProps, mapDispatchToProps)(Bookbirds);
//export Showcart;
