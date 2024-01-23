import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Video } from '../../models/Video';
import { VideoService } from '../../services/video.service';
import { catchError } from 'rxjs';

@Component({
  selector: 'app-video-list',
  templateUrl: './video-list.component.html',
  styleUrl: './video-list.component.css'
})
export class VideoListComponent {
  videos: Video[]=[];
  categoryFilter: string = '';
  editVideo:Video={
    url: '',
    category: '',
    title: '',
    description: '',
    views: 0,
    likes: 0,
    dislikes: 0,
    rating: 0,
    id: 0
  };


  constructor(private videoService: VideoService, private router: Router) { }

  ngOnInit(): void {
    this.loadVideos();
  }

  loadVideos() {
    this.videoService.getVideos().pipe(catchError(error=>{
      console.error('Error al cargar el video:', error)
      throw error;
    }))
    .subscribe(
      data => {
        this.videos = data;
      }
    );
  }

  goToForm() {
    this.router.navigate(['']);
  }

  viewDetails(videoId: number) {
    this.videoService.getVideoById(videoId).subscribe(res=>{
      this.editVideo = res;
      this.editVideo.views++;
      this.videoService.updateVideo(this.editVideo).subscribe(res=>{
        console.log(res);
        this.router.navigate(['/video-details', videoId]);
      });
    })
  }

  deleteVideo(videoId: number) {
    this.videoService.deleteVideo(videoId).pipe(catchError(error=>{
      console.error('Error al eliminar el video:', error)
      throw error;
    }))
    .subscribe(
      () => {
        console.log('Video eliminado exitosamente.');
        this.loadVideos();
      }
    );
  }

  applyCategoryFilter() {
    // Filtra los videos por categoría
    if (this.categoryFilter.trim() === '') {
      // Si el campo de búsqueda está vacío, carga todos los videos
      this.loadVideos();
    } else {
      // Filtra por categoría
      this.videoService.getVideosByCategory(this.categoryFilter).pipe(catchError(error => {
        console.error('Error al filtrar los videos por categoría:', error);
        throw error;
      }))
        .subscribe(
          data => {
            this.videos = data;
          }
        );
    }
  }
}
