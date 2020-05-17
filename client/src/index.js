
import React ,{Component} from 'react';
import { BrowserRouter as Router, Route} from 'react-router-dom';
import ReactDOM from 'react-dom';
//import PropTypes from 'prop-types';
import {createStore, combineReducers} from "redux";
import {Provider} from "react-redux";

import './index.css';

import Home from './Home';
import Profile from './Profile';

import Updatepassword from './Updatepassword';
import Forgotpassword from './Forgotpassword';
import Changepassword from './Changepassword';

import Insert from './Insert';
import Insertimage from './Insertimage';
import Insertproduct from './Insertproduct';
import Insertvideo from './Insertvideo';
import Insertbird from './Insertbird';
import Insertblog from './Insertblog';



import Delete from './Delete';
import Deleteblog from './Deleteblog';
import Deletebird from './Deletebird';
import Deleteproduct from './Deleteproduct';
import Deleteimage from './Deleteimage';
import Deletevideo from './Deletevideo';


import Studybirds from './Studybirds';
import Image from './Image';
import Signup from './Signup';
import Signin from './Signin';

import Video from './Video';
import Likedimages from './Likedimages';
import Likedvideos from './Likedvideos';
import Bookbirds from './Bookbirds';
import Showcart from './Showcart';
import Showblog from './Showblog';
import Order from './Order';
import Payment from './Payment';
const homeReducer = (state = {
    name: "Hasnain" }, action) => {
    switch (action.type) {
        case "SET_MYNAME":
            state = {
                ...state,
                name: action.payload
            };
            break;
    }
    return state;
};

const prodReducer = (state = {
    username:null,arr:[{name:null,species:null,quantity:null,price:null,img:null}],obj:{prodName:null,price:null,disease:null},msg:null }, action) => {
    switch (action.type) {
        case "SHOW_ALL_PROD":
            state = {
                ...state,
                arr: action.payload
            };
            break;
		case "SEARCH_PROD":
            state = {
                ...state,
                arr: action.payload
            };
            break;
    }
    return state;
};

const store = createStore(
    combineReducers({prod: prodReducer,home: homeReducer}),{}
);
		
ReactDOM.render(
				<Provider store={store}>  

<Router>	  
			<Route exact path='/' component={Home}/>
			<Route exact path='/Profile' component={Profile}/>
			
			<Route exact path='/Signup' component={Signup}/>
			<Route exact path='/Signin' component={Signin}/>
			
			<Route exact path='/Insert' component={Insert}/>
			<Route exact path='/Insertimage' component={Insertimage}/>
			<Route exact path='/Insertbird' component={Insertbird}/>	
			<Route exact path='/Insertproduct' component={Insertproduct}/>	
			<Route exact path='/Insertblog' component={Insertblog}/>
			<Route exact path='/Insertvideo' component={Insertvideo}/>

			
			<Route exact path='/Delete' component={Delete}/>
			<Route exact path='/Deleteimage' component={Deleteimage}/>
			<Route exact path='/Deletebird' component={Deletebird}/>
			<Route exact path='/Deleteproduct' component={Deleteproduct}/>
			<Route exact path='/Deleteblog' component={Deleteblog}/>
			<Route exact path='/Deletevideo' component={Deletevideo}/>
			
			<Route exact path='/Studybirds' component={Studybirds}/>
			<Route exact path='/Image' component={Image}/>
			<Route exact path='/Video' component={Video}/>		
			<Route exact path='/Showblog' component={Showblog}/>

			
			<Route exact path='/Bookbirds' component={Bookbirds}/>
			<Route exact path='/Showcart' component={Showcart}/>	
			<Route exact path='/Order' component={Order}/>
			<Route exact path='/Payment' component={Payment}/>


			<Route exact path='/Likedvideos' component={Likedvideos}/>
			<Route exact path='/Likedimages' component={Likedimages}/>
			
		   <Route exact path='/Updatepassword' component={Updatepassword}/>
		   <Route exact path='/Forgotpassword' component={Forgotpassword}/>
		   <Route exact path='/Changepassword' component={Changepassword}/>



			

</Router>
		  </Provider>
,document.getElementById('root'));
