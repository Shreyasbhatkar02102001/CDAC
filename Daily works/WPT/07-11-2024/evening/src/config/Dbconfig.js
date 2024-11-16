import { createConnection } from 'mysql'; // Use mysql library for MySQL connections

export function createConnectionObject(){
    const connectionObj = createConnection({
        host: 'localhost',
        user: 'root',
        password: 'cdac',
        database: 'newdb'
    });
    return connectionObj;
}

export function establishConnection(){
    createConnectionObject().connect((error) => {
        if (error) {
            console.log(error);
        } else {
            console.log(`Connected to the database on port `);
        }
    });
}