const fruits = ["banana", "orange", "apple"];
const fruits2 = ["pineapple"];

// console.log(fruits.length);

// for (let i = 0; i < fruits.length; i++) {
//   console.log(fruits[i]);
// }
// fruits[5] = "pineapple";
// console.log(fruits);

// console.log(fruits.join("*"));
// console.log(fruits.pop());
// console.log(fruits.shift());
// console.log(fruits.unshift("lemon"));
// fruits[fruits.length] = "kiwi";
// console.log(fruits);

// console.log(fruits.concat(fruits2));

// console.log(fruits.slice(1, 3));

const numbers = [40, 100, 2, 10, 11];

// function compare(a, b) {
//   return a - b;
// }

// numbers.sort(compare);

// numbers.sort(function (a, b) {
//   return a - b;
// });

// numbers.sort((a, b) => a - b);

// const sqNumbers = numbers
//   .filter((number) => number % 2 == 0)
//   .map((number) => number * number);

// // console.log(sqNumbers);

// sqNumbers.forEach((number) => console.log(number));
// reduce

const keys = numbers.keys();
const entries = numbers.entries();

// for (let entry of entries) {
//   console.log(entry);
// }

// console.log(numbers.includes(2));

const combined = [...fruits, ...numbers];

// console.log(combined);
