let n = parseInt(prompt("Ingrese un numero para crear una piramide de altura segun el numero"));
let piram = ""
for (let i = 1; i <= n; i++) {
    for (let j = 0; j < i; j++) {
        piram += "*";
    }
    piram += "\n";
}
for (let i = n-1; i > 0; i--) {
    for (let j = 0; j < i; j++) {
        piram += "*";
    }
    piram += "\n";
}

console.log(piram);
