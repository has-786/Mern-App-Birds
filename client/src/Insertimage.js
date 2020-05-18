import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";





class Insertimage extends Component{
	constructor(props){
		super(props);  this.state={username:null,amount:0,cause:null,timestamp:null};
	}
	
	componentDidMount(){this.state.username=localStorage.getItem('user'); }
//method="post" action="/insertImage"  enctype="multipart/form-data"
//		<input type='submit' class='btn btn-danger' value="Upload" />

render()
{
 return (
 <div>
  <center><h2 >UPLOAD GALLERY IMAGE</h2></center>
	<center>	<span><br></br><br></br></span>
	<div><button class='btn btn-primary' >Name</button><input type='text' id='name' name='name'   required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-primary' >Tags</button><input type='text' id='tags' name='tags'   required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-danger' >Image</button><input type='file' id='img' name='image'    required/></div>
		<div><button class='btn btn-danger' onClick={this.fun2.bind(this)}>Upload</button></div>

		<span><br></br><br></br></span>

	<div>
	</div>
	<span><br></br><br></br></span>
	</center>
</div>);
}



fun2=(event)=>{
			event.preventDefault();
		//if(!this.state.username){alert('Please Login First');return false;}
		var f=new FormData();
		f.append('name',document.getElementById('name').value);
		f.append('tags',document.getElementById('tags').value);

		var myfile=document.getElementById('img').files[0];
f.append('image',myfile);   
				 		//alert(f.getAll());
alert("Please Wait!! It may take some time");
			
	fetch('https://alibahadur.000webhostapp.com/insertImage.php',{ method:'POST',body:f }).then(response=>{

	return response.json()}).then((body)=>{ alert(JSON.stringify(body[0])) 
	
	var data={name:document.getElementById('name').value,tags:document.getElementById('tags').value,
	img:'https://alibahadur.000webhostapp.com/uploads/'+myfile.name};
	
	fetch('/insertImage',{ method:'POST',body:JSON.stringify(data),headers: {"Content-Type": "application/json" }  }).then(response=>{
	return response.json()}).then((body)=>{console.log(body); } ).catch(err=>alert(JSON.stringify(err)));	

	
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

//export default connect(mapStateToProps, mapDispatchToProps)(App);

export default connect(mapStateToProps, mapDispatchToProps)(Insertimage);
