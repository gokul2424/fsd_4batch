import { Component, OnInit, Input } from '@angular/core';

@Component({
    selector: 'cts-card',
    template: `
    <div class="card" style="width: 18rem;">
    <img class="card-img-top" src="http://via.placeholder.com/100x80" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">{{course}}</h5>
      <p class="card-text">{{summary}}</p>
      <my-badge caption="Votes" count="0"></my-badge>
    </div>
  </div>
    
    `
})
export class CardComponent implements OnInit {

    @Input('caption')course :string = "Angular"
    @Input('summary')summary :string = ""

    constructor() { }

    ngOnInit() {

    }

}