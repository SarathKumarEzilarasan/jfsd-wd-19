function add(a, b) {
  return a + b;
}

// add(100, 200);

// console.log(add);

let result = add;

console.log(result(100, 200));

const person = {
  firstName: "john",
  lastName: "doe",
  fullName: function () {
    return this.firstName + this.lastName;
  },
};

console.log(person.fullName());
