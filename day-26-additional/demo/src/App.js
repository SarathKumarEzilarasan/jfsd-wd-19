import "./App.css";
import Header from "./Header";
import Content from "./Content";
import Footer from "./Footer";
import { useState, useEffect } from "react";
import AddItem from "./AddItem";
import SearchItem from "./SearchItem";
import apiRequest from "./apiRequest";

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
    JSON.parse(localStorage.getItem("todo_list")) || []
  );

  const [isError, setIsError] = useState(null);
  const [isLoading, setIsLoading] = useState(true);

  const handleCheck = async (id) => {
    const listItems = items.map((item) =>
      //   item.id === id
      //     ? { id: item.id, checked: !item.checked, description: item.description }
      //     : item
      item.id === id ? { ...item, checked: !item.checked } : item
    );
    setItems(listItems);
    // localStorage.setItem("todo_list", JSON.stringify(listItems));

    const updatedItem = items.filter((item) => item.id === id);
    const putOptions = {
      method: "PUT",
      headers: {
        Content_type: "application/json",
      },
      body: JSON.stringify(updatedItem),
    };

    const response = await apiRequest(API_URL + "/" + id, putOptions);
    if (response instanceof Error) {
      setIsError(response);
    }
  };

  const deleteTask = async (id) => {
    // const listItems = items.map((item) => (item.id === id ? {} : item));
    const listItems = items.filter((item) => item.id !== id);
    setItems(listItems);
    // localStorage.setItem("todo_list", JSON.stringify(listItems));

    const deleteOptions = {
      method: "DELETE",
    };

    const response = await apiRequest(API_URL + "/" + id, deleteOptions);
    if (response instanceof Error) {
      setIsError(response);
    }
  };

  const addItem = async (val) => {
    const id = items.length ? items[items.length - 1].id + 1 : 1;
    const addNewItem = { id: id, checked: false, description: val };
    const listItems = [...items, addNewItem];
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));
    setNewItem("");

    const postOptions = {
      method: "POST",
      headers: {
        Content_type: "application/json",
      },
      body: JSON.stringify(addNewItem),
    };

    const response = await apiRequest(API_URL, postOptions);
    if (response instanceof Error) {
      setIsError(response);
    }
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
        // let response = await fetch(API_URL);
        // if (!response.ok) {
        //   throw new Error("Data not found");
        // }
        let response = await apiRequest(API_URL);
        let items = await response.json();
        setItems(items);
      } catch (error) {
        setIsError(error.message);
      } finally {
        setIsLoading(false);
      }
    };

    (async () => await fetchItems())();
    // setTimeout(() => {
    //   (async () => await fetchItems())();
    // }, 3000);
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
      <main>
        {isError && <p>{isError}</p>}
        {isLoading && <p>Loading Items</p>}
        {!isError && !isLoading && (
          <Content
            items={items.filter((item) =>
              item.description.toLowerCase().includes(search.toLowerCase())
            )}
            handleCheck={handleCheck}
            deleteTask={deleteTask}
          />
        )}
      </main>

      <Footer length={items.length} />
    </div>
  );
}

export default App;
