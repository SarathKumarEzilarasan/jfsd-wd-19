// const john = {
//   firstName: "john",
//   lastName: "doe",
//   fullName: function () {
//     return this.firstName + this.lastName;
//   },
// };

// const peter = {
//   firstName: "peter",
//   lastName: "doe",
//   fullName: function () {
//     return this.firstName + this.lastName;
//   },
// };

// function createPerson(name) {
//   const obj = {};
//   obj.name = name;
//   obj.introduceSelf = function () {
//     console.log("Hi I'm " + name);
//   };
//   return obj;
// }

// const anand = createPerson("anand");
// // anand.introduceSelf();

// function _Person(name) {
//   this.name = name;
//   this.introduceSelf = function () {
//     console.log("Hi I'm " + name);
//   };
// }

// const zack = new _Person("zack");
// zack.introduceSelf();

class Person {
  name;

  constructor(name) {
    this.name = name;
  }

  introduceSelf() {
    console.log("Hi I'm " + this.name);
  }
}

class Professor extends Person {
  #teaches;
  constructor(name, teaches) {
    super(name);
    this.#teaches = teaches;
  }
  introduceSelf() {
    console.log("Hi My Name is " + this.name + "and I teach " + this.#teaches);
  }

  get teaches() {
    return this.#teaches;
  }

  set teaches(teaches) {
    this.#teaches = teaches;
  }

  static department() {
    console.log("I'm from department");
  }
}

const giles = new Professor("giles", "Maths");
// console.log(giles.#teaches);
// giles.introduceSelf();

// console.log(giles.teaches);
// giles.teaches = "science";
// console.log(giles.teaches);

Professor.department();
