import {products} from './productos.js'

cargarInicial();

function cargarInicial() {
    if (products.length > 0) {
        //dibujar las filas de la tabla
        products.forEach((itemProd) => {
            crearFila(itemProd);
        });
    }
}

function crearFila(producto) {
  let grillaProd = document.querySelector("#grillaProd");
  //Creo las cards de los producto
  grillaProd.innerHTML += `<div class="itemProducto">
  <a href="#" onclick="verDetalle('${producto.id}')">
    <div class="imgSuperpuesta">
      <img
        src="https://www.shutterstock.com/image-vector/shopping-cart-icon-vector-600nw-764989759.jpg"
        alt="imagen de carrito"
      />
    </div>
    <img
      src="${producto.image}"
      alt="iamagen de bote de aceite"
    />
    <h2>${producto.name}</h2>
  </a>
  <p class="descripcion">
    ${producto.description}
  </p>
  <p class="precio"><strong>$</strong> ${producto.price}</p>
</div>`;
}


window.verDetalle = function(codigo){
    window.location.href = window.location.origin+'/20231206-localStorage/pages/detalleProducto.html?codigo='+codigo;
}