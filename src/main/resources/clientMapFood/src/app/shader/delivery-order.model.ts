import { OriginGeolocation } from './origin-geolocation.model';
import { Product } from './product.model';

export class DeliveryOrder {
    public originGeolocation : OriginGeolocation
    public products : Product[] = []
}