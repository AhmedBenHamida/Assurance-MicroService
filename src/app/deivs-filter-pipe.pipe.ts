import { Pipe, PipeTransform } from '@angular/core';
import { Devis } from './devis';

@Pipe({
  name: 'devisFilterPipe'
})
export class DevisFilterPipePipe implements PipeTransform {

  transform(list: Devis[], searchText:string): any {
    if (!list)
      return [];
    if (!searchText)
      return list;
    searchText = searchText.toLocaleLowerCase();

    list = list.filter(d => {
      return d.dateDevis.toLocaleLowerCase().includes(searchText);
    });
    return list;

  }


}
