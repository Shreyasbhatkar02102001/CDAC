import jwt from 'jsonwebtoken';

export function verifyToken(request, response, next){
    const authHeader = request.get('Authorization'); // Bearer eyyysafsd344345
    console.log(authHeader);
    if(authHeader){
        const token = authHeader.split(" ")[1];   //   eyyysafsd344345
        jwt.verify(token,"hello123",(error,payload)=>{
            if(error){
                response.status(401).send({message:"Invalid token"});
            }
            else{
                next();
            }
        });
    }
    else{
        response.status(401).send({message:'Token is missing'});
    }
    
}