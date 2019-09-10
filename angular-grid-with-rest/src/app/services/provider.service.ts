import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { Constant } from '../constant/constant';
import { Injectable } from '@angular/core';
// THIS SERVICE IS USED FOR PROVIDERS GET DATA
@Injectable({
  providedIn: 'root'
})
export class ProvierService {
  constructor(private http: HttpClient) {
  }

  public getProvidersServices(): Observable<any> {
    return this.http.get(Constant.PROVIDERS_SERVICE);
  }
}
