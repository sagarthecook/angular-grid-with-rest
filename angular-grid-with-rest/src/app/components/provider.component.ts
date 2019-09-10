import { Component } from '@angular/core';
import { ProvierService } from 'src/app/services/provider.service';
@Component({
  selector: 'prividers-list',
  templateUrl : 'provider.component.html'
})
export class ProviderListComponent {
  providersList: any;
  constructor(private provierService: ProvierService) {
    this.loadServices();
  }

  // TO LOAD PROVIDERS SERVICE
  loadServices() {
    // tslint:disable-next-line:prefer-const
    let response;
    this.provierService.getProvidersServices().subscribe(
      (responseData: any) => {
        response = responseData;
      },
      (error) => {
        console.log(error);
      },
      () => {
        this.providersList = response.data;
      }
    );
  }
}
