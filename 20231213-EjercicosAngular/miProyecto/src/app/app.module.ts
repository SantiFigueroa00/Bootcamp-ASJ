import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ButtonModule } from 'primeng/button';
import { MegaMenuModule } from 'primeng/megamenu';
import { MenubarModule } from 'primeng/menubar';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { MainLayoutComponent } from './components/main-layout/main-layout.component';
import { ToDoListComponent } from './components/proyects/to-do-list/to-do-list.component';
import { FormsModule } from '@angular/forms';
import { SimpsonComponent } from './components/proyects/simpson/simpson.component';
import { TableComponent } from './components/proyects/simpson/compSimpson/table/table.component';
import { FormComponent } from './components/proyects/simpson/compSimpson/form/form.component';
import { RickAndMortyComponent } from './components/proyects/rick-and-morty/rick-and-morty.component';
import { DetailComponent } from './components/proyects/rick-and-morty/compRick/detail/detail.component';
import { TableRickComponent } from './components/proyects/rick-and-morty/compRick/table-rick/table-rick.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    MainLayoutComponent,
    ToDoListComponent,
    SimpsonComponent,
    TableComponent,
    FormComponent,
    RickAndMortyComponent,
    DetailComponent,
    TableRickComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ButtonModule,
    MegaMenuModule,
    MenubarModule,
    FormsModule,
    HttpClientModule 
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
