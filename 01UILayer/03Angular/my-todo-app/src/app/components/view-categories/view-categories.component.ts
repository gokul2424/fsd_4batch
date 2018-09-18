import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../../services/category.service';

@Component({
  selector: 'app-view-categories',
  templateUrl: './view-categories.component.html',
  styleUrls: ['./view-categories.component.css']
})
export class ViewCategoriesComponent implements OnInit {

  categoryName: string = ''
  constructor(private categoryService: CategoryService) { }

  fetchCategory(id: number){
    this.categoryService.fetchCategory(id)
    .then((data)=>{
      console.log(data);
      this.categoryName = data.name
    })
  }

  ngOnInit() {
  }

}
