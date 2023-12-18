import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RickServiceService } from '../../services/rick-service.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrl: './detail.component.css'
})
export class DetailComponent implements OnInit {
  constructor(private ruta: ActivatedRoute, private rickService : RickServiceService){}
  detail:any={}
  ngOnInit(): void {
    const parametroURL= this.ruta.snapshot.params['id'];
    this.rickService.getCharacter(parametroURL).subscribe((data)=>{
      this.detail=data;
      console.log(this.detail)
    });
  }
}


