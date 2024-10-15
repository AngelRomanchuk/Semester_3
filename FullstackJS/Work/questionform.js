// Question 1
console.log(myVar);
let myVar = 5;

// Question 2
let counter = 0;

function a() {
    counter++;
}
function b() {
    a();
}

a();
b();
a();

console.log(counter);

// Question 3
// How can you share a variable between two JavaScript files?

// Question 4
let counter1 = 0;
function increment() {
    counter1++;
}

increment();
increment();
console.log(counter1);

// Question 5
// Assuming numbers is defined as: numbers = [1,2,3,4,5]; what is the difference between { numbers } and { myNumbers: numbers, }; ?

// Question 6
let x = 5;
function calculateY() {
    let x = 10;
    return x * 2;
}

let y = calculateY();

// Question 7
let obj1 = { name: "John" };
let obj2 = obj1;
obj2.name = "Jane";
console.log(obj1.name);

// Question 8
// What will be rendered by the following EJS code if the Express route is written like this?

// Express:
app.get('/greet', (req, res) => {
    res.render('greeting', { name: 'Alice' });
});

// greeting.ejs:
<h1>Hello, <%= name %>!</h1>

// Question 9
let x = 10;
function updateX() {
    x = 5;
}
updateX();
console.log(x);

// Question 10
function greet() {
    return "Hello!";
}

let sayHello = greet;
console.log(sayHello);

// Question 11
let x = 0;
function getX() {
    return x;
}
function increment() {
    if (x > 1) {
        x++;
    }
    else {
        let x = 5;
        x++;
    }
}
increment();
console.log(getX());