import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";



class  Image extends Component{
constructor(props){ super(props);  this.state={path:"http://localhost:5000",username:null,arr:[{name:null,tags:null,link1:null,_id:null,likes:null}],msg:null};
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
<section class="features-icons bg-light text-center"  >
    <div id='contain' class="container"   >

		{this.state.arr.map( res=>( 
		<div style={{width:"100%"}}>
			<div class="row">
				            <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{width:"100%",backgroundColor:"pink",borderRadius:'10px',border:"5px solid green"}} >

			<div class="col-lg-6">
						 <center>
		  	 <div class="row">
				<div class="col-lg-12">	<button class='btn btn-secondary'>ID</button><span style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}>{res._id}</span></div>
			</div>	
			<br></br><br></br>
			<div class="row">
<div class="col-lg-12"><center><p style={{backgroundColor:"purple",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px",color:"white"}}><button style={{float:'left'}} class='btn btn-sm btn-primary'>Name</button>{res.name}</p></center></div>
			</div>
						<br></br><br></br>

			<div class="row">
<div class="col-lg-12"><center><p style={{backgroundColor:"green",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px",color:"white"}}><button style={{float:'left'}}  class='btn btn-sm btn-primary'>Tags</button>{res.tags}</p></center></div>
			</div>
			<br></br><br></br>
		
     		<div class="row">
	     	  <div class="col-lg-12"><button style={{float:'left'}} class='btn btn-primary'>Likes</button><center><button class='btn btn-warning' > {res.likes} </button></center></div>
            </div>
						<br></br><br></br>

			
			<div class="row">
		      <div class="col-lg-12"><center><button  class='btn btn-secondary' id={res._id} onClick={this.fun.bind(this,res._id,res.name)} style={{marginRight:"15px"}}>Like</button></center></div>
			</div>
						<br></br><br></br>

			
				</center>
	 </div>
	<div class="col-lg-6">
	<center>

			<div class="row">
		       <div class="col-lg-12"><img  width="100%"  height="100%" src={res.img} /></div>
			</div>
			
			
			<br></br>
			
    </center>	
	    </div> 
	
	</div>
		<br></br><br></br><br></br>
		</div>
	</div>
			
		))}
			</div> 
</section>
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

