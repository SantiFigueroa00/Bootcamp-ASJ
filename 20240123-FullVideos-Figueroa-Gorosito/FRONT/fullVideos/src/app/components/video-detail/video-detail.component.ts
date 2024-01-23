import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Video } from '../../models/Video';
import { VideoService } from '../../services/video.service';


@Component({
  selector: 'app-video-detail',
  templateUrl: './video-detail.component.html',
  styleUrls: ['./video-detail.component.css']
})
export class VideoDetailComponent implements OnInit {
  video: Video= {
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
  liked: boolean = false;
  disliked: boolean = false;
  safeUrl: SafeResourceUrl;
  stars: number[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  constructor(private route: ActivatedRoute, private videoService: VideoService, private sanitizer: DomSanitizer) {
    this.safeUrl = this.sanitizer.bypassSecurityTrustResourceUrl(this.video.url);
  }


  ngOnInit(): void {
    // Obtiene el ID del video de la URL
    const videoIdString = this.route.snapshot.paramMap.get('id');
    const videoId = videoIdString ? parseInt(videoIdString) : null;

    if (videoId !== null && !isNaN(videoId)) {
      this.videoService.getVideoById(videoId).subscribe(
        data => {
          this.video = data;
          console.log(this.video);
          this.safeUrl = this.sanitizer.bypassSecurityTrustResourceUrl(this.video.url);
        }
      );
    } else {
      console.error('ID de video no válido.');
    }
  }

  toggleLike() {
    // Implementa la lógica para dar/retirar like al video
    if (this.liked) {
      // Llama al servicio para retirar el like
      this.liked = false;
      this.video.likes--;
      this.videoService.updateVideo(this.video).subscribe();
    } else {
      // Llama al servicio para dar like al video
      this.liked = true;
      this.video.likes++;
      
      // Si ya se había dado dislike, retirarlo
      if (this.disliked) {
        this.toggleDislike();
      }
      this.videoService.updateVideo(this.video).subscribe();
    }
  }

  toggleDislike() {
    // Implementa la lógica para dar/retirar dislike al video
    if (this.disliked) {
      // Llama al servicio para retirar el dislike
      this.disliked = false;
      this.video.dislikes--;
      this.videoService.updateVideo(this.video).subscribe();
    } else {
      // Llama al servicio para dar dislike al video
      this.disliked = true;
      this.video.dislikes++;
      
      // Si ya se había dado like, retirarlo
      if (this.liked) {
        this.toggleLike();
      }
      this.videoService.updateVideo(this.video).subscribe();
    }
  }
}