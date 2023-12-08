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
let primerTermino = 0;
let segundoTermino = 0;
let operador
let resultado

for (const btn of botones) {
    btn.addEventListener("click",(e)=>{
        let auxiliar;
        switch (e.target.id) {
          case "limpiar":
            display.value = 0;
            break;
          case "borrar":
            display.value = display.value.slice(0, -1);
            if (display.value == "") {
              display.value = "0";
            }
            break;
          case "cero":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 0;
            } else {
              display.value == "0" ? (display.value = 0) : (display.value += 0);
            }
            break;
          case "uno":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 1;
            } else {
              display.value == "0"
                ? (display.value = 1)
                : (display.value = display.value += 1);
            }
            break;
          case "dos":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 2;
            } else {
              display.value == "0"
                ? (display.value = 2)
                : (display.value = display.value += 2);
            }
            break;
          case "tres":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 3;
            } else {
              display.value == "0"
                ? (display.value = 3)
                : (display.value = display.value += 3);
            }
            break;
          case "cuatro":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 4;
            } else {
              display.value == "0"
                ? (display.value = 4)
                : (display.value = display.value += 4);
            }
            break;
          case "cinco":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 5;
            } else {
              display.value == "0"
                ? (display.value = 5)
                : (display.value = display.value += 5);
            }
            break;
          case "seis":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 6;
            } else {
              display.value == "0"
                ? (display.value = 6)
                : (display.value = display.value += 6);
            }
            break;
          case "siete":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 7;
            } else {
              display.value == "0"
                ? (display.value = 7)
                : (display.value = display.value += 7);
            }
            break;
          case "ocho":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 8;
            } else {
              display.value == "0"
                ? (display.value = 8)
                : (display.value = display.value += 8);
            }
            break;
          case "nueve":
            if (
              ["+", "-", "/", "*"].includes(
                display.value.charAt(display.value.length - 1)
              )
            ) {
              display.value += 9;
            } else {
              display.value == "0"
                ? (display.value = 9)
                : (display.value = display.value += 9);
            }
            break;
          case "suma":
            if (display.value.charAt(display.value.length - 1) != "+") {
              primerTermino = parseFloat(display.value);
              display.value += "+";
              operador = "+";
            }
            break;
          case "resta":
            if (display.value.charAt(display.value.length - 1) != "-") {
              primerTermino = parseFloat(display.value);
              display.value += "-";
              operador = "-";
            }
            break;
          case "division":
            if (display.value.charAt(display.value.length - 1) != "/") {
              primerTermino = parseFloat(display.value);
              console.log(primerTermino)
              display.value += "/";
              operador = "/";
            }
            break;
          case "multi":
            if (display.value.charAt(display.value.length - 1) != "*") {
              primerTermino = parseFloat(display.value);
              display.value += "*";
              operador = "*";
            }
            break;
          case "igual":
            auxiliar = display.value.split(operador);
            segundoTermino = parseFloat(auxiliar[1]);
            switch (operador) {
              case "+":
                resultado = primerTermino + segundoTermino;
                break;
              case "-":
                resultado = primerTermino - segundoTermino;
                break;
              case "*":
                resultado = primerTermino * segundoTermino;
                break;
              case "/":
                resultado = primerTermino / segundoTermino;
                break;
              default:
                console.log("Operador no válido");
            }
            display.value = resultado.toFixed(2);

            break;
          case "decimal":
            display.value += ".";
            break;

          default:
            break;
        }
    })
}