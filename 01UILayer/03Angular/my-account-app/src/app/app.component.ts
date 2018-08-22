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
  accounts: Array<object> = []
  message: string = ''

  constructor(private http: Http){

  }

  fetchAccount(accNumber: number){
    console.log('Fetching details for account number: ', accNumber)
    this.http.get('http://localhost:8080/07springrestjpa/account/' + accNumber).toPromise()
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

  fetchAllAccount(){
    console.log('Fetching details for account number: ')
    this.http.get('http://localhost:8080/07springrestjpa/accounts/').toPromise()
    .then((res) => res.json())
    .then(data => {
      console.log(data)
      this.accounts = data;
      this.message = ""
    })
    .catch((res)=>{
      console.log(res);
      this.message = "Not such account number present!!"
    })
    
  }
}
