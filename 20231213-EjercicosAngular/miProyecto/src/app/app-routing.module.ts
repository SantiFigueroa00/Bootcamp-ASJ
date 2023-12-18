import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ToDoListComponent } from './components/proyects/to-do-list/to-do-list.component';
import { SimpsonComponent } from './components/proyects/simpson/simpson.component';

const routes: Routes = [
  {path: 'toDoList', component: ToDoListComponent},
  {path: 'simpson', component: SimpsonComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
