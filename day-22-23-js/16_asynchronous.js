// setTimeout(() => console.log("from set timeout"), 2000);
// console.log("end of file");

const fs = require("fs");

// callback hell

fs.readFile("day-22-js/demo.txt", "utf-8", (err, data) => {
  if (err) {
    console.error(err.message);
  } else {
    fs.readFile("day-22-js/demo1.txt", "utf-8", (err, data1) => {
      if (err) {
        console.error(err.message);
      } else {
        fs.readFile("day-22-js/demo2.txt", "utf-8", (err, data2) => {
          if (err) {
            console.error(err.message);
          } else {
            console.log(data);
            console.log(data1);
            console.log(data2);
          }
        });
      }
    });
  }
});
