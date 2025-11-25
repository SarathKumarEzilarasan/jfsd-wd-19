function myFirst() {
  myDisplay("hello");
}

function mySecond() {
  myDisplay("bye");
}

function myDisplay(name) {
  console.log(name);
}

// myFirst();
// mySecond();

function myCalculator(num1, num2, myCallback) {
  let sum = num1 + num2;
  myCallback(sum);
}

// myCalculator(2, 2, myDisplay);
myCalculator(2, 2, (name) => console.log(name));
