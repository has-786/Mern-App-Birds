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
		f.append('image',myfile); 
		
	fetch('/insertBird',{ method:'POST',body:f }).then(response=>{
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
