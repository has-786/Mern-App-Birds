import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";


class Insertblog extends Component{
	constructor(props){
		super(props);  this.state={username:null,amount:0,cause:null,timestamp:null};
	}
	
	componentDidMount(){this.state.username=localStorage.getItem('user'); 
 
	
	}

render()
{
 return (
 <div>
  <center><h2 >UPLOAD YOUR BLOG</h2></center>

	<center>	<span><br></br><br></br></span>
	<div><button class='btn btn-primary' >Image </button><input type='file' id='img' name='image'   required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-danger' >Mention Topic</button><input type='text' id='topic' name='topic'   required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger' >Write Here</button><input type='text' id='data' name='data'   required/></div>
		<span><br></br><br></br></span>
	<div>
		<button class='btn btn-danger' onClick={this.fun2.bind(this)}>Upload</button>
	</div>
	<span><br></br><br></br></span>
	</center>
</div>);
}



fun2=(event)=>{
	//	if(!this.state.username){alert('Please Login First');return false;}
		event.preventDefault();
	var tempDate = new Date();
  var date = tempDate.getFullYear() + '-' + (tempDate.getMonth()+1) + '-' + tempDate.getDate() +' '+ tempDate.getHours()+':'+ tempDate.getMinutes()+':'+ tempDate.getSeconds();
  const currDate = date;
  
  var f=new FormData();
		f.append('data',document.getElementById('data').value);
		f.append('topic',document.getElementById('topic').value);
		f.append('timestamp',currDate);

		var myfile=document.getElementById('img').files[0];
		f.append('image',myfile); 
		
	fetch('/insertblog',{ method:'POST',body:f }).then(response=>{
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

export default connect(mapStateToProps, mapDispatchToProps)(Insertblog);
//export Showcart;



//export default Home;