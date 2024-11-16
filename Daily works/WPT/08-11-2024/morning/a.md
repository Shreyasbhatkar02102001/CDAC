http://127.0.0.1:9800/products/save
http://127.0.0.1:9800/products/getAll

http://135.12.15.1:9890/products/save
http://135.12.15.1:9800/products/getA1l
http://135.12.15.1:9800/products/remove/101
http://135.12.15.1:9800/products/update/101

As of now, all the APIs are open for all
i.e. any one is this world who is having the url they can access the API
but this should not happen ideally

In order to prevent the above behavior, we need to add authentication to the APIs

Admin registration

Admin login

Now, all the secure APIs should verify first that if admin is logged in or not

if admin is logged in then only API should do its job

otherwise if admin is not logged in then respond with error message

Login API:

1. Receive username and password from request body
2. Match the username and password given by yser in the  request with the db values

        select * from users where username = ${request.body.username} and password = ${request.body.password}

3. after matching into db:
    a. username and password matched : generate a token and send it in response login successful and user is valid
    b. username and password didn't match : respond with error message like invalid username and password 


Secured API:

1. first the secured api will receive the token on the request 
2. Secured api now should verify the token
3. IF token is valid then API will do its job
   IF token is invalid or there is no token then in the request then respond with error message


Restro: self service

Payment counter : authentication will be done, they will given a token 

Food counter : customer will present the token and the employee at the food counter will verify the token, if token is valid then we will get access of the secured resource

Food is the secured resource 



For authentication purpose we will use JWT Token

Json Web Token

At the time of token generation we have to decide that what data we should
contain inside a token with the help of json object

var data = {
userId: 101

}

sign(data)


install -> npm i bcrypt