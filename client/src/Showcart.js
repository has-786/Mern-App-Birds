
import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";

class Showcart extends Component{
	constructor(props){
		super(props);
this.state={username:null,path:"http://localhost:5000/",arr:[{prodName:null,quantity:null,price:null,disease:null}],obj:{prodName:'',quantity:null,price:'',disease:''},msg:null,position:null}; 
 this.fun = this.fun.bind(this);
 }
	
componentDidMount()
{
		this.state.username=localStorage.getItem('user');

	if(!this.state.username)alert('Please Login First');
	else {
		var data={name:this.state.username}; //this.setState({ position: 1 });
	fetch('/showCart',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then(response=>{
			return response.json()}).then(
			(body)=>{ if(body.length==0)alert("Cart is empty"); else {this.setState({arr:body});  document.getElementById('show1').style.opacity=1}} ).catch(err=>console.log(err));	
	}
}



render()
{
 return (
 <div>
 <center><h2 >MY CART</h2></center>
<a href='/Payment'><button  id='showcart' class='btn btn-success' >Checkout</button></a>

	
<div id='show1'>
	<section class="features-icons bg-light text-center"  >
    <div id='contain' class="container"   >
      <div class="row" >
		{this.state.arr.map( res=>( 
	    <div class="col-lg-6"  >		<br></br><br></br>
			<center><div class="row" >
				<div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{border:"5px solid red",borderRadius:"10px",backgroundColor:"pink"}} >
		  		<br></br>

							<div class="features-icons-icon d-flex">
				  <div class="col-lg-12"><center><img src={res.img} width="100%" height="200px"/> </center></div>
			</div><br></br><br></br>
				
            <div class="features-icons-icon d-flex" >
<div class="col-lg-3">	<center><button class='btn btn-secondary'>Name</button></center></div><div class="col-lg-9"><center><button class='btn btn-primary'>{res.name}</button></center></div>
			</div><br></br>
			
			 <div class="features-icons-icon d-flex" >
<div class="col-lg-3">	<center><button class='btn btn-secondary'>Species</button></center></div><div class="col-lg-9"><center><button class='btn btn-primary'>{res.species}</button></center></div>
			</div><br></br>
			
			   <div class="features-icons-icon d-flex" >
<div class="col-lg-3">	<button class='btn btn-secondary'>Quantity</button></div><div class="col-lg-9"><center><button class='btn btn-primary'>{res.quantity}</button></center></div>
			</div><br></br>
			
			<div class="features-icons-icon d-flex">
						
		<div class="col-lg-3"><button class='btn btn-secondary'>Price</button></div><div class="col-lg-9"><center><button class='btn btn-success'> Rs.{res.price} </button></center></div>
            </div><br></br>
			
						<div class="features-icons-icon d-flex">
							<div class="col-lg-12">	<button  class='btn btn-warning' id={res._id} onClick={this.fun.bind(this,this.state.username,res._id)} >Remove from Cart</button></div>
							<br></br><br></br><br></br><br></br>
						</div>
						
					</div>
				</div><br></br><br></br><br></br>
			</center></div>	
		))}
		</div>
	 </div>
  </section>
</div> 
	
	
</div>
  )}
  
  fun=(username,id)=>{
	var data={"name":username,"id":id};   //   alert(JSON.stringify(data));
		fetch('/removeFromCart',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{alert(body.msg); if(!body.length)document.getElementById(id).innerHTML='____'; }).catch(err=>console.log(err));
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

export default connect(mapStateToProps, mapDispatchToProps)(Showcart);
//export Showcart;

