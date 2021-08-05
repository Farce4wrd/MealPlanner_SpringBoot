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
  currentIngredients: Ingredient[]

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

      
      
    });

    this.ingredients = [ new Ingredient("101", "Rice", 30, 300),
    new Ingredient("102", "Bread", 40, 250),
    new Ingredient("103", "Veggies", 20, 150)];
    this.getCurrentIngredients();
  }

  getCurrentIngredients(){
    this.ingredientService.getIngredients().subscribe(getResult =>{
      console.log(getResult);
      this.currentIngredients = getResult
    });
  }
  

  createIngredient() {
    this.ingredientService.createIngredient( new IngredientRequest(this.currentIngredName, this.currentIngredCost, this.currentIngredCalories)
    ).subscribe(postResult => {
      console.log(postResult)
      this.getCurrentIngredients;

    } );
  
    
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
