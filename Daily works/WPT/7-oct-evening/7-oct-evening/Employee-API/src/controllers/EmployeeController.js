import { createConnectionObject } from "../config/DbConfig.js";

const connection = createConnectionObject()

export function saveEmployee(request,response){
    try {
        const data = request.body;// {id:11,name:'',phone:'}
        const insertQuery = `INSERT INTO employee VALUES(${data.id},'${data.name}',${data.salary},'${data.department}','${data.phone}')`;
        connection.query(insertQuery,(error,result)=>{
            if(error){
                response.status(500).send({message:"Error registering employee"}); 
            }
            else{
                response.status(201).send({message:"Employee registered"})
            }
        });
    } catch (error) {
        response.status(500).send({message:"Error registering employee"});
    }
}