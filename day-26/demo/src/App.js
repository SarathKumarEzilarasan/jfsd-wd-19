import "./App.css";
import Header from "./Header";
import Content from "./Content";
import Footer from "./Footer";
import { useState, useEffect } from "react";
import AddItem from "./AddItem";
import SearchItem from "./SearchItem";

function App() {
  // const [items, setItems] = useState([
  //   { id: 1, checked: true, description: "Practice Java" },
  //   { id: 2, checked: false, description: "Practice JavaScript" },
  //   { id: 3, checked: true, description: "Practice HTML" },
  // ]);
  // const [items, setItems] = useState(
  //   JSON.parse(localStorage.getItem("todo_list"))
  // );

  const API_URL = "http://localhost:3500/db";
  const [items, setItems] = useState(
    JSON.parse(localStorage.getItem("todo_list"))
  );

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

  const addItem = (val) => {
    const id = items.length ? items[items.length - 1].id + 1 : 1;
    const addNewItem = { id: id, checked: false, description: val };
    const listItems = [...items, addNewItem];
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));
    setNewItem("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    addItem(newItem);
  };

  const [newItem, setNewItem] = useState();
  const [search, setSearchItem] = useState("");

  console.log("before");
  useEffect(() => {
    const fetchItems = async () => {
      try {
        let response = await fetch(API_URL);
        let items = await response.json();
        setItems(items);
      } catch (error) {
        console.log(error);
      }
    };

    (async () => await fetchItems())();
  }, []);
  console.log("after");

  return (
    <div className="App">
      <Header title="Demo App" />
      <AddItem
        handleSubmit={handleSubmit}
        newItem={newItem}
        setNewItem={setNewItem}
      />
      <SearchItem search={search} setSearchItem={setSearchItem} />
      <Content
        items={items.filter((item) =>
          item.description.toLowerCase().includes(search.toLowerCase())
        )}
        handleCheck={handleCheck}
        deleteTask={deleteTask}
      />
      <Footer length={items.length} />
    </div>
  );
}

export default App;
