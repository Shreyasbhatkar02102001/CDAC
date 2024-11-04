function saveData() {
    let  email, password;

    email = document.getElementById("exampleInputEmail1").value;
    password = document.getElementById("exampleInputPassword1").value;
    
   

    let user_records = new Array();
    user_records = JSON.parse(localStorage.getItem("users"))?JSON.parse(localStorage.getItem("users")):[]

    if (user_records.some((v) => {
        return v.email == email && v.password == password
    } ))
    { 
        alert("Login Successful");
        let current_user =user_records.filter((v) => {
            return v.email == email && v.password == password
        })[0]
        // console.log("Stored name:", localStorage.getItem("name"));

        localStorage.setItem("name",current_user.fname);
        localStorage.setItem("email",current_user.email);
        window.location.assign("loggedin.html");
    }
    else {
        alert("Login failed");
    }
    
}