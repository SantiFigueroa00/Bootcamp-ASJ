import {products} from './productos.js'

let listaCarrito = JSON.parse(localStorage.getItem("listaCarrito")) || [];

let parametro = window.location.search
console.log (parametro)

let urlParametro =new URLSearchParams(parametro)
console.log (urlParametro.get('codigo'))

let listaProductos = products;
let productoBuscada= listaProductos.find ((productos)=> productos.id == urlParametro.get('codigo'))

let seccionDetalle = document.querySelector('#seccionDetalle');
seccionDetalle.innerHTML = `<article>
<img
  src="${productoBuscada.image}"
  alt="iamagen de bote de aceite"
/>
</article>
<article>
  <h2>${productoBuscada.name}</h2>
  <p class="precio"><strong>$</strong> ${productoBuscada.price}</p>
  <div class="contenedorCol">
      <div class="colores" id="colBlanco"></div>
      <div class="colores" id="colRojo"></div>
      <div class="colores" id="colVerde"></div>
      <div class="colores" id="colNegro"></div>
  </div>
  <div class="d-flex my-4" style="max-width: 300px">
          <button class="btn btn-primary px-3 me-2"
              onclick="this.parentNode.querySelector('input[type=number]').stepDown()">
              <i class="fas fa-minus"></i>
          </button>

          <div class="form-outline">
              <input id="form1" min="0" name="quantity" value="1" type="number"
                  class="form-control" />
          </div>

          <button class="btn btn-primary px-3 ms-2"
              onclick="this.parentNode.querySelector('input[type=number]').stepUp()">
              <i class="fas fa-plus"></i>
          </button>
      </div>
      <Button class="btn btn-primary" onclick="agregarCarrito()">AGREGAR AL CARRITO</Button>
  <hr>
  <p>${productoBuscada.description}</p>
  <hr>
  <p>30 dias de garantia</p>
  <p>Envio gratis</p>

</article>`;



window.agregarCarrito =function() {
  let cantidad = document.getElementById("form1")
  //Creo un nuevo objeto Producto
  let nuevoProd = productoBuscada;
  nuevoProd.cantidad = cantidad.value;

  console.log(nuevoProd);
  //Añado al arreglo el nuevo Producto
  listaCarrito.push(nuevoProd);
  localStorage.setItem("listaCarrito", JSON.stringify(listaCarrito));

  window.location.href = window.location.origin+'/20231206-localStorage/pages/carrito.html';
}