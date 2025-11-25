// function myDisplay(name) {
//   console.log(name);
// }

// let myPromise = new Promise((myResolve, myReject) => {
//   setTimeout(() => {
//     myResolve("hello");
//   }, 3000);
// });

// console.log(myPromise);

// myPromise.then((val) => myDisplay(val)).catch((err) => myDisplay(err));

const fs = require("fs").promises;

fs.readFile("day-22-js/demo.txt", "utf-8")
  .then((data) => {
    console.log(data);
    return fs.readFile("day-22-js/demo1.txt", "utf-8");
  })
  .then((data) => {
    console.log(data);
    return fs.readFile("day-22-js/demo2.txt", "utf-8");
  })
  .then((data) => console.log(data))
  .catch((err) => console.error(err.message));
