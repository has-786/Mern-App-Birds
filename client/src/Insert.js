import React ,{Component} from 'react';
import {Redirect, BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
import './App.css';
import {connect} from "react-redux";


class Insert extends Component{
	constructor(props){
		super(props);  this.state={username:null,amount:0,cause:null,timestamp:null};
	}
	
	componentDidMount(){this.state.username=localStorage.getItem('user'); }

render()
{
 return (
 <div>
  <center><h2 >UPLOAD</h2></center>

	<center>	<span><br></br><br></br></span>
    
	<div><a href='/Insertblog'><button class='btn btn-primary' >Upload Your Blog</button></a></div>
	<span><br></br><br></br></span>
	<div><a href='/Insertimage'><button class='btn btn-danger' >Upload Gallery Image</button></a></div>
		<span><br></br><br></br></span>
	<div><a href='/Insertproduct'><button class='btn btn-success' >Upload Birds To Sell</button></a></div>
		<span><br></br><br></br></span>
		<div><a href='/Insertvideo'><button class='btn btn-warning' >Upload Videos</button></a></div>
		<span><br></br><br></br></span>
	<div><a href='/Insertbird'><button class='btn btn-warning' >Upload Birds Details</button></a></div>
		<span><br></br><br></br></span>
	</center>
</div>);
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

export default connect(mapStateToProps, mapDispatchToProps)(Insert);
//export Showcart;



//export default Home;