import { useRef } from "react";
import { FaPlus } from "react-icons/fa";

const AddItem = ({ newItem, setNewItem, handleSubmit }) => {
  const inputRef = useRef();
  return (
    <form className="addForm" onSubmit={handleSubmit}>
      <label htmlFor="addItem">Add Item</label>
      <input
        autoFocus
        id="addItem"
        type="text"
        placeholder="Add Item"
        required
        value={newItem}
        onChange={(e) => setNewItem(e.target.value)}
        ref={inputRef}
      ></input>
      <button type="Submit" onClick={() => inputRef.current.focus()}>
        <FaPlus />
      </button>
    </form>
  );
};

export default AddItem;
