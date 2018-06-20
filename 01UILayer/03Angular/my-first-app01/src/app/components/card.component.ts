import { Component, OnInit, Input } from '@angular/core';

@Component({
    selector: 'cts-card',
    template: `
    <div class="card" style="width: 18rem;">
    <img class="card-img-top" src="http://via.placeholder.com/100x180" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">{{course}}</h5>
      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
      <my-badge caption="Votes" count="0"></my-badge>
    </div>
  </div>
    
    `
})
export class CardComponent implements OnInit {

    @Input('caption')course :string = "Angular"

    constructor() { }

    ngOnInit() {

    }

}