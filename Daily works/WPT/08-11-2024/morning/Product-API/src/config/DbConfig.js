import { createConnection } from "mysql";

export function createConnectionObject(){
    return createConnection({
        host: "localhost",
        user: "root",
        password: "root",
        database: "mydb"
    });
}

export function establishConnection(){
    createConnectionObject().connect((error)=>{
        if (error) {
            console.log(error);
        }
        else{
            console.log("Connected to MySQL Database!");
        }
    });
}