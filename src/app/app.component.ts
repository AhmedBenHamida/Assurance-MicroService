import { Component } from '@angular/core';
import { Devis } from './devis';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'msFrontProject';
  public searchText: Devis['id'];
}
