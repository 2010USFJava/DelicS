//Typical for loop
// Declare array with 3 items
let fish = [ "flounder", "salmon", "pike" ];

// Initalize for loop to run for the total length of an array
for (let i = 0; i < fish.length; i++) {
    // Print each item to the console
    console.log(fish[i]);
}

//The for...in statement iterates over the properties of an object. 
const shark = {
    species: "great white",
    color: "white",
    numberOfTeeth: Infinity
}

//Using the for...in loop, we can easily access each of the property names.
// Print property names of object
for (attribute in shark) {
    console.log(attribute);
}

//We can also access the values of each property by using the property
// name as the index value of the object.
// Print property values of object
for (attribute in shark) {
    console.log(shark[attribute]);
}

//Putting them together, we can access all the names and values of an object.

// Print names and values of object properties
for (attribute in shark) {
    console.log(`${attribute}`.toUpperCase() + `: ${shark[attribute]}`);
}
// Output
// SPECIES: great white
// COLOR: white
// NUMBEROFTEETH: Infinity

//For...of
// Initialize array of shark species
let sharks = [ "great white", "tiger", "hammerhead" ];

// Print out each type of shark
for (let shark of sharks) {
    console.log(shark);
}

//It is also possible to print out the index associated
// with the index elements using the entries() method.

// Loop through both index and element
for (let [index, shark] of sharks.entries()) {
    console.log(index, shark);
}

//A string can be iterated through in the same way as an array.
// Assign string to a variable
let sharkString = "sharks";

// Iterate through each index in the string
for (let letter of sharkString) {
    console.log(letter);
}
//Template literal! Using backticks instead of double quotes. it gives us a bit more functionality than just using double quotes
const string = `Hey
this

string 
is awesome!`

const myVariable = 'test'
const string =`something &{myVariable}` //something test

const string3 = `something ${1+2+3}`
function doSomething(){
return true;
}
const string4 = `something ${doSomething() ? 'x' : 'y'}`
//if dosomething evaluates to true then we return x if false return y. ? is a ternary if else operator
//here we have a function plus an expression 

//Arrows Functions
//No args
const name = "Steve";

function sayName() {
    const message = "My name is " + name;
    console.log(message);
}

function sayBye() {
  console.log("Bye " + name);  
}




//Using Arrow Syntax
const sayName = () => {
    const message = "My name is " + name;
    console.log(message);
}

const sayBye = () => {
  console.log("Bye " + name);  
}

//Single argument
function square(x) {
    return x * x;
}

function cube(x) {
    return square(x) * x;
}

//Arrow and concise
const square = x => x * x;

const cube = x => square(x) * x;

//Multiple Arguments
function multiply(x, y) {
    return x * y;
}

function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}



//Arrow Syntax
const multiply = (x, y) => {
    return x * y;
}

const add = (a, b) => {
    return a + b;
}

const subtract = (a, b) => {
    return a - b;
}


//concise
const multiply = (x, y) => x * y;

const add = (a, b) => a + b;

const subtract = (a, b) => a - b;


//Function Declaration

function divide1(a, b) {
    return a / b; 
  }
  
  //Function Expression
  
  const divide2 = function(a, b) {
    return a / b;
  }
  
  //Arrow Function Expression
  
  const divide3 = (a, b) => {
    return a / b;
  }
  
  //Arrow Function Expression - concise
  
  const divide4 = (a, b) => a / b;

  //Template Literals
  const string = `Hey
this
string
is awesome!`

console.log(string);