import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Video } from '../models/Video';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { read } from '@popperjs/core';

@Injectable({
  providedIn: 'root'
})
export class VideoService {
  
  

  API_URL= 'http://localhost:8080/videos';

  constructor(private http : HttpClient) { }
 

  createVideo(newVideo: Video) : Observable<HttpResponse<any>>{
    return this.http.post(this.API_URL,newVideo,{ observe: 'response', responseType: 'text' as 'json'  });
  }

  dislikeVideo(id: number) {
    throw new Error('Method not implemented.');
  }
  undislikeVideo(id: number) {
    throw new Error('Method not implemented.');
  }
  likeVideo(id: number) {
    throw new Error('Method not implemented.');
  }
  unlikeVideo(id: number) {
    throw new Error('Method not implemented.');
  }

  getVideoById(videoId: number):Observable<any> {
    return this.http.get(this.API_URL+'/'+videoId);
  }
  deleteVideo(videoId: number): Observable<any> {
    return this.http.delete(this.API_URL+'/'+videoId,{responseType: 'text' });
  }
  getVideos() :Observable<any>{
    return this.http.get(this.API_URL);
  }

  getVideosByCategory(category: string): Observable<any> {
    const url = `${this.API_URL}/byCategory/${category}`;
    return this.http.get(url);
  }

  updateVideo(editVideo: any) :Observable<any>{
    return this.http.put(this.API_URL+'/'+editVideo.id,editVideo,{ responseType: 'text' as 'json' });
  }

}
