import { Product } from "./products";


export class ProductOrder {
    constructor(p:Product,q:number){
this.product=p;
this.quantity=q;
    }
    product: Product;
    quantity: number;
}
