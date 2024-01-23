import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-video-form',
  templateUrl: './video-form.component.html',
  styleUrls: ['./video-form.component.css']
})
export class VideoFormComponent implements OnInit {
  videoForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private router: Router) {
    this.videoForm = this.formBuilder.group({
      url: ['', [Validators.required]],
      category: ['', [Validators.required]],
      title: ['', [Validators.required]],
      description: [''],
      views: [0],
      likes: [0],
      dislikes: [0],
      rating: [0]
    });
   }

  ngOnInit(): void {
    
  }

  onSubmit() {
    // Aquí puedes enviar los datos al backend
    // y luego redirigir a la vista de la tabla de videos
    console.log('Formulario enviado:', this.videoForm.value);
    if (this.videoForm.valid) {
      this.router.navigate(['/videos']);
    }
    // Simulación de redirección a la vista de la tabla de videos
  }
}