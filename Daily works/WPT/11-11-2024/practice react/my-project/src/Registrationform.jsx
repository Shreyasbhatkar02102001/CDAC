import { Component } from "react";


export class ResgistrationForm extends Component {

    constructor(){
        super();
        this.state = {
            FormData : {firstname: "", lastname: "", email: "", password: ""}
        }
    }

    handleFirstNameChange(e){
        console.log(e.target.value);
        this.setState((FormData:{firstname: e.target.value}});
        // read the value from the first name field
        // assign that value into fromDate state
    }
    render(){

        return (

            <div>
                <button onClick={this.handleFirstNameChange}></button>
                <form>
                    <input type="text"  placeholder="Enter firstName : " onChange={this.handleFirstNameChange}/>
                    <input type="text"  placeholder="Enter lastName : "/>
                    <input type="text"  placeholder="Enter email : "/>
                    <input type="text"  placeholder="Enter password : "/>
                    <button type="submit">Register</button>
                </form>
            </div>
        )

    }
}