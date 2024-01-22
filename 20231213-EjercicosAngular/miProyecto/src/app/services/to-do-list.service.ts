import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ToDoListService {
  
  
  API_URL = "http://localhost:8080/tasks"
  
  constructor(private http : HttpClient) { }
  
  getTasks(): Observable<any> {
    return this.http.get(this.API_URL);
  }
  
  createTask(newTask: { name: string; description: string; state: boolean; }): Observable<HttpResponse<any>> {
    return this.http.post(this.API_URL,newTask, { observe: 'response', responseType: 'text' as 'json'  });
  }
  
  deleteTask(index: number): Observable<HttpResponse<any>> {
    return this.http.delete(this.API_URL+'/'+index, { observe: 'response', responseType: 'text' as 'json'  });
  }

  editTask(editTask:any): Observable<HttpResponse<any>> {
    return this.http.put(this.API_URL+'/'+editTask.id,editTask, { observe: 'response', responseType: 'text' as 'json'});
  }
  
}
