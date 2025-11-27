import React, { useState } from "react";
import { FaTrash } from "react-icons/fa";

const Content = () => {
  //   if (true) {
  //     useState();
  //   }

  //   const [count, setCount] = useState(99);
  //   const [_name, setName] = useState(() => randomName());
  //   const [age, setAge] = useState({ age: 20 });

  //   function randomName() {
  //     const names = ["john", "peter"];
  //     const i = Math.floor(Math.random() * 2);
  //     return names[i];
  //   }

  //   const addItem = () => console.log("Item Added");
  //   const addItem = (name) => console.log(name);
  //   const addItem = (e) => console.log(e.target);

  //   function incrementFunc() {
  //     // setCount(count + 1);
  //     // setCount(count + 1);
  //     // setCount(count + 1);

  //     setCount((count) => ++count);
  //     setCount((count) => ++count);
  //     setCount((count) => ++count);
  //   }

  //   function decrementFunc() {
  //     setCount(count - 1);
  //   }

  const [items, setItems] = useState([
    { id: 1, checked: true, description: "Practice Java" },
    { id: 2, checked: false, description: "Practice JavaScript" },
    { id: 3, checked: true, description: "Practice HTML" },
  ]);

  const handleCheck = (id) => {
    const listItems = items.map((item) =>
      //   item.id === id
      //     ? { id: item.id, checked: !item.checked, description: item.description }
      //     : item
      item.id === id ? { ...item, checked: !item.checked } : item
    );
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));
  };

  const deleteTask = (id) => {
    // const listItems = items.map((item) => (item.id === id ? {} : item));
    const listItems = items.filter((item) => item.id !== id);
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));
  };

  return (
    <main>
      {items.length ? (
        //     {/* <p>Logged in by {randomName()}</p>
        //   {/* <button onClick={addItem("john")}>Add</button> */}
        //   {/* <button onClick={() => addItem("john")}>Add</button> */}
        //   {/* <button onClick={(e) => addItem(e)}>Add</button> */}

        //   {/* <button onClick={decrementFunc}>-</button>
        //   <span>{count}</span>
        //   <button onClick={incrementFunc}>+</button> */}

        <ul>
          {items.map((item) => (
            <li className="item" key={item.id}>
              <input
                type="checkbox"
                checked={item.checked}
                onChange={() => handleCheck(item.id)}
              ></input>
              <label
                style={item.checked ? { textDecoration: "line-through" } : null}
              >
                {item.description}
              </label>
              <FaTrash role="button" onClick={() => deleteTask(item.id)} />
            </li>
          ))}
        </ul>
      ) : (
        <p style={{ marginTop: "25px" }}>List is Empty</p>
      )}
    </main>
  );
};

export default Content;
