import { Component } from '@angular/core';

@Component({
  selector: 'app-to-do-list',
  templateUrl: './to-do-list.component.html',
  styleUrl: './to-do-list.component.css'
})
export class ToDoListComponent {
  nameTask = "";
  list: { name: string, date: string }[] = [];
  completedTasks: { name: string, date: string }[] = [];
  deletedList: { name: string, date: string }[] = [];
  fecha: string = "";
  
  addTask() {
    this.list.push({name: this.nameTask,date: this.fecha});
    this.nameTask="";
    this.fecha ="";
  }
  removeTask(index: number) {
    if (index >= 0 && index < this.list.length) {
      const deletedTask = this.list.splice(index, 1)[0];
      this.deletedList.push(deletedTask);
    }
  }
  toggleActive() {
    
  }

}


