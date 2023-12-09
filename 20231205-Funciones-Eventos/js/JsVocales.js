let frase = document.getElementById("input");
let btn = document.getElementById("btn");
let divFrase = document.getElementById("divFrase");
function eliminarVocales(texto) {
  var textoSinVocales = "";
  for (var i = 0; i < texto.length; i++) {
    var caracter = texto.charAt(i);
    if ("aeiouAEIOU".indexOf(caracter) !== -1) {
      textoSinVocales += "_"; // Reemplazar vocal por guión bajo
    } else {
      textoSinVocales += caracter; // Mantener el carácter original
    }
  }
  return textoSinVocales;
}

btn.addEventListener("click", () => {
  let texto = frase.value;
  let resultado = eliminarVocales(texto);
  divFrase.innerHTML = `<h1 class="text-primary">${resultado}</h1>`;
});
