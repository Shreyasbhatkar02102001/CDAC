form data:

1. create a state to collect from data
2. as soon as user starts typing into the field, read fields value and assign into the proper state
3. At the time of submit, we have to read the form data from the state


Event handling in react: 

if  a function is getting called on to any event, then that function will automatically get an argument that will contain the ocurred event object


class component:
 
 operation(e) {
    e.target // the target of the event

 }

handleSubmit (e){
    e.preventDefault();  // prevent page from loading
}
 <form onsubmit={this.handleSubmit}>