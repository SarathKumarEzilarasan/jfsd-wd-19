import ItemList from "./ItemList";

const Content = ({ items, handleCheck, deleteTask }) => {
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

  return (
    <main>
      {items.length ? (
        <ItemList
          items={items}
          handleCheck={handleCheck}
          deleteTask={deleteTask}
        />
      ) : (
        <p style={{ marginTop: "25px" }}>List is Empty</p>
      )}
    </main>
  );
};

export default Content;
