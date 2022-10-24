import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Devis } from '../devis';

@Injectable({
  providedIn: 'root'
})
export class DevisService {
  baseUrl = environment.API_BASE_URL;
  
  constructor(private http: HttpClient) { }
  createDevis(devis:Devis) {
    return this.http.post(this.baseUrl+ "/SpringMVC/servlet/add",devis)
  }
  getDevisList() {
    return this.http.get(this.baseUrl + "/SpringMVC/servlet/retrieve-all-devis");
  }
  getDevis(id:number) {
    return this.http.get(this.baseUrl + "/SpringMVC/servlet/retrieve-devis/" + id);
  }
  deleteDevis(id:number) {
    return this.http.delete(this.baseUrl + "/SpringMVC/servlet/remove-devis/" + id);
  }
  updateDevis(devis: Devis) {
    return this.http.put(this.baseUrl + "/SpringMVC/servlet/modify-devis", devis);
  }
}
