let form = document.getElementById("addForm");
let itemList = document.getElementById("items");
let filter = document.getElementById("filter");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  let newItem = document.getElementById("item").value;

  // <li class="list-group-item">
  //    Item 1
  //    <button class="btn btn-danger btn-sm float-right delete">X</button>
  // </li>

  let li = document.createElement("li");
  li.className = "list-group-item";

  let textNode = document.createTextNode(newItem);
  li.appendChild(textNode);

  let deleteBtn = document.createElement("button");
  deleteBtn.className = "btn btn-danger btn-sm float-right delete";
  deleteBtn.appendChild(document.createTextNode("X"));

  li.appendChild(deleteBtn);

  itemList.appendChild(li);
});

itemList.addEventListener("click", (e) => {
  if (e.target.classList.contains("delete")) {
    if (confirm("Are you sure???")) {
      let li = e.target.parentElement;
      itemList.removeChild(li);
    }
  }
});

filter.addEventListener("keyup", (e) => {
  let text = e.target.value.toLowerCase();

  let items = itemList.getElementsByTagName("li");

  Array.from(items).forEach((item) => {
    let itemName = item.firstChild.textContent.toLowerCase();

    if (!itemName.includes(text)) {
      item.style.display = "none";
    } else {
      item.style.display = "block";
    }
  });
});
