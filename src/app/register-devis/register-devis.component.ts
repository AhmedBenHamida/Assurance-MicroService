import { Component, OnInit } from '@angular/core';
import { Devis } from '../devis';
import { DevisService } from '../devis/devis.service';

@Component({
  selector: 'app-register-devis',
  templateUrl: './register-devis.component.html',
  styleUrls: ['./register-devis.component.css']
})
export class RegisterDevisComponent implements OnInit {
  devis = new Devis ( ) ;
  showAlert = false;

  constructor(private devisService:DevisService) { }

  ngOnInit(): void {
  }
  closeAlert() {
    this.showAlert = false;
  }
  saveDevis() {
    this.devisService.createDevis(this.devis).subscribe((response) => {
      console.log(response);
      this.showAlert = true;
      this.devis = new Devis();
    });
  }
  }


