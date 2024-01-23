import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Video } from '../../models/Video';
import { VideoService } from '../../services/video.service';

@Component({
  selector: 'app-video-list',
  templateUrl: './video-list.component.html',
  styleUrl: './video-list.component.css'
})
export class VideoListComponent {
  videos: Video[]=[{id: 1, title: 'hola', description: 'soy una pelicual',category: 'accion',url: 'http://www.youtube.com/watch',rating: 1,views:0,dislikes:0,likes:0}];

  constructor(private videoService: VideoService, private router: Router) { }

  ngOnInit(): void {
    // Llama al servicio para obtener la lista de videos
    // this.loadVideos();
    console.log(this.videos)
  }

  // loadVideos() {
  //   this.videoService.getVideos().subscribe(
  //     data => {
  //       this.videos = data;
  //     },
  //     error => {
  //       console.error('Error al cargar los videos:', error);
  //     }
  //   );
  // }

  goToForm() {
    // Redirige al formulario para agregar más videos
    this.router.navigate(['']);
  }

  viewDetails(videoId: number) {
    // Redirige al detalle del video con el ID proporcionado
    this.router.navigate(['/video-details', videoId]);
  }

  // deleteVideo(videoId: number) {
  //   // Llama al servicio para eliminar el video con el ID proporcionado
  //   this.videoService.deleteVideo(videoId).subscribe(
  //     () => {
  //       console.log('Video eliminado exitosamente.');
  //       // Recarga la lista de videos después de eliminar
  //       this.loadVideos();
  //     },
  //     error => {
  //       console.error('Error al eliminar el video:', error);
  //     }
  //   );
  // }
}
