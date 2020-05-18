import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";




class Insertproduct extends Component{
	constructor(props){
		super(props);  this.state={username:null,amount:0,cause:null,timestamp:null};
	}
	
	componentDidMount(){this.state.username=localStorage.getItem('user'); }

render()
{
 return (
 <div>
  <center><h2 >UPLOAD BIRDS TO SELL</h2></center>

	<center>	<span><br></br><br></br></span>
	<div><button class='btn btn-primary' >Name</button><input type='text' id='name' name='name'  required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-primary' >Species</button><input type='text' id='species' name='species'  required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-danger' >Quantity</button><input type='text' id='quantity' name='quantity'  required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger'>Price</button><input type='text' id='price' name='price'  required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger' >Image</button><input type='file' id='image' name='image'   required/></div>
		<span><br></br><br></br></span>
	<div>
		<button class='btn btn-danger'  onClick={this.fun2.bind(this)}>Upload</button>
	</div>
	<span><br></br><br></br></span>
	</center>
</div>);
}



fun2=(event)=>{
	event.preventDefault();
	var f=new FormData();
		f.append('name',document.getElementById('name').value);
		f.append('species',document.getElementById('species').value);
		f.append('quantity',document.getElementById('quantity').value);
		f.append('price',document.getElementById('price').value);


		var myfile=document.getElementById('image').files[0];
		f.append('image',myfile); 
	fetch('/insertProduct',{ method:'POST',body:f }).then(response=>{
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

//export default connect(mapStateToProps, mapDispatchToProps)(App);

export default connect(mapStateToProps, mapDispatchToProps)(Insertproduct);
//export Showcart;



//export default Home;