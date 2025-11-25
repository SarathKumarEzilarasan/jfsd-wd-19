try {
  console.log(add());
} catch (error) {
  if (error instanceof TypeError) {
  } else if (error instanceof RangeError) {
  }
} finally {
  console.log("always");
}
