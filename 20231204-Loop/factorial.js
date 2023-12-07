let n = parseInt(prompt("Ingrese un numero para calcular su factorial"));
let resultado = 1
for (let i = 1; i <= n; i++) {
    resultado *= i;
}
console.log(`El factorial de ${n} es ${resultado}`);
