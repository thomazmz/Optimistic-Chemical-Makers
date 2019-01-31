import { Component, OnInit } from '@angular/core';
import { Cliente } from '../shader/cliente.model';
import { Router } from '@angular/router';
import { StoreService } from '../shader/store.service';

@Component({
  selector: 'cmf-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {

  public clientes: Cliente[] = [
    {id:1, longitude: "-51.228496",latitude : "-30.03742831"},
    {id:2 ,longitude: "-51.228496" ,latitude:	"-30.03742831"},
    {id:3 ,longitude: "-51.136677" ,latitude:	"-30.07824631"},
    {id:4 ,longitude: "-51.18467499" ,latitude:	"-30.09396132"},
    {id:5 ,longitude: "-51.18663487" ,latitude:	"-30.06447218"},
    {id:6 ,longitude: "-51.217361" ,latitude:	"-30.05994085"},
    {id:7 ,longitude: "-51.18160481" ,latitude:	"-30.07361846"},
    {id:8 ,longitude: "-51.17686927" ,latitude:	"-30.06730583"},
    {id:9 ,longitude: "-51.18289546" ,latitude:	"-30.07997904"}
  ];

  constructor(private router: Router,private storeService : StoreService) { }

  ngOnInit() {

  }

  public setCliente(cliente : Cliente):void{
    this.storeService.cliente = cliente;
    this.router.navigate(['/stores']);
  }
}
