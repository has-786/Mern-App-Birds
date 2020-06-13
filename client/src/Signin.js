import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";
let username=null;


class Signin extends Component{
	constructor(props){
		super(props); username=null;
	}
	
	
	componentDidMount()
	{
			
	if(username)alert("Hi "+username);
	}
	
	fun=(event)=>{
		event.preventDefault();
		//alert(username);
		if(document.getElementById('1').value.length==0 || document.getElementById('2').value.length==0){alert('Please Fill The Required Places'); return false;}
		
		
		
		var data={name:document.getElementById('1').value,pass:document.getElementById('2').value };
		fetch('/localSignin',{ method:'POST',body:JSON.stringify(data),headers: {"Content-Type": "application/json" } }).then((response)=>{
		return response.json()}).then((body)=>{ if(body.signin==='Signed in successfully')username=body.username; alert(body.signin); localStorage.setItem('user',username);
		
		}).catch(err=>console.log(err));
		
	  
		
	}
	
render()
{
 return (
 <div>
 
 			<center><h2 style={{padding:"10px"}}>Sign In</h2></center>
			     <br></br><br></br><br></br><br></br>

			<center>
		
    <div id='contain'  style={{width:"300px",backgroundColor:"pink",border:"10px solid green",borderRadius:"30px",padding:"20px"}}>
	<br></br><br></br>
				<div><input type = "text" name = "name" id='1' placeholder="Username" required/></div><br></br><br></br>
				<div><input type = "password" name = "pass" id='2'  placeholder="password" required/></div><br></br>
				<div><button name = "signup-button" onClick={this.fun.bind(this)} class='btn btn-primary' value = "sign in">Sign In</button></div><br></br><br></br><br></br>
				
				<div><a href='/Forgotpassword' ><button class='btn btn-danger btn-sm'>forgot password?</button></a></div><br></br>

				<div><a href='/Signup'><button class='btn btn-warning'>Don't have an account?</button></a></div><br></br><br></br><br></br>
				<div><a href='/'><button class='btn btn-success'>Back to Home</button></a></div><br></br>
	  
	</div>
</center>
				 				 
		

		</div> 
		
 
)}

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

export default connect(mapStateToProps, mapDispatchToProps)(Signin);