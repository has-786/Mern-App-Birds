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
		var tempDate = new Date();
  var date = tempDate.getFullYear() + '-' + (tempDate.getMonth()+1) + '-' + tempDate.getDate() +' '+ tempDate.getHours()+':'+ tempDate.getMinutes()+':'+ tempDate.getSeconds();
  const currDate = date;
  document.getElementById('timestamp').value=currDate;
	
	}

render()
{
 return (
 <div>
  <center><h2 >UPLOAD YOUR BLOG</h2></center>

	<center>	<span><br></br><br></br></span>
    <form action="/insertblog" method="post" enctype="multipart/form-data" >
	<div><button class='btn btn-primary' >Image </button><input type='file' id='img' name='image'   required/></div>
	<span><br></br><br></br></span>
	<div><button class='btn btn-danger' >Mention Topic</button><input type='text' id='topic' name='topic'   required/></div>
		<span><br></br><br></br></span>
		<div><button class='btn btn-danger' >Write Here</button><input type='text' id='data' name='data'   required/></div>
		<span><br></br><br></br></span>
		<div style={{display:'none'}}><input type='text' id='timestamp' name='timestamp'   required/></div>
		<span><br></br><br></br></span>
	<div>
		<button class='btn btn-danger' >Upload</button>
	</div>
	<span><br></br><br></br></span>
	</form>
	</center>
</div>);
}



fun2=()=>{
		if(!this.state.username){alert('Please Login First');return false;}

	var tempDate = new Date();
  var date = tempDate.getFullYear() + '-' + (tempDate.getMonth()+1) + '-' + tempDate.getDate() +' '+ tempDate.getHours()+':'+ tempDate.getMinutes()+':'+ tempDate.getSeconds();
  const currDate = date;
 var data={img:document.getElementById('img').value,topic:document.getElementById('topic').value,data:document.getElementById('data').value,
 timestamp:currDate};
	fetch('/insertblog',{ method:'POST',body:JSON.stringify(data),headers: {"Content-Type": "application/json" } }).then(response=>{
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