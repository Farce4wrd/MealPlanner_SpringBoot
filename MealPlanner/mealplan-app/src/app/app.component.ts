import { Component } from '@angular/core';
import {FormControl, FormGroup, ControlContainer} from '@angular/forms';
import {HttpClient} from '@angular/common/http';
import {IngredientService} from './ingredient.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  title = 'mealplan-app';

  constructor(private IngredientService: IngredientService){}

  ingredients!: Ingredient[]
  ingredientSearchForm: FormGroup;
  currentIngredName: string;
  currentIngredCost: number;
  currentIngredCalories: number;

  ngOnInit(){
    this.ingredientSearchForm = new FormGroup({
      ingredName: new FormControl(''),
      ingredCost: new FormControl(''),
      ingredCalories: new FormControl('')
    });

    this.ingredients = [ new Ingredient("101", "Rice", 30, 300),
    new Ingredient("102", "Bread", 40, 250),
    new Ingredient("103", "Veggies", 20, 150)];
  }

}

export class Ingredient{
  id: string;
  name: string;
  cost: number;
  calories: number;

  constructor(id: string, name: string, cost: number, calories: number){
    this.id = id;
    this.name = name;
    this.cost = cost;
    this.calories = calories;
  }

}
