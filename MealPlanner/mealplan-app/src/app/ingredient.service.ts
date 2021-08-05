import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IngredientService {

  constructor(private http:HttpClient){}

  private baseUrl:string = 'http://localhost:8080';
  private ingredientUrl:string = this.baseUrl + '/meal/ingredients/';

  createIngredient(body: IngredientRequest): Observable<Ingredient>{
    let httpOptions = {
      headers: new HttpHeaders({'Content-Type': 'application/json'})
    };
    return this.http.post<Ingredient>(this.ingredientUrl, body, httpOptions);
  }
}

export class IngredientRequest {

  name: string;
  cost: number;
  calories: number;
 

  constructor(ingredientName: string, ingredientCost:number, ingredientCalories: number){
    this.name= ingredientName;
    this.cost = ingredientCost;
    this.calories = ingredientCalories;
  }
}

export interface Ingredient{
  id:string;
  name: string;
  cost: number;
  calories: number;
}