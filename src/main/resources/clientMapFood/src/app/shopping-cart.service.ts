import { Injectable } from '@angular/core';
import { Product } from './shader/product.model';
import { DeliveryOrder } from './shader/delivery-order.model';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { URL_API } from './app.api';
import { map } from 'rxjs/operators';
import { StoreService } from './shader/store.service';
import { OriginGeolocation } from './shader/origin-geolocation.model';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'my-auth-token'
  })
};

@Injectable({
  providedIn: 'root'
})
export class ShoppingCartService {

  public deliveryOrdey : DeliveryOrder = new DeliveryOrder();

  constructor(private http: HttpClient,
              private storeService : StoreService) {}

  public addItem(product : Product) : void {
    if(this.deliveryOrdey.originGeolocation === undefined) {
      this.deliveryOrdey.originGeolocation = new OriginGeolocation();
      this.deliveryOrdey.originGeolocation.latitude = this.storeService.cliente.latitude;
      this.deliveryOrdey.originGeolocation.longitude = this.storeService.cliente.longitude;
    }
    if( this.deliveryOrdey.products == undefined)
      this.deliveryOrdey.products = [];
    this.deliveryOrdey.products.push(product);
  }

  public submit() : Observable<any> {
    console.log(JSON.stringify(this.deliveryOrdey));
      return this.http.post(
          `${URL_API}create`,
          JSON.stringify(this.deliveryOrdey),
          httpOptions
      ).pipe(
          map((response:any) => { return response}  )
      );
  }
}
