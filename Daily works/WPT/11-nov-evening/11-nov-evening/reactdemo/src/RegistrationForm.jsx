import { useState } from "react"

export function RegistrationForm(){

    const [formData, setFormData] = useState({firstname: "",lastname: "",email: "",password: ""});

    const handleInputChange = (e) => {
        setFormData({
            ...formData,
           [e.target.name] : e.target.value 
        });
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(formData);
    }

    return (
        <div>
            <form onSubmit={handleSubmit}>
                    <input type="text" name="firstname" placeholder="Enter firstname" onChange={handleInputChange} />
                    <input type="text" name="lastname" placeholder="Enter lastname" onChange={handleInputChange} />
                    <input type="email" name="email" placeholder="Enter email" onChange={handleInputChange} />
                    <input type="password" name="password" placeholder="Enter password" onChange={handleInputChange} />
                    <button type="submit">Register</button>
                </form>
        </div>
    )
}

// import { Component } from "react";

// export class RegistrationForm extends Component {
//     constructor(){
//         super();
//         this.state = {
//             formData : {firstname: "",lastname: "",email: "",password: ""}
//         }
       
//         this.handleInputChange = this.handleInputChange.bind(this);
//         this.handleSubmit = this.handleSubmit.bind(this);
//     }

//     handleInputChange(e){
//         this.setState({
//             formData:{
//                 ...this.state.formData,
//                 [e.target.name]: e.target.value
//             }
//         });
//     }

    
//     handleSubmit(e){
//         e.preventDefault();
//         console.log(this.state.formData);
//     }
//     render(){
//         return (
//             <div>
                // <form onSubmit={this.handleSubmit}>
                //     <input type="text" name="firstname" placeholder="Enter firstname" onChange={this.handleInputChange} />
                //     <input type="text" name="lastname" placeholder="Enter lastname" onChange={this.handleInputChange} />
                //     <input type="email" name="email" placeholder="Enter email" onChange={this.handleInputChange} />
                //     <input type="password" name="password" placeholder="Enter password" onChange={this.handleInputChange} />
                //     <button type="submit">Register</button>
                // </form>
//             </div>
//         )
//     }
// }