import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Devis } from '../devis';
import { DevisService } from '../devis/devis.service';

@Component({
  selector: 'app-edit-devis',
  templateUrl: './edit-devis.component.html',
  styleUrls: ['./edit-devis.component.css']
})
export class EditDevisComponent implements OnInit {
  

    id: number;
    devis = new Devis();
    showAlert = false;
  
    constructor(private route: ActivatedRoute, private devisService: DevisService) { }
  
    ngOnInit() {
      this.id = this.route.snapshot.params['id'];
      this.devisService.getDevis(this.id).subscribe((response: any) => {
        this.devis = response;
      });
    }
    updateDevis() {
      this.devisService.updateDevis(this.devis).subscribe((response) => {
        this.showAlert = true;
        console.log(response);
      });
    }
    closeAlert() {
      this.showAlert = false;
    }
  
  
  
  }
  
 

  