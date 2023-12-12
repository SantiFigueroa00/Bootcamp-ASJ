import { Component } from '@angular/core';

@Component({
  selector: 'main-layout',
  templateUrl: './main-layout.component.html',
  styleUrl: './main-layout.component.css',
})
export class MainLayoutComponent {
  texto = 'ESto es un parrafo';
  num = 0;
  bandera =false;
  persona = {
    nombre : "flecha",
    edad : 22
  }

  list =["tomate","lechuga","cebolla"]
  generarAleatorio() {
    this.num = Math.floor(Math.random() * 10);
  }
  operacion(arg0: boolean) {
  arg0 ? this.num++ : this.num--;
  }
}
