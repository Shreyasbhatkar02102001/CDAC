![alt text](image.png)


### Global and local variable 

Global
![alt text](image-1.png)

Local:
![alt text](image-2.png)

- here, we declare variable without , var, let, const ; therefore it will be considered as global variable

Note: if any variable is declared without , var, let, const keywords then that variable will always have global scope. Because without var, let, const keywords variables are referred to as global


#### var keywords:
- variables declared using var keyword will get either local or global scope specifically.

![Local var](image-3.png)

here, variables will only be accessible in function scope only, not outside

therefore it will through an error because it is not accessible outside the function

![alt text](image-4.png)

o/p -> 5
8



#### Hoisting

![alt text](image-5.png)

`console.log(a);` -> // undefined bit no error

here, it has read our code , therefore it will not  throw an error

- it will only consider only declaration part only

sir define : 
whenever browser loads the js code so before execution, js engine reads the complete code and will place/move all the variable declarations( not assignments ) and function definitions at the top of the code, this process is known as hoisting

but inside js engine:
var a;
console.log(a); // undefined 


![alt text](image-6.png)

![alt text](image-7.png)

cannot access ley variable before initialization

const keyword:

- exactly same as let keyword
- but 1 diff is there, that we can't change its value

For JS, a function is also an object

'var str = "Hello";'

![alt text](image-8.png)

o/p ->  [Function: show]
function

![alt text](image-9.png)

# IMP from here :-
### Callback function:

![alt text](image-10.png)

o/p -> 5, hello, true

![alt text](image-11.png)

callback function: a function that is passed as an argument

in above code, demo is the callback function

![alt text](image-12.png)

show() will pass demo which is reference of demo() function

and var rx = a(); -> here, it will call demo() and them it returns 5

this a show() is passing  whole demo() 

when we are calling then that time it is returning 5 then 5 will be stored in rs
and we are printing rs in console

![alt text](image-13.png)

arr.filter() -> based on certain conditions it will retrieve elements from an array

sir's definition for filter() -> filter func will filter the given array based on the condition and it will return the filtered array

![alt text](image-17.png)

![alt text](image-14.png)

![alt text](image-15.png)

 converted into

![alt text](image-16.png)

works same 

what taught in this session
- arrow func
- no arraow func
- hoisting
- callback func
- filter()


revise today topics
- read doms
- do 3rd assignment where we have to implement dom 

