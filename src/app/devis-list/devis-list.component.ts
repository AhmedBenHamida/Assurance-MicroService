import { Component, OnInit } from '@angular/core';
import { Devis } from '../devis';
import { DevisService } from '../devis/devis.service';

@Component({
  selector: 'app-devis-list',
  templateUrl: './devis-list.component.html',
  styleUrls: ['./devis-list.component.css']
})
export class DevisListComponent implements OnInit {
devis : Devis [];
searchText :"";

  constructor(private devisService:DevisService ) { }

  ngOnInit() {
    this.devisService.getDevisList().subscribe((response: any) => {
      this.devis = response;
    });
  }
    deleteDevis(id: number) {
      this.devisService.deleteDevis(id).subscribe((response) => {
        console.log(response);
        this.devis = this.devis.filter(d => {
          return d.id != id;
        });
      });
    }
  }