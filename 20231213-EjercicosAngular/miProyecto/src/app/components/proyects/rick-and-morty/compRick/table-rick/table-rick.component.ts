import { Component, OnInit } from '@angular/core';
import { RickServiceService } from '../../services/rick-service.service';

@Component({
  selector: 'app-table-rick',
  templateUrl: './table-rick.component.html',
  styleUrl: './table-rick.component.css'
})
export class TableRickComponent implements OnInit {

  constructor (public rickService : RickServiceService){
  }

  dataTable: any =[]
  ngOnInit(): void {
    this.rickService.getDataTable().subscribe((data)=>{
      this.dataTable=data;
      console.log(this.dataTable)
    });
  }
}
