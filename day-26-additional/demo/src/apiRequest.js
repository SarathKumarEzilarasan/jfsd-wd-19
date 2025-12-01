const apiRequest = async (url = "", options = null, errMsg = null) => {
  let response = null;
  try {
    response = await fetch(url, options);
    if (!response.ok) {
      throw new Error("Data not found");
    }
    return response;
  } catch (error) {
    return error.message;
  }
};

export default apiRequest;
