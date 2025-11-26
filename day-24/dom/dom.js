// console.log(document.title);

document.title = 123;

// console.log(document.forms[0]);

// console.log(document.getElementById("header-title"));

// let headerTitle = document.getElementById("header-title");
// let header = document.getElementById("main-header");

// headerTitle.textContent = "Hello";
// headerTitle.innerText = "Hello!!!";

// headerTitle.innerHTML = "<h3> From H3 </h3>";
// headerTitle.style.backgroundColor = "yellow";

// console.log(document.getElementsByClassName("container"));

let liList = document.getElementsByClassName("list-group-item");
// liList[1].style.backgroundColor = "yellow";

// for (let i = 0; i < liList.length; i++) {
//   liList[i].style.backgroundColor = "yellow";
// }

// document.getElementsByTagName("li");

// let items = document.querySelectorAll(".list-group-item");

// items[0].style.backgroundColor = "yellow";

let itemList = document.querySelector("#items");

// console.log(itemList.parentNode);
// itemList.parentNode.style.backgroundColor = "yellow";
// console.log(itemList.parentNode);
// console.log(itemList.parentElement);
// console.log(itemList.children[1]);

// console.log(itemList.nextElementSibling);
// console.log(itemList.previousElementSibling);

// let newDiv = document.createElement("div");

// newDiv.className = "hello";

// newDiv.id = "hello1";

// newDiv.setAttribute("title", "Hello Div");

// let newDivText = document.createTextNode("Hello World");

// newDiv.appendChild(newDivText);

// let container = document.querySelector("header .container");
// let h1 = document.querySelector("#header-title");

// container.insertBefore(newDiv, h1);

// let button = document
//   .getElementById("button")
//   .addEventListener("click", (e) => {
//     // console.log("button clicked");
//     // console.log(e.target);

//     let output = document.querySelector("#output");
//     output.innerHTML = "<h3>" + e.target.id + "</h3>";
//   });

let form = document.querySelector("form");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  console.log("hello");
});
