import Item from "./Item";

const ItemList = ({ items, handleCheck, deleteTask }) => {
  return (
    <ul>
      {items.map((item) => (
        <Item
          item={item}
          handleCheck={handleCheck}
          deleteTask={deleteTask}
          key={item.id}
        />
      ))}
    </ul>
  );
};

export default ItemList;
