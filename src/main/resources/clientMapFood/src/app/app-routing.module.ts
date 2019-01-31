import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClienteComponent } from './cliente/cliente.component';
import { StoresComponent } from './stores/stores.component';
import { StoreComponent } from './store/store.component';


const routes: Routes = [
  { path: '', component: ClienteComponent},
  { path: 'stores', component: StoresComponent},
  { path: 'stores/:id', component: StoreComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
