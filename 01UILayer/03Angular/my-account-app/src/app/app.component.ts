import { Component } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  account: {id: number, name:string, balance:number}
  message: string = ''

  constructor(private http: Http){

  }

  fetchAccount(accNumber: number){
    console.log('Fetching details for account number: ', accNumber)
    this.http.get('http://localhost:8080/06springrest/account/' + accNumber).toPromise()
    .then((res) => res.json())
    .then(data => {
      console.log(data)
      this.account = data;
      this.message = ""
    })
    .catch((res)=>{
      console.log(res);
      this.message = "Not such account number present!!"
    })
    
  }
}
