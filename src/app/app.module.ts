import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgxPaginationModule } from 'ngx-pagination';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { DevisListComponent } from './devis-list/devis-list.component'
import { DevisService } from './devis/devis.service';
import { RegisterDevisComponent } from './register-devis/register-devis.component';
import { FormsModule } from '@angular/forms';
import { EditDevisComponent } from './edit-devis/edit-devis.component';
import { DevisFilterPipePipe } from './deivs-filter-pipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    DevisListComponent,
    RegisterDevisComponent,
    EditDevisComponent,
    DevisFilterPipePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgxPaginationModule
  ],
  providers: [DevisService],
  bootstrap: [AppComponent]
})
export class AppModule { }
