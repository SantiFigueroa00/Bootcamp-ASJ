import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ToDoListComponent } from './components/proyects/to-do-list/to-do-list.component';
import { SimpsonComponent } from './components/proyects/simpson/simpson.component';
import { RickAndMortyComponent } from './components/proyects/rick-and-morty/rick-and-morty.component';
import { TableRickComponent } from './components/proyects/rick-and-morty/compRick/table-rick/table-rick.component';
import { DetailComponent } from './components/proyects/rick-and-morty/compRick/detail/detail.component';

const routes: Routes = [
  {path: 'toDoList', component: ToDoListComponent},
  {path: 'simpson', component: SimpsonComponent},
  {path: 'rickMorty', component: RickAndMortyComponent,
children:[
  {path: '', component: TableRickComponent},
  {path: 'detail/:id', component: DetailComponent}, 
]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
