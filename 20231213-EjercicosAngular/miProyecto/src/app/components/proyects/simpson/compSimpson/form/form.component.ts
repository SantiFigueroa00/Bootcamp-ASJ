import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrl: './form.component.css'
})
export class FormComponent {
  @Output() obj: EventEmitter<object> ;

  constructor(){
    this.obj = new EventEmitter<object>();
  }

send(nameRec: string,profRec: string,urlRec: string) {
this.obj.emit({name:nameRec , prof:profRec, url:urlRec});
}

}
