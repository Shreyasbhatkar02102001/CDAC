function saveData() {
    let fname, sname, email, password;

    fname = document.getElementById("validationCustom01").value;
    sname = document.getElementById("validationCustom02").value;
    email = document.getElementById("exampleInputEmail1").value;
    password = document.getElementById("exampleInputPassword1").value;
    
    // localStorage.setItem("fname",fname);
    // localStorage.setItem("sname",sname);
    // localStorage.setItem("email",email);
    // localStorage.setItem("password",password);


    let user_records = new Array();
    user_records = JSON.parse(localStorage.getItem("users"))?JSON.parse(localStorage.getItem("users")) :[]

    if (user_records.some((v) => {
        return v.email === email ;
    } ))
    {
        alert("Duplicate Data");
    }
    else {
        user_records.push({
            "fname":fname,
            "sname":sname,
            "email":email,
            "password":password
        })
        localStorage.setItem("users",JSON.stringify(user_records));
    }
}