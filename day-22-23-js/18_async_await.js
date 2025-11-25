const fs = require("fs").promises;

async function myDisplay() {
  try {
    let data = await fs.readFile("day-22-js/demo.txt", "utf-8");
    let data1 = await fs.readFile("day-22-js/demo1.txt", "utf-8");
    let data2 = await fs.readFile("day-22-js/demo2.txt", "utf-8");
    console.log(data);
    console.log(data1);
    console.log(data2);
  } catch (err) {
    console.error(err.message);
  }
}

myDisplay();
