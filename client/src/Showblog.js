import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";



class Showblog extends Component{
	constructor(props)
	{
		super(props);
		this.state={username:null,arr:[{_id:null,img:null,topic:null,data:null,timestamp:null }]}; 
	}
	
componentDidMount()
{
	this.state.username=localStorage.getItem('user');
	
setTimeout(function(){	
	var data={name:this.state.username};   
	fetch('/showblog',{ method: 'POST',body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then(response=>{
	return response.json()}).then(
 (body)=>{this.setState({arr:body});    }).catch(err=>console.log(err));	
}.bind(this),1000);

}

fun=(event)=>{	    event.preventDefault();
		var data={"name":document.getElementById('1').value};      alert(JSON.stringify(data));
		fetch('/searchblog',{ method: 'POST', body:JSON.stringify(data),
		headers: {"Content-Type": "application/json" } }).then((response)=>{ return response.json()}).then(
 (body)=>{if(!body.length)alert('No result found'); this.setState({arr:body});  }).catch(err=>console.log(err));
 
 
}

changeDetails=(id,ind)=>
{
	var but=document.getElementById(id+'change');
	if(but.innerHTML==='Read More')
	{		document.getElementById(id+'details').innerHTML=this.state.arr[ind].data;
			but.innerHTML='Read Less';
	}
	else
	{
		document.getElementById(id+'details').innerHTML=this.state.arr[ind].data.substring(0,500);
			but.innerHTML='Read More';
	}		
	
}

render()
{
 return (
 <div style={{width:"100%"}}>
 <center><h2 style={{width:"100%"}}>MY BLOGS</h2></center>
 	<div><form onSubmit={this.fun.bind(this)}>
<center><input type='text'  name='name'  id='1' required/>
				<input type='submit'  value='Search' /></center>
           </form>	<br></br><br></br><br></br>	</div>
<br></br><br></br>

<div id='show3' style={{opacity:1}}> 
	<section class="features-icons bg-light text-center"  >
    <div id='contain' class="container"   >

		{this.state.arr.reverse().map( (res,ind)=>( 
		
		
<div style={{width:"100%"}}>
		
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{border:"5px solid white",borderRadius:"10px",backgroundColor:"pink"}} >
		  						<br></br>		

				<div  class="row">
							<div class="col-lg-12">
								<button class='btn btn-secondary'>ID</button>
								<span style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}>{res._id} </span>
							</div>
				</div>
						<br></br>						<br></br>

			
				<div class="row" >
					<div class="col-lg-12" style={{width:"100%"}}><p style={{backgroundColor:"green",color:"white",fontFamily:"Sans-serif-condensed",padding:"10px",fontSize:"20px"}}>
					<button class="btn btn-sm btn-primary" style={{float:"left"}}>Topic:</button>&nbsp; &nbsp; &nbsp; 
					{res.topic}</p></div> 
				</div>
			
			<div class="row" >
			 <div class="col-lg-6">
					<div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3"  >
						
							<center><img src={res.img} alt='not found' width={"100%"} height={"100%"} /></center>
					</div>	
	         </div>
			  <div class="col-lg-6"  >		
					<center>
						<div class="row" >
					    	<div class="features-icons-icon d-flex">
					 	     	<div class="col-lg-12">
								 <center>
								 <p class='junbotron' id={res._id+'details'} style={{borderRadius:'10px',backgroundColor:'white',fontFamily:"Sans-serif",border:'3px solid purple',padding:'5px', fontSize:"20px"}}>
		                                {((res.data!=null)?res.data.substring(0,500):res.data)}
							   	</p>		<button id={res._id+'change'} class='btn btn--sm btn-success' onClick={this.changeDetails.bind(this,res._id,ind)}>Read More</button>

								</center>
							   </div>
					        </div><br></br><br></br>
				        </div>
                   </center>
				</div>	
		   </div>		
	   <div class="row">
	      <div class="col-lg-12"><p  style={{padding:"5px", backgroundColor:"purple",color:"white"}}>Published on:&nbsp;&nbsp;&nbsp;{res.timestamp} </p></div>
		</div>
		   	   </div>	

     </div>	
		
		

		))}

		</div></section>
<br></br>   <br></br>       <br></br>   <br></br>      
<br></br>   <br></br></div></div>)
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

export default connect(mapStateToProps, mapDispatchToProps)(Showblog);
