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
  video?: Video= {id: 1, title: 'hola', description: 'soy una pelicual',category: 'accion',url: 'https://www.youtube.com/embed/HUR_LwnEasU?si=hvxA_8CnXYZ4LCyw',rating: 1,views:0,dislikes:0,likes:0};
  liked: boolean = false;
  disliked: boolean = false;

  constructor(private route: ActivatedRoute, private videoService: VideoService, public sanitizer: DomSanitizer) { }


  ngOnInit(): void {
    // Obtiene el ID del video de la URL
    const videoId = this.route.snapshot.paramMap.get('id');

    // Llama al servicio para obtener los detalles del video
    // this.videoService.getVideoById(videoId).subscribe(
    //   data => {
    //     this.video = data;
    //   },
    //   error => {
    //     console.error('Error al cargar los detalles del video:', error);
    //   }
    // );
  }

  // toggleLike() {
  //   // Implementa la lógica para dar/retirar like al video
  //   if (this.liked) {
  //     // Llama al servicio para retirar el like
  //     this.videoService.unlikeVideo(this.video.id).subscribe(
  //       () => {
  //         this.liked = false;
  //         this.video.likes--;
  //       },
  //       error => {
  //         console.error('Error al retirar el like:', error);
  //       }
  //     );
  //   } else {
  //     // Llama al servicio para dar like al video
  //     this.videoService.likeVideo(this.video.id).subscribe(
  //       () => {
  //         this.liked = true;
  //         this.video.likes++;
          
  //         // Si ya se había dado dislike, retirarlo
  //         if (this.disliked) {
  //           this.toggleDislike();
  //         }
  //       },
  //       error => {
  //         console.error('Error al dar like:', error);
  //       }
  //     );
  //   }
  // }

  // toggleDislike() {
  //   // Implementa la lógica para dar/retirar dislike al video
  //   if (this.disliked) {
  //     // Llama al servicio para retirar el dislike
  //     this.videoService.undislikeVideo(this.video.id).subscribe(
  //       () => {
  //         this.disliked = false;
  //         this.video.dislikes--;
  //       },
  //       error => {
  //         console.error('Error al retirar el dislike:', error);
  //       }
  //     );
  //   } else {
  //     // Llama al servicio para dar dislike al video
  //     this.videoService.dislikeVideo(this.video.id).subscribe(
  //       () => {
  //         this.disliked = true;
  //         this.video.dislikes++;
          
  //         // Si ya se había dado like, retirarlo
  //         if (this.liked) {
  //           this.toggleLike();
  //         }
  //       },
  //       error => {
  //         console.error('Error al dar dislike:', error);
  //       }
  //     );
  //   }
  // }
}