function parImpar() {
  let num = parseInt(
    prompt("Ingrese un numero para verificar si es par o impar")
  );
  let residuo = num % 2;
  switch (residuo) {
    case 0:
      alert(`${numero} es un número par.`);
      break;
    case 1:
      alert(`${numero} es un número impar.`);
      break;
    default:
      break;
  }
}

function traductor() {
  let opcion = prompt(
    'Ingrese alguna de las sig palabras para ver su traduccion en ingles: "casa","perro","pelota","arbol","genio",'
  ).toLowerCase;

  switch (opcion) {
    case "casa":
      alert("La palabra en ingles es home");
      break;
    case "perro":
      alert("La palabra en ingles es dog");
      break;
    case "pelota":
      alert("La palabra en ingles es ball");
      break;
    case "arbol":
      alert("La palabra en ingles es tree");
      break;
    case "genio":
      alert("La palabra en ingles es genius");
      break;

    default:
      alert("La palabra ingresada es incorrecta");
      break;
  }
}

function valoracion() {
  let opcion = prompt(
    'Valore la pelicula que acaba de ver "Muy mala","Mala","Mediocre","Buena","Muy buena"'
  );

  switch (opcion) {
    case "Muy mala":
      alert(`Calificaste la pelicula como ${opcion}, lo lamentamos muchisimo`);
      break;
    case "Mala":
      alert(`Calificaste la pelicula como ${opcion}, lo lamentamos mucho`);
      break;
    case "Mediocre":
      alert(`Calificaste la pelicula como ${opcion}, una pena`);
      break;
    case "Buena":
      alert(`Calificaste la pelicula como ${opcion}, nos alegramos`);
      break;
    case "Muy buena":
      alert(`Calificaste la pelicula como ${opcion}, estamos re contentos`);
      break;

    default:
      alert("Ingresaste un valor invalido");
      break;
  }
  alert("Gracias por su visita");
}


