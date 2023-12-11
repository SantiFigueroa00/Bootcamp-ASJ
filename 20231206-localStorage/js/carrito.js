//Aqui voy a guardar todos los productos

let listaCarrito = JSON.parse(localStorage.getItem("listaCarrito")) || [];
let total=0;

cargarInicial();

function cargaTotal(total) {
    let totalActualizado = document.querySelector("#totalActualizado");
    totalActualizado.innerHTML = `<li
    class="list-group-item d-flex justify-content-between align-items-center border-0 px-0 pb-0">
    Products
    <span>$${total.toFixed(2)}</span>
</li>
<li class="list-group-item d-flex justify-content-between align-items-center px-0">
    Shipping
    <span>Gratis</span>
</li>
<li
    class="list-group-item d-flex justify-content-between align-items-center border-0 px-0 mb-3">
    <div>
        <strong>Total amount</strong>
        <strong>
            <p class="mb-0">(including VAT)</p>
        </strong>
    </div>
    <span><strong>$${total.toFixed(2)}</strong></span>
</li>`
}

function cargarInicial() {
    total=0;
    if (listaCarrito.length > 0) {
        //dibujar las filas de la tabla
        listaCarrito.forEach((itemProd) => {
            crearFila(itemProd);
            total += (itemProd.cantidad * itemProd.price);
        });
    }
    cargaTotal(total);
}

function crearFila(producto) {
  let grillaProd = document.querySelector("#grillaProd");
  //Creo las cards de los producto
  grillaProd.innerHTML += `<div class="row">
  <div class="col-lg-3 col-md-12 mb-4 mb-lg-0">
      <!-- Image -->
      <div class="bg-image hover-overlay hover-zoom ripple rounded"
          data-mdb-ripple-color="light">
          <img src="${producto.image}"
              class="w-100" alt="Blue Jeans Jacket" />
          <a href="#!">
              <div class="mask" style="background-color: rgba(251, 251, 251, 0.2)">
              </div>
          </a>
      </div>
      <!-- Image -->
  </div>

  <div class="col-lg-5 col-md-6 mb-4 mb-lg-0">
      <!-- Data -->
      <p><strong>${producto.name}</strong></p>
      <button type="button" class="btn btn-primary btn-sm me-1 mb-2"
          data-mdb-toggle="tooltip" title="Remove item" onclick='borrarProd("${producto.id}")'>
          <i class="fas fa-trash"></i>
      </button>
      <!-- Data -->
  </div>

  <div class="col-lg-4 col-md-6 mb-4 mb-lg-0">
      <!-- Quantity -->
      <div class="d-flex mb-4" style="max-width: 300px">
          <button class="btn btn-primary px-3 me-2"
              onclick="this.parentNode.querySelector('input[type=number]').stepDown(); actualizarTotal('${producto.id}')">
              <i class="fas fa-minus"></i>
          </button>

          <div class="form-outline">
              <input id="form${producto.id}" min="0" name="quantity" value="${producto.cantidad}" type="number"
                  class="form-control" oninput='actualizarTotal("${producto.id}")'/>
          </div>

          <button class="btn btn-primary px-3 ms-2"
              onclick="this.parentNode.querySelector('input[type=number]').stepUp(); actualizarTotal('${producto.id}')">
              <i class="fas fa-plus"></i>
          </button>
      </div>
      <!-- Quantity -->

      <!-- Price -->
      <p class="text-start text-md-center">
          <strong>${producto.price}</strong>
      </p>
      <!-- Price -->
  </div>
</div>
<hr class="my-4" />`;
}

function guardarProdsEnLocalStorage() {
    localStorage.setItem("listaCarrito", JSON.stringify(listaCarrito));
}

function borrarProd(id) {
      //Buscar el producto en el arreglo y borrarla
      let copiaListaProd = listaCarrito.filter(
        (itemProd) => itemProd.id != id
      );
      listaCarrito = copiaListaProd;
      //Actualizar el localstorage
      guardarProdsEnLocalStorage();
      //Actualizar la tabla
      borrarTabla();
      cargarInicial();
};

function borrarTabla() {
  let grillaProd = document.querySelector("#grillaProd");
  grillaProd.innerHTML = "";
}

function actualizarTotal(id) {
    total=0;
    let input = document.getElementById("form"+id)
    let posicionProd = listaCarrito.findIndex((prod)=> id == prod.id )
    listaCarrito[posicionProd].cantidad = input.value;
    if (listaCarrito.length > 0) {
        listaCarrito.forEach((itemProd) => {
            total += (itemProd.cantidad * itemProd.price);
        });
    }
    cargaTotal(total);
}

function pagado() {
    console.log(listaCarrito.length > 0)
    if (listaCarrito.length > 0) {
        listaCarrito = [];
        localStorage.removeItem('listaCarrito');
        borrarTabla();
        cargarInicial();
        alert("Su compra se realizó con éxito. Que la disfrutes!");
    } else {
        alert("Debe añadir elementos a su carrito antes de realizar el pago");
    }   
}