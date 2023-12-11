let btnActualizar = document.getElementById("btnActualizar");
let info = document.getElementById("info");

btnActualizar.addEventListener("click", () => {
  //FETCH
  fetch(`https://api.chucknorris.io/jokes/random`)
    .then((response) => response.json()) //convertir a JSON
    .then((json) => {
        console.log(json)
      info.innerText = json.value;
    })
    .catch((error) => console.log("Ocurrió un error: " + error));
});
