import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { VideoService } from '../../services/video.service';
import { Video } from '../../models/Video';

@Component({
  selector: 'app-video-form',
  templateUrl: './video-form.component.html',
  styleUrls: ['./video-form.component.css']
})
export class VideoFormComponent implements OnInit {
  videoForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private router: Router, public videoService: VideoService) {
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
    console.log('Formulario enviado:', this.videoForm.value);
    if (this.videoForm.valid) {
      const video :Video=  this.videoForm.value;
      console.log(video);
      this.videoService.createVideo(video).subscribe(res=>{
        console.log(res);
        this.router.navigate(['/videos']);
      });
    }
  }
}