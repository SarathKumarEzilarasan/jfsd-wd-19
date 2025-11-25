// let x = 100.001;
// console.log(typeof x);

// let y = "100.001";
// console.log(typeof y);

// let z = true;
// console.log(typeof z);

// let a;
// console.log(typeof a);

// let b = null;
// console.log(typeof b);

// let c = [1, 2, 3, 4, 5];
// console.log(typeof c);
// console.log(Array.isArray(c));

// let d = new Date();
// console.log(typeof d);

let e = {
  name: "John Doe",
  age: 25,
  isGraduated: true,
  mobiles: [99999, 11111],
  address: {
    street: "Test street",
    city: "Chennai",
  },
};

console.log(e.isGraduated);
console.log(e["isGraduated"]);
console.log(e.address.street);
console.log(e["address"]["street"]);
