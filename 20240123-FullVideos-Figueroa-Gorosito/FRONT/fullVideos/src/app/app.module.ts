import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { VideoFormComponent } from './components/video-form/video-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { VideoListComponent } from './components/video-list/video-list.component';
import { VideoDetailComponent } from './components/video-detail/video-detail.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    VideoFormComponent,
    VideoListComponent,
    VideoDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
