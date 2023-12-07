/* let btn1 = document.getElementById("uno");
let btn2 = document.getElementById("dos");
let btn3 = document.getElementById("tres");
let btn4 = document.getElementById("cuatro");
let btn5 = document.getElementById("cinco");
let btn6 = document.getElementById("seis");
let btn7 = document.getElementById("siete");
let btn8 = document.getElementById("ocho");
let btn9 = document.getElementById("nueve");
let btn0 = document.getElementById("cero");
let btnPunto = document.getElementById("decimal");
let btnSuma = document.getElementById("suma");
let btnResta = document.getElementById("resta");
let btnDivision = document.getElementById("division");
let btnMulti = document.getElementById("multi");*/
let display = document.getElementById("display") 

/* btn1.addEventListener("click",()=>{
    if(display.value==0){
        display.value++;
    }else{
        display.value=display.value*10+1;
    }
})
 */

/* document.addEventListener('DOMContentLoaded', function () {
    let botones = {};

    // Iterar sobre los números del 0 al 9 y el botón decimal
    for (let i = 0; i <= 9; i++) {
        console.log(i.toString())
        let id = (i === 0) ? "cero" : i.toString();
        botones["btn" + id] = document.getElementById(id);

        // Verificar si el elemento se encontró antes de intentar agregar un event listener
        if (botones["btn" + id]) {
            botones["btn" + id].addEventListener('click', function () {
                console.log(`Haz clic en el botón ${id}`);
                // Aquí puedes realizar las acciones que desees al hacer clic en el botón
            });
        } else {
            console.error(`Elemento con ID ${id} no encontrado.`);
        }
    }
}); */

let botones = document.getElementsByTagName("button");

for (const btn of botones) {
    btn.addEventListener("click",(e)=>{
        console.log(btn.contains.toString);
        if(display.value==0){
            display.value++;
        }else{
            display.value=display.value*10+parseInt(e.target.id);
        }
    })
}