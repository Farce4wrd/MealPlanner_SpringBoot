import { Component } from '@angular/core';
import {FormControl, FormGroup, ControlContainer} from '@angular/forms';
import {HttpClient} from '@angular/common/http';
import {IngredientService, IngredientRequest} from './ingredient.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  title = 'mealplan-app';

  constructor(private ingredientService: IngredientService){}

  ingredients!: Ingredient[]
  ingredientSearchForm: FormGroup;
  currentIngredName: string;
  currentIngredCost: number;
  currentIngredCalories: number;
  currentCaloricLimit: number;

  ngOnInit(){
    this.ingredientSearchForm = new FormGroup({
      ingredientName: new FormControl(''),
      ingredientCost: new FormControl(''),
      ingredientCalories: new FormControl('')

    });

    this.ingredientSearchForm.valueChanges.subscribe(form =>{
        this.currentIngredName = form.ingredientName;
        this.currentIngredCost = form.ingredientCost;
        this.currentIngredCalories = form.ingredientCalories;

        // console.log(this.currentIngredName);
        // console.log(this.currentIngredCost);
        // console.log(this.currentIngredCalories);


        
        // console.log(this.currentIngredName);
        // console.log(this.currentIngredCost);
        // console.log(this.currentIngredCalories);

      
    });

    this.ingredients = [ new Ingredient("101", "Rice", 30, 300),
    new Ingredient("102", "Bread", 40, 250),
    new Ingredient("103", "Veggies", 20, 150)];
  }

  createIngredient() {
    this.ingredientService.createIngredient( new IngredientRequest(this.currentIngredName, this.currentIngredCost, this.currentIngredCalories)
    ).subscribe(postResult => console.log(postResult));
  
    console.log("koko da:" + this.currentIngredName);
    console.log("koko da:" + this.currentIngredCost);
    console.log("koko da:" + this.currentIngredCalories);
  
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
