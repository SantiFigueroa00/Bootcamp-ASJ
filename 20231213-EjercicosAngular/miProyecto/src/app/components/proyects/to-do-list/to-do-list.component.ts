import { Component, OnInit } from '@angular/core';
import { ToDoListService } from '../../../services/to-do-list.service';

@Component({
  selector: 'app-to-do-list',
  templateUrl: './to-do-list.component.html',
  styleUrl: './to-do-list.component.css'
})
export class ToDoListComponent implements OnInit {
  nameTask = "";
  list: {id:number, name: string, description: string, state:boolean }[] = [];
  completedTasks: { name: string, date: string }[] = [];
  deletedList: {id:number, name: string, description: string, state:boolean }[] = [];
  description: string = "";
  
  constructor(private todoListService: ToDoListService){}

  ngOnInit(): void {

    this.todoListService.getTasks().subscribe(tasks => {
      this.list=[];
      this.deletedList=[];
      tasks.forEach((t: {id:number, name: string, description: string, state:boolean }) => {
        if(!t.state){
          this.list.push(t);
        }else{
          this.deletedList.push(t);
        }
      });
    });
  }

  addTask() {
    const newTask={name: this.nameTask, description:this.description, state:false}

    this.todoListService.createTask(newTask).subscribe((res)=>{
      console.log(res.body);
      this.ngOnInit();
    })
    this.nameTask="";
    this.description ="";
  }

  removeTask(index: number) {
    this.todoListService.deleteTask(index).subscribe((res)=>{
      console.log(res.body);
      this.ngOnInit();
    })
  }

  changeTask(editTask: any) {
    editTask.state = !editTask.state;
    console.log(editTask.state);
    this.todoListService.editTask(editTask).subscribe((res)=>{
      console.log(res.body);
      this.ngOnInit();
    })
  }


  toggleActive() {
    
  }

}


