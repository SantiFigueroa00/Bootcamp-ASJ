function promedio() {
  let num = parseInt(
    prompt(
      "Ingrese un numero para calcular n el numero triangular y luego su promedio"
    )
  );
  let suma = 0;
  let i = 1;
  while (i <= num) {
    suma += i;
    i++;
  }
  alert(`El promedio es: ${suma / num}`);
}

function contadorPositivos() {
  let contador = 0;
  let num = 0;
  do {
    num = parseInt(
      prompt(
        "Ingrese un numero positivo para contar la cant de positivos ingresador, si quiere terminar ingrese un numero negativo"
      )
    );
    if (num >= 0) contador++;
  } while (num >= 0);
}
