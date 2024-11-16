import { createConnection } from "mysql";

export function createConnectionObject(){
    const connectionObj = createConnection({
        host: 'localhost',
        user: 'root',
        password: 'root',
        database: 'mydb'
    });
    return connectionObj;
}

export function establishConnection(){
    createConnectionObject().connect((error)=>{
        if(error){
            console.log(error);
        }
        else{
            console.log("Connected to the database");
        }
    });
}