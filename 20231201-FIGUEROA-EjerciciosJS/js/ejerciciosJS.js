function inputText() {
  let texto = prompt("Ingresar un texto breve");
  alert("resultado: " + texto);
  return texto;
}

function edad() {
  let edad = prompt("Indique cuál es su edad");
  edad = edad * 365;
  alert("resultado: " + edad);
  return edad;
}

function suma() {
  let num1 = prompt("Ingrese el valor del primer numero");
  let num2 = prompt("Ingrese el valor del segundo numero");
  let resultado = num1 + num2;

  alert("resultado: " + resultado);

  return resultado;
}

function restoSnacks() {
  let edad = prompt("Ingrese su edad: ");
  let maxEdad = prompt("Ingrese su maxima edad: ");
  let snackFAv = prompt("Ingrese su snack favorito: ");
  let snackDiarios = parseInt(
    prompt("Estime la cant de snacks que comerá por día: ")
  );

  let snacksRestantes = (maxEdad - edad) * 365 * snackDiarios;

  alert(
    "Necesitarás " +
      snacksRestantes +
      " snacks para que te alcancen hasta los " +
      edadMaxima +
      " años."
  );

  let precioPorSnack = prompt(
    "Ingresa el precio por unidad de tu snack favorito:"
  );

  let gastoTotal = snacksRestantes * precioPorSnack;

  alert(
    "Vas a gastar $" +
      gastoTotal.toFixed(2) +
      " en " +
      snackFAv +
      " el resto de tu vida."
  );

  return;
}

function calcularPresupuestoComida() {
  let diasDeViaje = prompt("Ingresa la cantidad de días que estarás de viaje:");

  let presupuestoMaximo = prompt(
    "Ingresa tu presupuesto máximo para el viaje:"
  );

  var comida;

  var comidasTotales = prompt(
    "Estima cuántas comidas tendrás en todo el viaje:"
  );

  comida = presupuestoMaximo / comidasTotales;

  alert(
    "Puedes gastar $" +
      comida.toFixed(2) +
      " en cada comida para que te alcance el presupuesto durante los " +
      diasDeViaje +
      " días de viaje."
  );
  return;
}

function obtenerMensaje() {
  let nombre = "Gabriela";
  let profesion = "programadora";

  let mensaje = `${nombre} es ${profesion}`;
  alert(mensaje);
  return mensaje;
}

function calcularMontoTotal() {
  let precioArticulo = prompt("Ingresa el precio del artículo:");
  let cantidad = prompt("Ingresa la cantidad que llevarás:");

  precioArticulo = parseFloat(precioArticulo);
  cantidad = parseInt(cantidad);

  let montoTotal = precioArticulo * cantidad;

  let mensaje = `El monto total a abonar es: $${montoTotal.toFixed(2)}`;
  alert(mensaje);
  return mensaje;
}

// inputText();
// edad();
// suma();
// restoSnacks();
// calcularPresupuestoComida();
// obtenerMensaje();
// calcularMontoTotal();