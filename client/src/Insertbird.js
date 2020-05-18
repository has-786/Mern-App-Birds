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
	<div><button class='btn btn-primary' >Name</button><input type='text' id='name' name='name'   required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-danger' >Species</button><input type='text' id='species' name='species'   required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger' >Image</button><input type='file' id='image' name='image'   required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger' >Details</button><input type='text' id='details' name='details' style={{height:"300px",width:"300px"}}  required/></div>
		<span><br></br><br></br></span>
	<div>
		<div><button onClick={this.fun2.bind(this)} >Upload</button></div>
	</div>
	<span><br></br><br></br></span>
	</center>
</div>);
}



fun2=(event)=>{
		//if(!this.state.username){alert('Please Login First');return false;}
		event.preventDefault();
			var f=new FormData();
		f.append('name',document.getElementById('name').value);
		f.append('species',document.getElementById('species').value);
		f.append('details',document.getElementById('details').value);


		var myfile=document.getElementById('image').files[0];
		f.append('image',myfile); 				alert("Please Wait!! It may take some time");
			
	
	fetch('https://alibahadur.000webhostapp.com/insertBird.php',{ method:'POST',body:f }).then(response=>{

	return response.json()}).then((body)=>{ alert(JSON.stringify(body[0])) 
	
	var data={name:document.getElementById('name').value,species:document.getElementById('species').value,
	details:document.getElementById('details').value,img:'https://alibahadur.000webhostapp.com/uploads/'+myfile.name};
	
	fetch('/insertBird',{ method:'POST',body:JSON.stringify(data),headers: {"Content-Type": "application/json" }  }).then(response=>{
	return response.json()}).then((body)=>{ console.log(body); } ).catch(err=>alert(JSON.stringify(err)));	

	
	}  ).catch(err=>alert(JSON.stringify(err)));	
     
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
