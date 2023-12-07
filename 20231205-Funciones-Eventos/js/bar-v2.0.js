function carta() {
  alert(`Le presentamos nuestra carta: \n
                1- Gaseosa $1000
                2- Pizza $5000
                3- Café $800
                4- Medialuna $120`);
}
function pedido(cuenta) {
  let pedido = parseInt(
    prompt(`Seleccione el producto que desea pedir \n
                1- Gaseosa $1000
                2- Pizza $5000
                3- Café $800
                4- Medialuna $120
                0- Salir`)
  );
  switch (pedido) {
    case 1:
      cuenta += 1000;
      break;
    case 2:
      cuenta += 5000;
      break;
    case 3:
      cuenta += 800;
      break;
    case 4:
      cuenta += 120;
      break;
    case 0:
      break;
    default:
      alert("Ingrese una opcion valida");
      break;
  }
  return cuenta;
}

function chiste() {
  let opcion = parseInt(prompt(`Ingrese un numero del 1 al 3`));
  switch (opcion) {
    case 1:
        alert(
            "Cual es el colmo de un profesor Full Stack, ahogarse navegando en internet"
          );
      break;
    case 2:
        alert(
            "Te queria contar un chiste de programacion, pero !si lo entenderian"
          );
      break;
    case 3:
        alert(
            "¿Por qué los programadores prefieren los gatos? Porque son expertos en el desarrollo de software... ¡siempre encuentran el ratón!"
          );
      break;
    default:
        alert(
            "Ingrese una opcion valida"
          );
      break;
  }
  
}

function pago(cuenta) {
    if (cuenta == 0) {
        alert("Aun no pidio productos.");
        bandera = false;
      } else {
        propina = parseInt(
          prompt(
            `El total de su cuenta es ${cuenta}. Indique cuanto deja de propina: `
          )
        );
        cuenta += propina;
        alert(`Pago realizado - Comprobante no valido como factura
                  $${cuenta}`);
        return bandera= true;
      }

    
}
function bar(nombreUsuario) {
  let bandera = false;
  let cuenta = 0;
  let propina = 0;

  while (!bandera) {
    let opcion = parseInt(
      prompt(`Bienvenido ${nombreUsuario} que opcion desearia realizar \n
        1- Saludar
        2- Pedir Carta
        3- Pedir Producto
        4- Pedir un chiste
        5- Pedir la cuenta 
        0- Salir`)
    );

    switch (opcion) {
      case 1:
        alert(`Le enviaste un saludo al mozo virtual`);
        break;
      case 2:
        carta();
        break;
      case 3:
        cuenta = pedido(cuenta);
        break;
      case 4:
        chiste();
        break;
      case 5:
        bandera = pago(cuenta);
        break;
      case 0:
        cuenta == 0
          ? (bandera = true)
          : alert("Ey, ey, ey no te podes ir sin pagar");
        break;

      default:
        alert("Ingrese una opcion valida");
        break;
    }
  }
}

bar(prompt("Por favor, ingrese su nombre de usuario"));
