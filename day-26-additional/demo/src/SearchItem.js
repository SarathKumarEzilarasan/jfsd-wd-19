const SearchItem = ({ search, setSearchItem }) => {
  return (
    <form className="searchForm" onSubmit={(e) => e.preventDefault()}>
      <label htmlFor="search">Search</label>
      <input
        id="search"
        type="text"
        placeholder="Search Items"
        value={search}
        onChange={(e) => setSearchItem(e.target.value)}
      ></input>
    </form>
  );
};

export default SearchItem;
