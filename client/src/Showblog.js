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

render()
{
 return (
 <div style={{width:"100%"}}>
 <center><h2 >MY BLOGS</h2></center>
 	<div><form onSubmit={this.fun.bind(this)}>
<input type='text'  name='name'  id='1' required/>
				<input type='submit'  value='Search' />
           </form>	<br></br><br></br><br></br>	</div>
<br></br><br></br>

<div id='show3' style={{opacity:1}}> 
	<section class="features-icons bg-light text-center"  >
    <div id='contain' class="container"   >
      <div class="row" >

		{this.state.arr.reverse().map( res=>( 
	   <div class="col-lg-6"  >
	  <br></br><br></br>
<center>
					 <div class="row" >
          <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3" style={{border:"5px solid red",borderRadius:"10px",backgroundColor:"pink"}} >
		  		<br></br>

            <div class="features-icons-icon d-flex" >
					<div class="col-lg-3"><button class='btn btn-secondary'>Blog ID</button></div>
					<div class="col-lg-9"><span style={{border:"2px solid purple",backgroundColor:"cyan",padding:"5px",borderRadius:"10px"}}>{res._id}</span></div>
			</div><br></br>
						
			<div class="features-icons-icon d-flex">
				  <div class="col-lg-3"><button class='btn btn-secondary'>Topic</button></div>
		<div class="col-lg-9"><center><button class='btn btn-success'>{res.topic}</button></center></div>
			</div><br></br>				

			
			<div class="features-icons-icon d-flex">
		<div class="col-lg-12"><center><img src={res.img} alt='not found' width={300} height={400} /></center></div>
			</div><br></br><br></br>
			
			<div class="features-icons-icon d-flex">
					<div class="col-lg-12"><center><p class='junbotron' style={{borderRadius:'10px',backgroundColor:'white',border:'3px solid purple',padding:'5px', fontSize:"15px"}}>{res.data}</p></center></div>
			</div><br></br><br></br>
			
			
	
				
			<div class="features-icons-icon d-flex">
				  <div class="col-lg-3"><button class='btn btn-secondary'>Date & Time</button></div>
				  <div class="col-lg-9"><center><button class='btn btn-danger'> {res.timestamp} </button></center></div>
			</div><br></br><br></br>
			</div>
		</div><br></br><br></br><br></br>
	
       </center> </div>		
        
		))}
				</div>	

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
