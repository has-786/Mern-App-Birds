import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";

let username=null;


class Signup extends Component{
	constructor(props){
		super(props); this.fun.bind(this);
	}
	
render()
{
 return (
 <div style={{width:"100%"}}>
<center><h2 style={{padding:"10px"}}>Sign Up</h2></center>

      <br></br><br></br><br></br><br></br>

			<center>
    <div id='contain'  style={{width:"300px",backgroundColor:"pink",border:"10px solid green",borderRadius:"30px",padding:"20px"}}>
	<br></br><br></br>
		
			<div><input type = "text" name = "name" id='1' placeholder="Username" required/></div><br></br><br></br>
			<div><input type = "text" name = "email" id='2' pattern="[a-zA-Z0-9]+@gmail.com" placeholder="Email" required/></div><br></br><br></br>
			<div><input type = "text" name = "phone" id='3' pattern="[0-9]{10}" placeholder="Phone No." required/></div><br></br><br></br>
			<div><input type = "password" name = "pass" id='4'  placeholder="password" required/></div><br></br><br></br>
			<div><input type = "password" name = "password" id='5'  placeholder="Retypepassword" required/></div><br></br>
			
			<div><button  name = "signup-button"  class='btn btn-primary' value = "sign up" onClick={this.fun.bind(this)}>Sign Up</button></div><br></br><br></br><br></br>		
			
			<div ><a href='/Signin'><button class='btn btn-warning'>Already have an account?</button></a></div><br></br><br></br>		
			<div ><a href='/'><button class='btn btn-success'>Back to Home</button></a></div><br></br>				
	</div>
	</center>
	<br></br>	<br></br>	<br></br>	

 </div>
 
)}



fun=(event)=>{
	event.preventDefault();
	if(document.getElementById('4').value!=document.getElementById('5').value){alert("Password Doesn't Match");return false;}
	if(document.getElementById('1').value.length==0 || document.getElementById('2').value.length==0 || document.getElementById('3').value.length==0 
	|| document.getElementById('5').value.length===0  ){alert('Please Fill The Required Places'); return false;}
	var data={name:document.getElementById('1').value,email:document.getElementById('2').value,phone:document.getElementById('3').value,
	pass:document.getElementById('4').value   };
fetch('/localSignup',{ method:'POST',body:JSON.stringify(data),headers: {"Content-Type": "application/json" } }).then((response)=>{
		return response.json()}).then((body)=>{ if(body.signin==='Signed up successfully'){username=body.username;} alert(body.signin); localStorage.setItem('user',username); 
		
		}).catch(err=>console.log(err));
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

export default connect(mapStateToProps, mapDispatchToProps)(Signup);
//export Showcart;

