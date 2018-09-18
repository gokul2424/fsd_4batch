import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class CategoryService {
    baseUrl: string = "http://localhost:8080/"
    
    constructor(private http: Http) { }

    fetchCategory(id:number): Promise<any>{
        return this.http.get(this.baseUrl + 'category/'+ id)
        .toPromise().then(res=>res.json())
    }
    
  
}