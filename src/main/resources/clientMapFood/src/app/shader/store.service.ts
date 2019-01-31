import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { URL_API } from '../app.api';
import { Store } from './store.model';
import { Cliente } from './cliente.model';
import { Product } from './product.model';

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  public cliente : Cliente

  constructor(private http: HttpClient) { }

  public getStores() : Promise<Store[]> {
    return this.http.get(`${URL_API}stores/${this.cliente.latitude}/${this.cliente.longitude}`)
            .toPromise()
            .then((resp: any) => resp)
  }

  public getProductByStore(id : String) : Promise<Product[]>{
    return this.http.get(`${URL_API}productByStore/${id}`)
            .toPromise()
            .then((resp: any) => resp)
  }
}
