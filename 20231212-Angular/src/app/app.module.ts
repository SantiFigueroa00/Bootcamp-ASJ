import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainLayoutComponent } from './components/main-layout/main-layout.component';
import { ListaComponent } from './components/lista/lista.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { NgbdCarouselBasic } from './components/carrousel/carrousel.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    MainLayoutComponent,
    ListaComponent,
    NavBarComponent,
    NgbdCarouselBasic
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
