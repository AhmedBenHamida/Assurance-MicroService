import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DevisListComponent } from './devis-list/devis-list.component';
import { EditDevisComponent } from './edit-devis/edit-devis.component';
import { RegisterDevisComponent } from './register-devis/register-devis.component';

const routes: Routes = [
  {
    path: 'devis-list',
    component: DevisListComponent
  },
  {
    path: "register-devis",
    component: RegisterDevisComponent
  }, {
    path: 'edit-devis/:id',
    component: EditDevisComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
