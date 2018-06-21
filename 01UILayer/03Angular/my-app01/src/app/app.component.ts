import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';

  paras: Array<object> = []

  constructor(private http: Http){
    console.log('DI is still happening.. not right place for ajax')

  }
  ngOnInit(){
    console.log('right place to do ajax')
    this.http.get("http://localhost:4400/assets/test.json")
    .toPromise()
    .then(res=>res.json())
    .then((response)=>{
      console.log(response)
      this.paras = response
    }
    )
  }
}
