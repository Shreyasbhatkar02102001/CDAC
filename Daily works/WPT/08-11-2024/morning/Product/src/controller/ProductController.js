import { createConnectionObject } from "../config/Dbconfig.js";


const connection =  createConnectionObject();

export function saveProduct(request, response) {
    try {
        const product = request.body;
        const insertQry = `INSERT INTO product VALUES(${product.id},'${product.name}',${product.price},${product.quantity},'${product.description}')`;
        connection.query(insertQry, (error) => {
            if (error) {
                console.log(error);
                response.status(500).send({message:"Error inserting product"});
            }
            else {
                response.status(201).send({message:"Product saved successfully"});
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:"Error saving product"})
    }
}

export function getAllProducts(request, response) {
    try {
        const fetchQry = "SELECT * FROM product";
        connection.query(fetchQry,(error,result)=>{
            if(error){
                console.log(error);
                response.status(500).send({message:"Something went wrong"});
            }
            else response.status(200).send(result);
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({message:"Something went wrong"});
    }
}