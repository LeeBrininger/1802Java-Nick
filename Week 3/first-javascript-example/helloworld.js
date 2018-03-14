console.log("Hello World");
//this is a comment
var a = 5;

a = "a new string";

console.log(a);

var b, c, d, e, f, g, h, i;

b = `5`;
c = true;
d = {};
e = null;
g = [];
i = function(){};

function changeString(myVar){

    console.log("myVar inside changeString "+myVar);
    myVar="New String";
    console.log("new value of myVar " + myVar);

}

var myString = "Old value";
changeString(myString);


console.log("Value outside method " + myString);


//closure
var y = function(x){

    var value = x;

    return function(){

        return value;

    }

}(10);

console.log(y());

//IIFE (immediatly invoked function expression)
y = function(){

    var a = 99;

    console.log(a);

}();

//block scoping with let
{

    let a = 77;
    const x = 11;
    //x = 77;

}

class myClass{

    constructor(a, b){

        this.name = a;
        this.value = b;

    }

    getName(){

        return this.name;

    }

    setName(n){

        this.name = n;

    }

}

var myObject = new myClass("hi", "bye");

console.log(myObject.getName());