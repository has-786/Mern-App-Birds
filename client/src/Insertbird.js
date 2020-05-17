import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";





class Insertbird extends Component{
	constructor(props){
		super(props);  this.state={username:null,amount:0,cause:null,timestamp:null};
	}
	
	componentDidMount(){this.state.username=localStorage.getItem('user'); }

render()
{
 return (
 <div>
  <center><h2 >UPLOAD BIRDS DETAILS</h2></center>

	<center>	<span><br></br><br></br></span>
    <form action="/insertBird" method="post" enctype="multipart/form-data">
	<div><button class='btn btn-primary' >Name</button><input type='text' id='name' name='name'   required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-danger' >Species</button><input type='text' id='species' name='species'   required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger' >Image</button><input type='file' id='image' name='image'   required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger' >Details</button><input type='text' id='details' name='details' style={{height:"300px",width:"300px"}}  required/></div>
		<span><br></br><br></br></span>
	<div>
		<input type="submit" class='btn btn-danger' value="Upload" />
	</div>
	<span><br></br><br></br></span>
	</form>
	</center>
</div>);
}



fun2=()=>{
		//if(!this.state.username){alert('Please Login First');return false;}
		
 var data={name:document.getElementById('name').value,species:document.getElementById('species').value,email:document.getElementById('email').value,
 phone:document.getElementById('phone').value};
	fetch('/inserthospital',{ method:'POST',body:JSON.stringify(data),headers: {"Content-Type": "application/json" } }).then(response=>{
	return response.json()}).then((body)=>{ if(body.msg)alert(body.msg);  }  ).catch(err=>console.log(JSON.stringify(err)));		
     
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


export default connect(mapStateToProps, mapDispatchToProps)(Insertbird);
