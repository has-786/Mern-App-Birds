import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";



class  Likedvideos extends Component{
constructor(props){ super(props);  this.state={username:null,arr:[{name:null,tags:null,link1:null,_id:null,likes:null}],msg:null};
this.fun.bind(this); 
}
componentDidMount()
{ 
		this.state.username=localStorage.getItem('user');
		
	var data={name:this.state.username};
	fetch('/likedVideos',{ method: 'POST',body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then(response=>{
	return response.json()}).then(
 (body)=>{this.setState({arr:body});  document.getElementById('show1').style.opacity=1;}).catch(err=>console.log(err));	
			
}	
render()
{
	
 return (
 <div style={{width:"100%"}}>
 <center><h2 style={{width:"100%"}}>LIKED&nbsp;&nbsp; VIDEOS</h2></center>   

	<div id='show1'>		

		{this.state.arr.map( res=>( <div class="col-lg-4"  >		<br></br><br></br>

					 <div class="row">
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{padding:"20px",backgroundColor:"pink",borderRadius:'10px',border:"5px solid green"}} >
		  		<br></br>
			<div class="features-icons-icon d-flex" >
				<div class="col-lg-2">	<button class='btn btn-info'>ID</button></div>
				<div class="col-lg-10"><center><span style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}>{res._id}</span></center></div>
			</div><br></br>
            <div class="features-icons-icon d-flex" >
<div class="col-lg-2">	<button class='btn btn-info'>Name</button></div><div class="col-lg-10"><center><button class='btn btn-primary'>{res.name}</button></center></div>
			</div><br></br>
			<div class="features-icons-icon d-flex">
						
		<div class="col-lg-2"><button class='btn btn-info'>Tags</button></div><div class="col-lg-10"><center><button class='btn btn-success'> {res.tags} </button></center></div>
            </div><br></br>
			<div class="features-icons-icon d-flex">
				  <div class="col-lg-12"><iframe allowfullscreen="allowfullscreen" width="100%"  height="400" src={res.link1}></iframe></div>
			</div><br></br>
		<div class="features-icons-icon d-flex">		
	     	<div class="col-lg-4"><button class='btn btn-primary'>Likes</button></div><div class="col-lg-8"><button class='btn btn-warning' > {res.likes} </button></div>
            </div><br></br>
			<div class="features-icons-icon d-flex">
		 <div class="col-lg-12"><center><button  class='btn btn-secondary' id={res._id} onClick={this.fun.bind(this,res._id,this.state.username)} style={{marginRight:"15px"}}>Unlike</button></center></div>
			</div><br></br>
			
		</div>	
		<br></br><br></br><br></br>
	
        </div></div>))}
	</div> 
	
</div>
  )
}


 fun=(id,name)=>{
		var data={"id":id,"name":name};     
		if(!name){alert("Please Login First"); return false;}
		fetch('/unlikeVideo',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{  if(body.msg)alert(body.msg); if(body.msg==='Video was unliked')document.getElementById(id).style.display='None';}).catch(err=>console.log(err));
 
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

export default connect(mapStateToProps, mapDispatchToProps)(Likedvideos);

