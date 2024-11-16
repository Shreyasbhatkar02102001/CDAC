import bcrypt from 'bcrypt';
import { createConnectionObject } from '../config/DbConfig.js';

const connection = createConnectionObject();

export function registerAdmin(request,response){
    try {
        const requestData = request.body;

        const encryptedPassword = bcrypt.hashSync(requestData.password,12);
        requestData.password = "";
        const insertQry = `INSERT INTO admin VALUES(${requestData.id},'${requestData.name}','${requestData.username}','${encryptedPassword}','${requestData.phone}')`;
        connection.query(insertQry,(error)=>{
            if(error){
                response.status(500).send({message:'Something went wrong'});
            }
            else{
                response.status(201).send({message:'Admin successfully registered'});
            }
        });
    } catch (error) {
        response.status(500).send({message:'Something went wrong'});
    }
}

export function adminLogin(request,response){
    try {
        const requestData = request.body;
        const selectQry =`SELECT * FROM admin WHERE username='${requestData.username}'`
        connection.query(selectQry,(error,result)=>{
            if(error){
                response.status(500).send({message:'Something went wrong'});
            }
            else{
                if(result.length >0){
                    if(bcrypt.compareSync(requestData.password,result[0].password)){
                        // generate a token 
                        response.status(200).send({message:'Login successful'}); 
                    }
                    else{
                        response.status(400).send({message:'Password is incorrect'});
                    }
                }
                else{
                    response.status(400).send({message:'Username is not valid'}); 
                }
            }
        });
    } catch (error) {
        response.status(500).send({message:'Something went wrong'});
    }
}