import { Component, OnInit } from '@angular/core';
import { StoreService } from '../shader/store.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Store } from '../shader/store.model';
import { Product } from '../shader/product.model';
import { ShoppingCartService } from '../shopping-cart.service';

@Component({
  selector: 'cmf-store',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.css']
})
export class StoreComponent implements OnInit {

  public products : Product[];

  constructor(
    private route: ActivatedRoute,
    private storeService : StoreService,
    private shoppingCartService : ShoppingCartService) { }

  ngOnInit() {
    this.route.params.subscribe((param:Params) => {
      console.log(param.id);
      this.storeService.getProductByStore("5fd349062ed63a6d9fd58a51feb0f83ba10abbbccd89fb633ade552f3300e858")
      .then(( products: Product[] ) => {
        this.products = products;
        console.log(this.products);
      })
    });
  }

  public addItem(product : Product) : void{
    this.shoppingCartService.addItem(product);
    console.log(product);
  }

  public buy() : void {
    this.shoppingCartService.submit()
    .subscribe((response:any)=>{
      console.log(response);
    });
  }

}
