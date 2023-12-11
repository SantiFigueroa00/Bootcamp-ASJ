let enviar = document.getElementById("enviar");
let ciudad = document.getElementById("ciudad");

enviar.addEventListener("click",cargarCiudad(ciudad.value));


function cargarCiudad(ciudad) {
    let url = "https://api.openweathermap.org/data/2.5/weather?q=" + ciudad +"&appid=fdd533266e28101881f610f2b8f1ebe1"
    
}