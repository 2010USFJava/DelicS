var a =10;
console.log(a);
a="chaos"
console.log(a);

/*Datatyler
6 data types that are primitives, checked by the type of operator
-undefined
-boolean
-number
-String
-ES6
    -BigInt
    -Symbol
Not Primitives
null- typeof is object
object - typeof object
function - non data structure, typeof is function
NaN - "not a number" typeof is number
*/
var b, c, d, e, f, g, h, e;
b = "10";
c = true;
d = {}; //object
e = null;
g = (0/0);
h = [];
i = function(){};

//type correction
console.log(5==5);
console.log(5== '5');
//tripple equals does not perform type correction
console.log(5==='5');
console.log(0=== -0);
console.log(7+7+"7");

//objects in js
//property value pairs

//object literal
var person={"name": "jimmy",
"age":74};

function Hunam(name, age){
    this.name=name;
    this.age=age;
}

//Maker function
function makePerson(name, age){
    var p={};
    p.name=name;
    p.age = age;
    return p;
}
function makePerson2(name,age){
    var p={
        "name":name,
        "age":age,
    }
    return p;
}
//Arrays
var myArray= [10,20,30];
myArray[9] = "footballbat";

