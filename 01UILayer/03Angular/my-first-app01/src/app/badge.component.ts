import { Component, OnInit, Input } from '@angular/core';

@Component({
    selector: 'my-badge',
    template: `
    <button (click)="incrementCount()" type="button" class="btn btn-primary">
        {{caption}} <span class="badge badge-light">{{count}}</span>
    </button>
    
    `
})
export class BadgeComponent implements OnInit {

    @Input('caption') caption: string = "Default"
    @Input('count') count: number = 0;

    incrementCount(){
        console.log('Button is clicked!!')
        this.count++;
    }

    constructor() { }

    ngOnInit() { 

    }

}