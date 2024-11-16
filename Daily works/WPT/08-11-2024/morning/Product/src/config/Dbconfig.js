import { createConnection } from "mysql";

export function createConnectionObject(){

    return createConnection({
        host: 'localhost',
        user: 'root',
        password: 'cdac',
        database: 'newdb'
    });
}

export function establishConnection(){

    createConnectionObject().connect((error) => {
        if (error){
            console.log(error);
        }
        else {
            console.log("Connection established with MySQL connection");
        }
    });
}