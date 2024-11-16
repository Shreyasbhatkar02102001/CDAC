import { createConnectionObject } from "../config/Dbconfig.js";


const connection = createConnectionObject();

export function saveProduct(request,response){
    try {
        const book = request.body;
        const insertQry = `INSERT INTO Books VALUES(${book.id},'${book.title}','${book.description}')`;
        connection.query(insertQry,(error)=>{
            if(error){
                console.log(error);
                console.log("hiiiit error");
                response.status(500).send({message:"Something went wrong"});
            }
            else response.status(200).send({message:"Product saved successfully"});
        })
    } catch (error) {
        console.log(error)
        response.status(500).send({message:"Something went wrong"});
    }
}

export function getAllProducts(request,response){
    try {
        const fetchQry = "SELECT * FROM Books";
        connection.query(fetchQry,(error,result)=>{
            if(error){
                console.log(error);
                response.status(500).send({message:"Something went wrong"});
            }
            else response.status(200).send(result);
        })
    } catch (error) {
        console.log(error)
        response.status(500).send({message:"Something went wrong"});
    }
}

export function updateProduct(request, response) {
    try {
        const { id } = request.params;
        const { title, description } = request.body;
        const updateQry = `UPDATE Books SET title = ?, description = ? WHERE id = ?`;
        const values = [title, description, id];
        connection.query(updateQry, values, (error, result) => {
            if (error) {
                console.log(error);
                response.status(500).send({ message: "Something went wrong" });
            } else {
                if (result.affectedRows > 0) {
                    response.status(200).send({ message: "Product updated successfully" });
                } else {
                    response.status(404).send({ message: "Product not found" });
                }
            }
        });
    } catch (error) {
        console.log(error);
        response.status(500).send({ message: "Something went wrong" });
    }
}


export function deleteProduct(request, response) {
    try {
        const { id } = request.params;  // Extract id from URL parameters
        const deleteQry = `DELETE FROM Books WHERE id = ?`;

        connection.query(deleteQry, [id], (error, result) => {
            if (error) {
                console.log(error);
                response.status(500).send({ message: "Something went wrong" });
            } else if (result.affectedRows > 0) {
                response.status(200).send({ message: "Deleted successfully" });
            } else {
                response.status(404).send({ message: "Product not found" });
            }
        });
    } catch (error) {
        console.log("Server error:", error);
        response.status(500).send({ message: "Something went wrong" });
    }
}

