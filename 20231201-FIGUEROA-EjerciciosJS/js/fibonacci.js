/* function fibo(num) {
    let fib = [0,1];

    for (let i = 2; i < num; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib;
}

let cantidadVeces = prompt("Ingresa la cantidad de veces para la secuencia de Fibonacci:");
cantidadVeces = parseInt(cantidadVeces);
let resultado = fibo(cantidadVeces);
console.log(resultado); */

function fibonacci(n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

function mostrarArray(cantidadVeces) {
    let resultado = [];
    for (let i = 0; i < cantidadVeces; i++) {
        resultado.push(fibonacci(i));
    }
    return resultado;
}

let cantidadVeces = prompt("Ingresa la cantidad de veces para la secuencia de Fibonacci:");
cantidadVeces = parseInt(cantidadVeces);
let array = mostrarArray(cantidadVeces);
console.log(array);