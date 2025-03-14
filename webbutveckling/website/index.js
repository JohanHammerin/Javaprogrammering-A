//------Del 1------

//console.log(`Hello`);
//console.log(`I like pizza`);

//window.alert(`This is an alert`);
//window.alert(`I like pizza`);

//document.getElementById(`myH1`).textContent = `Hello`;
//document.getElementById("myP").textContent = `I like pizza!`;

// This is a comment

/*
This
is
a
comment
*/

//------Del 2------

//let x = 123;
//console.log(x);

//let age = 25;
//console.log(age);
//let price = 1.99;
//console.log(price);
//let gpa = 2.1;
//console.log(gpa);

//console.log(typeof age);
//console.log(`You are ${age} years old`);
//console.log(`The price is $${price}`);
//console.log(`Your gpa is:${gpa}`);

//let firstName = "Johan";
//console.log(typeof firstName);
//console.log(`Your name is ${firstName}`);

//let favoriteFood = "Pizza";
//console.log(`You like ${favoriteFood}`);

//let email = "johan04hammerin@gmail.com";
//console.log(`e-post: ${email}`);

//let online = false;
//console.log(typeof online);
//console.log(`Johan is online: ${online}`);

//let forSale = true;
//console.log(`Is this car for sale: ${forSale}`);

//let isStudent = true;
//console.log(`Enrolled: ${isStudent}`);

//let fullName = "Johan Hammerin";
//let age = 21;
//let isStudent = true;

//document.getElementById("p1").textContent = `Your name is ${fullName}`;
//document.getElementById("p2").textContent = `You are ${age} years old`;
//document.getElementById("p3").textContent = `Enrolled: ${isStudent}`;

////------Del 3------

//let students = 30;
//console.log(students);

//students = students + 1;
//students = students - 1;
//students = students * 1;
//students = students / 1;

//students += 1;
//students -= 1;
//students *= 1;
//students /= 1;

// ** = ^ = upphöjt = Math.pow
//students = students **2;
//students **=2;

// % = modulus
//let  = students % 2;
//students %= 2;

//console.log(students);

////------Del 4------

//let username = window.prompt("What's your username?");
//console.log(username);

//let username;
//document.getElementById("mySubmit").onclick = function() {
//username = document.getElementById("myText").value;
//console.log(username);
//document.getElementById("myH1").textContent = `Welcome ${username}`;
//}

////------Del 5------

//let age = window.prompt("How old are you?");
//age += 1;
//console.log(age);

//let age = window.prompt("How old are you?");
//age = Number(age);
//age += 1;
//console.log(age);
//console.log(age, typeof age);

//let x = "pizza";
//let y = "pizza";
//let z = "pizza";

//x = Number(x);
//y = String(y);
//z = Boolean(z);

//console.log(x, typeof x);
//console.log(y, typeof y);
//console.log(z, typeof z);

//let x = "0";
//let y = "0";
//let z = "0";

//x = Number(x);
//y = String(y);
//z = Boolean(z);

//console.log(x, typeof x);
//console.log(y, typeof y);
//console.log(z, typeof z);

//let x = "";
//let y = "";
//let z = "";

//x = Number(x);
//y = String(y);
//z = Boolean(z);

//console.log(x, typeof x);
//console.log(y, typeof y);
//console.log(z, typeof z);

//let x;
//let y;
//let z;

//x = Number(x);
//y = String(y);
//z = Boolean(z);

//console.log(x, typeof x);
//console.log(y, typeof y);
//console.log(z, typeof z);

////------Del 6------
//const PI = 3.14159;
//let radius;
//let circumference;

//PI = 420;



//radius = window.prompt("Enter the radius of the circle");
//radius = Number(radius);

//circumference = 2 * pi * radius;
//console.log(`Circumference: ${circumference}`)




const PI = 3.14159;
let radius;
let circumference;

document.getElementById("mySubmit").onclick = function() {
    radius = document.getElementById("myText").value;
    //radius = Number(radius);
    circumference = 2 * PI * radius;
    document.getElementById("myH3").textContent = circumference + "cm";

}
