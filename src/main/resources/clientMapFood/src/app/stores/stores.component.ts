import { Component, OnInit, Input } from '@angular/core';
import { StoreService } from '../shader/store.service';
import { Store } from '../shader/store.model';
import { Cliente } from '../shader/cliente.model';

@Component({
  selector: 'cmf-stores',
  templateUrl: './stores.component.html',
  styleUrls: ['./stores.component.css']
})

export class StoresComponent implements OnInit {

  public stores : Store []

  constructor(private storeService : StoreService) { }

  ngOnInit() {
      this.storeService.getStores()
      .then((stores : Store[]) => {
        this.stores = stores;
      }).catch((param: any) =>{
        console.log(param);
      })
  }

}
