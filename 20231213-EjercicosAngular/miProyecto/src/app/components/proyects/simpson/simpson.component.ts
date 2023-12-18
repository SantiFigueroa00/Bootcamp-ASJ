import { Component } from '@angular/core';
import { Console } from 'console';

@Component({
  selector: 'app-simpson',
  templateUrl: './simpson.component.html',
  styleUrl: './simpson.component.css'
})
export class SimpsonComponent {
  
  objChild:{}[] = [];
  recObj(obj: object) {
    this.objChild.push(obj);
    console.log("hola")
  }
}
