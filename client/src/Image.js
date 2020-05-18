import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";



class  Image extends Component{
constructor(props){ super(props);  this.state={path:"http://localhost:5000/",username:null,arr:[{name:null,tags:null,link1:null,_id:null,likes:null}],msg:null};
this.fun.bind(this); 
}
componentDidMount()
{ 
		this.state.username=localStorage.getItem('user');
	var data={name:null};
	fetch('/showAllImages',{ method: 'POST',body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then(response=>{
	return response.json()}).then(
 (body)=>{this.setState({arr:body});  document.getElementById('show1').style.opacity=1;}).catch(err=>console.log(err));	
			
}	
render()
{
	
 return (
 <div style={{width:"100%"}}>
 <center><h2 style={{width:"100%"}}>GALLERY&nbsp;&nbsp; IMAGES</h2></center>   
			<center><input type='text'  name='name'  id='1' required/>
			<button onClick={this.fun1.bind(this)}>Search</button></center>
<br></br><br></br><br></br><br></br>
	<div id='show1'>		

		{this.state.arr.map( res=>( <div class="col-lg-12"  >		<br></br><br></br>
<center>
					 <div class="row">
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{backgroundColor:"pink",borderRadius:'10px',border:"5px solid green"}} >
		  		<br></br>
			<div class="features-icons-icon d-flex" style={{width:"60%"}}>
				<div class="col-lg-2">	<button class='btn btn-info'>ID</button></div>
				<div class="col-lg-10"><center><span style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}>{res._id}</span></center></div>
			</div><br></br>
            <div class="features-icons-icon d-flex" style={{width:"60%"}}>
<div class="col-lg-2">	<button class='btn btn-info'>Name</button></div><div class="col-lg-10"><center><button class='btn btn-primary'>{res.name}</button></center></div>
			</div><br></br>
			<div class="features-icons-icon d-flex" style={{width:"60%"}}>
						
		<div class="col-lg-2"><button class='btn btn-info'>Tags</button></div><div class="col-lg-10"><center><button class='btn btn-success'> {res.tags} </button></center></div>
            </div><br></br>
			<div class="features-icons-icon d-flex" style={{width:"60%"}}>
		<div class="col-lg-12"><img  width="400"  height="400" src={res.img} /></div>
			</div><br></br>
		<div class="features-icons-icon d-flex" style={{width:"60%"}}>		
	     	<div class="col-lg-4"><button class='btn btn-primary'>Likes</button></div><div class="col-lg-8"><button class='btn btn-warning' > {res.likes} </button></div>
            </div><br></br>
			<div class="features-icons-icon d-flex" style={{width:"60%"}}>
		 <div class="col-lg-12"><center><button  class='btn btn-secondary' id={res._id} onClick={this.fun.bind(this,res._id,res.name)} style={{marginRight:"15px"}}>Like</button></center></div>
			</div><br></br>
			
		</div>	
		<br></br><br></br><br></br>
	
        </div>
		</center></div>))}
	</div> 
	
</div>
  )
}


 fun=(id,name)=>{
		var data={"id":id,"name":this.state.username};     
		if(!this.state.username){alert("Please Login First"); return false;}
		fetch('/likeImage',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{  if(body.msg)alert(body.msg); }).catch(err=>console.log(err));
 
    }

 fun1=(event)=>{
		var data={"name":document.getElementById('1').value};    
alert(JSON.stringify(data));		
		fetch('/searchImages',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{  this.setState({arr:body}); }).catch(err=>console.log(err));
 
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

export default connect(mapStateToProps, mapDispatchToProps)(Image);

