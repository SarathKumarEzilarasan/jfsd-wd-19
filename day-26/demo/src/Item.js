import { FaTrash } from "react-icons/fa";

const Item = ({ item, handleCheck, deleteTask }) => {
  return (
    <li className="item">
      <input
        type="checkbox"
        checked={item.checked}
        onChange={() => handleCheck(item.id)}
      ></input>
      <label style={item.checked ? { textDecoration: "line-through" } : null}>
        {item.description}
      </label>
      <FaTrash role="button" onClick={() => deleteTask(item.id)} />
    </li>
  );
};

export default Item;
