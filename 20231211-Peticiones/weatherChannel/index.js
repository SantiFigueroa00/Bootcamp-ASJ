let enviar = document.getElementById("enviar");
let input = document.getElementById("input");

enviar.addEventListener("click",()=>cargarCiudad(input.value));


function cargarCiudad(nombre) {
    document.querySelector(".container").style.visibility = "visible";
    let ciudad = document.getElementById("ciudad");
    let temperatura = document.getElementById("temperatura");
    let grados = document.getElementById("grados");
    let wicon = document.getElementById("wicon");
    let descripcion = document.getElementById("descripcion");
    let url = "https://api.openweathermap.org/data/2.5/weather?q=" + nombre +"&appid=fdd533266e28101881f610f2b8f1ebe1"
    fetch(url)
    .then((response) => response.json()) //convertir a JSON
    .then((json) => {
        console.log(json)
        ciudad.textContent = json.name;
        temperatura.innerHTML = json.main.temp + "<sup>°C</sup>";
        grados.textContent = json.name;
        wicon.src= `https://openweathermap.org/img/wn/${json.weather[0].icon}@2x.png`;
        descripcion.textContent = json.weather[0].description;

    })
    .catch((error) => console.log("Ocurrió un error: " + error));
}