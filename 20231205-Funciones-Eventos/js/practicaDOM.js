let btn = document.getElementById("btn");
let nombre = document.getElementById("nombre");
let apellido = document.getElementById("apellido");
let main = document.getElementById("miMain");
console.log(main)
btn.addEventListener("click", () => {
    
    main.innerHTML+=`<h1>${nombre.value}</h1>
    <h2 class="text-danger">${apellido.value}</h2>`;
});
