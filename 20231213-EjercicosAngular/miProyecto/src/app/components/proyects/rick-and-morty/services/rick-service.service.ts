import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RickServiceService {

  constructor(private http: HttpClient) { }

  getDataTable(){
    return this.http.get('https://rickandmortyapi.com/api/character/?page=1');
  }

  getCharacter(id:number){
    return this.http.get('https://rickandmortyapi.com/api/character/'+id);
  }

}
